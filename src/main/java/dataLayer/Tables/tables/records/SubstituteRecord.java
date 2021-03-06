/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.Substitute;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SubstituteRecord extends TableRecordImpl<SubstituteRecord> implements Record5<Integer, Integer, String, String, String> {

    private static final long serialVersionUID = 853135357;

    /**
     * Setter for <code>demodb.substitute.MatchID</code>.
     */
    public void setMatchid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.substitute.MatchID</code>.
     */
    public Integer getMatchid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>demodb.substitute.EventID</code>.
     */
    public void setEventid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.substitute.EventID</code>.
     */
    public Integer getEventid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>demodb.substitute.Time</code>.
     */
    public void setTime(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>demodb.substitute.Time</code>.
     */
    public String getTime() {
        return (String) get(2);
    }

    /**
     * Setter for <code>demodb.substitute.PlayerInID</code>.
     */
    public void setPlayerinid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>demodb.substitute.PlayerInID</code>.
     */
    public String getPlayerinid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>demodb.substitute.PlayerOutID</code>.
     */
    public void setPlayeroutid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>demodb.substitute.PlayerOutID</code>.
     */
    public String getPlayeroutid() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, Integer, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Substitute.SUBSTITUTE.MATCHID;
    }

    @Override
    public Field<Integer> field2() {
        return Substitute.SUBSTITUTE.EVENTID;
    }

    @Override
    public Field<String> field3() {
        return Substitute.SUBSTITUTE.TIME;
    }

    @Override
    public Field<String> field4() {
        return Substitute.SUBSTITUTE.PLAYERINID;
    }

    @Override
    public Field<String> field5() {
        return Substitute.SUBSTITUTE.PLAYEROUTID;
    }

    @Override
    public Integer component1() {
        return getMatchid();
    }

    @Override
    public Integer component2() {
        return getEventid();
    }

    @Override
    public String component3() {
        return getTime();
    }

    @Override
    public String component4() {
        return getPlayerinid();
    }

    @Override
    public String component5() {
        return getPlayeroutid();
    }

    @Override
    public Integer value1() {
        return getMatchid();
    }

    @Override
    public Integer value2() {
        return getEventid();
    }

    @Override
    public String value3() {
        return getTime();
    }

    @Override
    public String value4() {
        return getPlayerinid();
    }

    @Override
    public String value5() {
        return getPlayeroutid();
    }

    @Override
    public SubstituteRecord value1(Integer value) {
        setMatchid(value);
        return this;
    }

    @Override
    public SubstituteRecord value2(Integer value) {
        setEventid(value);
        return this;
    }

    @Override
    public SubstituteRecord value3(String value) {
        setTime(value);
        return this;
    }

    @Override
    public SubstituteRecord value4(String value) {
        setPlayerinid(value);
        return this;
    }

    @Override
    public SubstituteRecord value5(String value) {
        setPlayeroutid(value);
        return this;
    }

    @Override
    public SubstituteRecord values(Integer value1, Integer value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SubstituteRecord
     */
    public SubstituteRecord() {
        super(Substitute.SUBSTITUTE);
    }

    /**
     * Create a detached, initialised SubstituteRecord
     */
    public SubstituteRecord(Integer matchid, Integer eventid, String time, String playerinid, String playeroutid) {
        super(Substitute.SUBSTITUTE);

        set(0, matchid);
        set(1, eventid);
        set(2, time);
        set(3, playerinid);
        set(4, playeroutid);
    }
}
