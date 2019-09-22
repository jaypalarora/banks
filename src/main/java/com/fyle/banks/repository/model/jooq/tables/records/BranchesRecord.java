/*
 * This file is generated by jOOQ.
 */
package com.fyle.banks.repository.model.jooq.tables.records;


import com.fyle.banks.repository.model.jooq.tables.Branches;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BranchesRecord extends UpdatableRecordImpl<BranchesRecord> implements Record7<String, Long, String, String, String, String, String> {

    private static final long serialVersionUID = 1580718668;

    /**
     * Setter for <code>public.branches.ifsc</code>.
     */
    public void setIfsc(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.branches.ifsc</code>.
     */
    public String getIfsc() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.branches.bank_id</code>.
     */
    public void setBankId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.branches.bank_id</code>.
     */
    public Long getBankId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.branches.branch</code>.
     */
    public void setBranch(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.branches.branch</code>.
     */
    public String getBranch() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.branches.address</code>.
     */
    public void setAddress(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.branches.address</code>.
     */
    public String getAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.branches.city</code>.
     */
    public void setCity(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.branches.city</code>.
     */
    public String getCity() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.branches.district</code>.
     */
    public void setDistrict(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.branches.district</code>.
     */
    public String getDistrict() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.branches.state</code>.
     */
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.branches.state</code>.
     */
    public String getState() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Branches.BRANCHES.IFSC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Branches.BRANCHES.BANK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Branches.BRANCHES.BRANCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Branches.BRANCHES.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Branches.BRANCHES.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Branches.BRANCHES.DISTRICT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Branches.BRANCHES.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getIfsc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getBankId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getBranch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDistrict();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getIfsc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getBankId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBranch();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDistrict();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BranchesRecord value1(String value) {
        setIfsc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BranchesRecord value2(Long value) {
        setBankId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BranchesRecord value3(String value) {
        setBranch(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BranchesRecord value4(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BranchesRecord value5(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BranchesRecord value6(String value) {
        setDistrict(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BranchesRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BranchesRecord values(String value1, Long value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BranchesRecord
     */
    public BranchesRecord() {
        super(Branches.BRANCHES);
    }

    /**
     * Create a detached, initialised BranchesRecord
     */
    public BranchesRecord(String ifsc, Long bankId, String branch, String address, String city, String district, String state) {
        super(Branches.BRANCHES);

        set(0, ifsc);
        set(1, bankId);
        set(2, branch);
        set(3, address);
        set(4, city);
        set(5, district);
        set(6, state);
    }
}
