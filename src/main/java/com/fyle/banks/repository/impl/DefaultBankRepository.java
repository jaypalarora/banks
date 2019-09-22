package com.fyle.banks.repository.impl;


import static com.fyle.banks.repository.model.jooq.tables.BankBranches.BANK_BRANCHES;

import java.util.List;
import java.util.stream.Collectors;

import com.fyle.banks.dto.BankDTO;
import com.fyle.banks.dto.BranchDTO;
import com.fyle.banks.repository.BankRepository;
import com.fyle.banks.repository.model.jooq.tables.records.BankBranchesRecord;
import org.apache.commons.lang3.StringUtils;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.SelectConditionStep;
import org.jooq.SelectJoinStep;
import org.jooq.SelectWhereStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class DefaultBankRepository implements BankRepository
{

  @Autowired
  private DSLContext dslContext;


  @Override
  public BankDTO search(final String ifsc, final String bankName, final String city)
  {
    final SelectWhereStep<BankBranchesRecord> selectClause = dslContext.selectFrom(BANK_BRANCHES);
    addWhereClause(selectClause, ifsc, bankName, city);

    final List<BranchDTO> branches = selectClause
                                 .fetchStreamInto(BranchDTO.class)
                                 .collect(Collectors.toList());

    return BankDTO.builder()
                  .branches(branches)
                  .branchCount(getCount(ifsc, bankName, city))
                  .build();
  }

  private int getCount(final String ifsc, final String bankName, final String city)
  {
    final SelectJoinStep<Record1<Integer>> countClause = dslContext.selectCount().from(BANK_BRANCHES);
    addWhereClause(countClause, ifsc, bankName, city);
    return countClause.fetchOne().value1();
  }

  private SelectConditionStep<? extends Record> addWhereClause(final SelectWhereStep<? extends Record> selectClause,
                                                                 final String ifsc, final String bankName, final String city)
  {
    SelectConditionStep<? extends Record> whereClause;
    if (StringUtils.isNotEmpty(ifsc)) {
      whereClause = selectClause
                      .where(BANK_BRANCHES.IFSC.eq(ifsc));
    }
    else {
      whereClause = selectClause.where( BANK_BRANCHES.BANK_NAME.eq(bankName)
                                                               .and(BANK_BRANCHES.CITY.eq(city)) );
    }

    return whereClause;
  }


}
