/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.PageOwner;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PageOwnerRecord extends TableRecordImpl<PageOwnerRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 655766468;

    /**
     * Setter for <code>demodb.page_owner.pageID</code>.
     */
    public void setPageid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.page_owner.pageID</code>.
     */
    public Integer getPageid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>demodb.page_owner.ownerID</code>.
     */
    public void setOwnerid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.page_owner.ownerID</code>.
     */
    public String getOwnerid() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PageOwner.PAGE_OWNER.PAGEID;
    }

    @Override
    public Field<String> field2() {
        return PageOwner.PAGE_OWNER.OWNERID;
    }

    @Override
    public Integer component1() {
        return getPageid();
    }

    @Override
    public String component2() {
        return getOwnerid();
    }

    @Override
    public Integer value1() {
        return getPageid();
    }

    @Override
    public String value2() {
        return getOwnerid();
    }

    @Override
    public PageOwnerRecord value1(Integer value) {
        setPageid(value);
        return this;
    }

    @Override
    public PageOwnerRecord value2(String value) {
        setOwnerid(value);
        return this;
    }

    @Override
    public PageOwnerRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PageOwnerRecord
     */
    public PageOwnerRecord() {
        super(PageOwner.PAGE_OWNER);
    }

    /**
     * Create a detached, initialised PageOwnerRecord
     */
    public PageOwnerRecord(Integer pageid, String ownerid) {
        super(PageOwner.PAGE_OWNER);

        set(0, pageid);
        set(1, ownerid);
    }
}