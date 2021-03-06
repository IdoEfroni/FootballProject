/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.Admins;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminsRecord extends UpdatableRecordImpl<AdminsRecord> implements Record2<String, Boolean> {

    private static final long serialVersionUID = 992908651;

    /**
     * Setter for <code>demodb.admins.adminID</code>.
     */
    public void setAdminid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.admins.adminID</code>.
     */
    public String getAdminid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>demodb.admins.approved</code>.
     */
    public void setApproved(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.admins.approved</code>.
     */
    public Boolean getApproved() {
        return (Boolean) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Boolean> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, Boolean> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Admins.ADMINS.ADMINID;
    }

    @Override
    public Field<Boolean> field2() {
        return Admins.ADMINS.APPROVED;
    }

    @Override
    public String component1() {
        return getAdminid();
    }

    @Override
    public Boolean component2() {
        return getApproved();
    }

    @Override
    public String value1() {
        return getAdminid();
    }

    @Override
    public Boolean value2() {
        return getApproved();
    }

    @Override
    public AdminsRecord value1(String value) {
        setAdminid(value);
        return this;
    }

    @Override
    public AdminsRecord value2(Boolean value) {
        setApproved(value);
        return this;
    }

    @Override
    public AdminsRecord values(String value1, Boolean value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminsRecord
     */
    public AdminsRecord() {
        super(Admins.ADMINS);
    }

    /**
     * Create a detached, initialised AdminsRecord
     */
    public AdminsRecord(String adminid, Boolean approved) {
        super(Admins.ADMINS);

        set(0, adminid);
        set(1, approved);
    }
}
