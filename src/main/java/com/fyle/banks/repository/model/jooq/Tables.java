/*
 * This file is generated by jOOQ.
 */
package com.fyle.banks.repository.model.jooq;


import com.fyle.banks.repository.model.jooq.tables.BankBranches;
import com.fyle.banks.repository.model.jooq.tables.Banks;
import com.fyle.banks.repository.model.jooq.tables.Branches;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.bank_branches</code>.
     */
    public static final BankBranches BANK_BRANCHES = com.fyle.banks.repository.model.jooq.tables.BankBranches.BANK_BRANCHES;

    /**
     * The table <code>public.banks</code>.
     */
    public static final Banks BANKS = com.fyle.banks.repository.model.jooq.tables.Banks.BANKS;

    /**
     * The table <code>public.branches</code>.
     */
    public static final Branches BRANCHES = com.fyle.banks.repository.model.jooq.tables.Branches.BRANCHES;
}
