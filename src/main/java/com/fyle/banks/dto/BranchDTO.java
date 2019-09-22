package com.fyle.banks.dto;


import lombok.Data;


@Data
public class BranchDTO
{
  private String ifsc;
  private long bankId;
  private String branch;
  private String address;
  private String city;
  private String district;
  private String state;

}
