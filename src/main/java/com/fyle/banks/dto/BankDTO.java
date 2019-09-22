package com.fyle.banks.dto;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BankDTO
{
  private long id;
  private String name;
  private List<BranchDTO> branches;
  private int branchCount;
}
