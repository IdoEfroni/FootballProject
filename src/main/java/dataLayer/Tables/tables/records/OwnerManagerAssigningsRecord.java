/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.OwnerManagerAssignings;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OwnerManagerAssigningsRecord extends TableRecordImpl<OwnerManagerAssigningsRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -870853613;

    /**
     * Setter for <code>demodb.owner_manager_assignings.ownerID</code>.
     */
    public void setOwnerid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.owner_manager_assignings.ownerID</code>.
     */
    public String getOwnerid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>demodb.owner_manager_assignings.teamID</code>.
     */
    public void setTeamid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.owner_manager_assignings.teamID</code>.
     */
    public String getTeamid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>demodb.owner_manager_assignings.teamManagerID</code>.
     */
    public void setTeammanagerid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>demodb.owner_manager_assignings.teamManagerID</code>.
     */
    public String getTeammanagerid() {
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
        return OwnerManagerAssignings.OWNER_MANAGER_ASSIGNINGS.OWNERID;
    }

    @Override
    public Field<String> field2() {
        return OwnerManagerAssignings.OWNER_MANAGER_ASSIGNINGS.TEAMID;
    }

    @Override
    public Field<String> field3() {
        return OwnerManagerAssignings.OWNER_MANAGER_ASSIGNINGS.TEAMMANAGERID;
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
        return getTeammanagerid();
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
        return getTeammanagerid();
    }

    @Override
    public OwnerManagerAssigningsRecord value1(String value) {
        setOwnerid(value);
        return this;
    }

    @Override
    public OwnerManagerAssigningsRecord value2(String value) {
        setTeamid(value);
        return this;
    }

    @Override
    public OwnerManagerAssigningsRecord value3(String value) {
        setTeammanagerid(value);
        return this;
    }

    @Override
    public OwnerManagerAssigningsRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OwnerManagerAssigningsRecord
     */
    public OwnerManagerAssigningsRecord() {
        super(OwnerManagerAssignings.OWNER_MANAGER_ASSIGNINGS);
    }

    /**
     * Create a detached, initialised OwnerManagerAssigningsRecord
     */
    public OwnerManagerAssigningsRecord(String ownerid, String teamid, String teammanagerid) {
        super(OwnerManagerAssignings.OWNER_MANAGER_ASSIGNINGS);

        set(0, ownerid);
        set(1, teamid);
        set(2, teammanagerid);
    }
}
