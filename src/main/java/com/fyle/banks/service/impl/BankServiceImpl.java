package com.fyle.banks.service.impl;


import static org.apache.commons.lang3.StringUtils.isAllEmpty;
import static org.apache.commons.lang3.StringUtils.isAnyEmpty;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNoneEmpty;

import com.fyle.banks.dto.BankDTO;
import com.fyle.banks.exception.ApiException;
import com.fyle.banks.repository.BankRepository;
import com.fyle.banks.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankServiceImpl implements BankService
{
  
  @Autowired
  private BankRepository bankRepository;
  

  @Override
  public BankDTO search(final String ifsc, final String bankName, final String city)
  {
    validate(ifsc, bankName, city);

    return bankRepository.search(ifsc, bankName, city);
  }

  private void validate(final String ifsc, final String bankName, final String city)
  {
    if (isAllEmpty(ifsc, bankName, city)) {
      throw new ApiException("Please provide a search parameter");
    }
    else if (isBlank(ifsc) && isAnyEmpty(bankName, city)) {
      throw new ApiException("Please provide both bank name and city");
    }
    else if (isNoneEmpty(ifsc, bankName, city)) {
      throw new ApiException("Please provide either ifsc or both bank name and city");
    }
  }
}
