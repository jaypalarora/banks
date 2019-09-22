package com.fyle.banks.service;


import com.fyle.banks.dto.BankDTO;


public interface BankService
{
  BankDTO search(String ifsc, String bankName, String city);
}
