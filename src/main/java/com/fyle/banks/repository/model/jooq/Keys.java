/*
 * This file is generated by jOOQ.
 */
package com.fyle.banks.repository.model.jooq;


import com.fyle.banks.repository.model.jooq.tables.Banks;
import com.fyle.banks.repository.model.jooq.tables.Branches;
import com.fyle.banks.repository.model.jooq.tables.records.BanksRecord;
import com.fyle.banks.repository.model.jooq.tables.records.BranchesRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BanksRecord> BANKS_ID_PKEY = UniqueKeys0.BANKS_ID_PKEY;
    public static final UniqueKey<BranchesRecord> BRANCHES_IFSC_PKEY = UniqueKeys0.BRANCHES_IFSC_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BranchesRecord, BanksRecord> BRANCHES__BRANCHES_BANKS_FKEY = ForeignKeys0.BRANCHES__BRANCHES_BANKS_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<BanksRecord> BANKS_ID_PKEY = Internal.createUniqueKey(Banks.BANKS, "banks_id_pkey", Banks.BANKS.ID);
        public static final UniqueKey<BranchesRecord> BRANCHES_IFSC_PKEY = Internal.createUniqueKey(Branches.BRANCHES, "branches_ifsc_pkey", Branches.BRANCHES.IFSC);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<BranchesRecord, BanksRecord> BRANCHES__BRANCHES_BANKS_FKEY = Internal.createForeignKey(com.fyle.banks.repository.model.jooq.Keys.BANKS_ID_PKEY, Branches.BRANCHES, "branches__branches_banks_fkey", Branches.BRANCHES.BANK_ID);
    }
}
