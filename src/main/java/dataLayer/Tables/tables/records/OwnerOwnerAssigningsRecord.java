/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.OwnerOwnerAssignings;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OwnerOwnerAssigningsRecord extends TableRecordImpl<OwnerOwnerAssigningsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1684239353;

    /**
     * Setter for <code>demodb.owner_owner_assignings.ownerID</code>.
     */
    public void setOwnerid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.owner_owner_assignings.ownerID</code>.
     */
    public String getOwnerid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>demodb.owner_owner_assignings.teamID</code>.
     */
    public void setTeamid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.owner_owner_assignings.teamID</code>.
     */
    public String getTeamid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>demodb.owner_owner_assignings.assigneeID</code>.
     */
    public void setAssigneeid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>demodb.owner_owner_assignings.assigneeID</code>.
     */
    public String getAssigneeid() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return OwnerOwnerAssignings.OWNER_OWNER_ASSIGNINGS.OWNERID;
    }

    @Override
    public Field<String> field2() {
        return OwnerOwnerAssignings.OWNER_OWNER_ASSIGNINGS.TEAMID;
    }

    @Override
    public Field<String> field3() {
        return OwnerOwnerAssignings.OWNER_OWNER_ASSIGNINGS.ASSIGNEEID;
    }

    @Override
    public String component1() {
        return getOwnerid();
    }

    @Override
    public String component2() {
        return getTeamid();
    }

    @Override
    public String component3() {
        return getAssigneeid();
    }

    @Override
    public String value1() {
        return getOwnerid();
    }

    @Override
    public String value2() {
        return getTeamid();
    }

    @Override
    public String value3() {
        return getAssigneeid();
    }

    @Override
    public OwnerOwnerAssigningsRecord value1(String value) {
        setOwnerid(value);
        return this;
    }

    @Override
    public OwnerOwnerAssigningsRecord value2(String value) {
        setTeamid(value);
        return this;
    }

    @Override
    public OwnerOwnerAssigningsRecord value3(String value) {
        setAssigneeid(value);
        return this;
    }

    @Override
    public OwnerOwnerAssigningsRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OwnerOwnerAssigningsRecord
     */
    public OwnerOwnerAssigningsRecord() {
        super(OwnerOwnerAssignings.OWNER_OWNER_ASSIGNINGS);
    }

    /**
     * Create a detached, initialised OwnerOwnerAssigningsRecord
     */
    public OwnerOwnerAssigningsRecord(String ownerid, String teamid, String assigneeid) {
        super(OwnerOwnerAssignings.OWNER_OWNER_ASSIGNINGS);

        set(0, ownerid);
        set(1, teamid);
        set(2, assigneeid);
    }
}
