/*
 * This file is generated by jOOQ.
 */
package com.fyle.banks.repository.model.jooq;


import com.fyle.banks.repository.model.jooq.tables.BankBranches;
import com.fyle.banks.repository.model.jooq.tables.Banks;
import com.fyle.banks.repository.model.jooq.tables.Branches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1898745960;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.bank_branches</code>.
     */
    public final BankBranches BANK_BRANCHES = com.fyle.banks.repository.model.jooq.tables.BankBranches.BANK_BRANCHES;

    /**
     * The table <code>public.banks</code>.
     */
    public final Banks BANKS = com.fyle.banks.repository.model.jooq.tables.Banks.BANKS;

    /**
     * The table <code>public.branches</code>.
     */
    public final Branches BRANCHES = com.fyle.banks.repository.model.jooq.tables.Branches.BRANCHES;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            BankBranches.BANK_BRANCHES,
            Banks.BANKS,
            Branches.BRANCHES);
    }
}