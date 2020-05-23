/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.Foul;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoulRecord extends TableRecordImpl<FoulRecord> implements Record5<Integer, Integer, String, String, String> {

    private static final long serialVersionUID = 555057705;

    /**
     * Setter for <code>localsoccer.foul.MatchID</code>.
     */
    public void setMatchid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>localsoccer.foul.MatchID</code>.
     */
    public Integer getMatchid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>localsoccer.foul.EventID</code>.
     */
    public void setEventid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>localsoccer.foul.EventID</code>.
     */
    public Integer getEventid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>localsoccer.foul.Time</code>.
     */
    public void setTime(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>localsoccer.foul.Time</code>.
     */
    public String getTime() {
        return (String) get(2);
    }

    /**
     * Setter for <code>localsoccer.foul.PlayerAgainstID</code>.
     */
    public void setPlayeragainstid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>localsoccer.foul.PlayerAgainstID</code>.
     */
    public String getPlayeragainstid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>localsoccer.foul.PlayerInFavorID</code>.
     */
    public void setPlayerinfavorid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>localsoccer.foul.PlayerInFavorID</code>.
     */
    public String getPlayerinfavorid() {
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
        return Foul.FOUL.MATCHID;
    }

    @Override
    public Field<Integer> field2() {
        return Foul.FOUL.EVENTID;
    }

    @Override
    public Field<String> field3() {
        return Foul.FOUL.TIME;
    }

    @Override
    public Field<String> field4() {
        return Foul.FOUL.PLAYERAGAINSTID;
    }

    @Override
    public Field<String> field5() {
        return Foul.FOUL.PLAYERINFAVORID;
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
        return getPlayeragainstid();
    }

    @Override
    public String component5() {
        return getPlayerinfavorid();
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
        return getPlayeragainstid();
    }

    @Override
    public String value5() {
        return getPlayerinfavorid();
    }

    @Override
    public FoulRecord value1(Integer value) {
        setMatchid(value);
        return this;
    }

    @Override
    public FoulRecord value2(Integer value) {
        setEventid(value);
        return this;
    }

    @Override
    public FoulRecord value3(String value) {
        setTime(value);
        return this;
    }

    @Override
    public FoulRecord value4(String value) {
        setPlayeragainstid(value);
        return this;
    }

    @Override
    public FoulRecord value5(String value) {
        setPlayerinfavorid(value);
        return this;
    }

    @Override
    public FoulRecord values(Integer value1, Integer value2, String value3, String value4, String value5) {
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
     * Create a detached FoulRecord
     */
    public FoulRecord() {
        super(Foul.FOUL);
    }

    /**
     * Create a detached, initialised FoulRecord
     */
    public FoulRecord(Integer matchid, Integer eventid, String time, String playeragainstid, String playerinfavorid) {
        super(Foul.FOUL);

        set(0, matchid);
        set(1, eventid);
        set(2, time);
        set(3, playeragainstid);
        set(4, playerinfavorid);
    }
}
