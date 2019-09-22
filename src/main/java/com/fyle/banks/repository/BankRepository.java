package com.fyle.banks.repository;


import com.fyle.banks.dto.BankDTO;


public interface BankRepository
{
  BankDTO search(String ifsc, String bankName, String city);
}
