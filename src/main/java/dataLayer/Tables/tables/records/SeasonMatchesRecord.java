/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.SeasonMatches;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SeasonMatchesRecord extends TableRecordImpl<SeasonMatchesRecord> implements Record3<String, Integer, Integer> {

    private static final long serialVersionUID = -379302588;

    /**
     * Setter for <code>demodb.season_matches.LeagueID</code>.
     */
    public void setLeagueid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.season_matches.LeagueID</code>.
     */
    public String getLeagueid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>demodb.season_matches.SeasonID</code>.
     */
    public void setSeasonid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.season_matches.SeasonID</code>.
     */
    public Integer getSeasonid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>demodb.season_matches.MatchID</code>.
     */
    public void setMatchid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>demodb.season_matches.MatchID</code>.
     */
    public Integer getMatchid() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SeasonMatches.SEASON_MATCHES.LEAGUEID;
    }

    @Override
    public Field<Integer> field2() {
        return SeasonMatches.SEASON_MATCHES.SEASONID;
    }

    @Override
    public Field<Integer> field3() {
        return SeasonMatches.SEASON_MATCHES.MATCHID;
    }

    @Override
    public String component1() {
        return getLeagueid();
    }

    @Override
    public Integer component2() {
        return getSeasonid();
    }

    @Override
    public Integer component3() {
        return getMatchid();
    }

    @Override
    public String value1() {
        return getLeagueid();
    }

    @Override
    public Integer value2() {
        return getSeasonid();
    }

    @Override
    public Integer value3() {
        return getMatchid();
    }

    @Override
    public SeasonMatchesRecord value1(String value) {
        setLeagueid(value);
        return this;
    }

    @Override
    public SeasonMatchesRecord value2(Integer value) {
        setSeasonid(value);
        return this;
    }

    @Override
    public SeasonMatchesRecord value3(Integer value) {
        setMatchid(value);
        return this;
    }

    @Override
    public SeasonMatchesRecord values(String value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SeasonMatchesRecord
     */
    public SeasonMatchesRecord() {
        super(SeasonMatches.SEASON_MATCHES);
    }

    /**
     * Create a detached, initialised SeasonMatchesRecord
     */
    public SeasonMatchesRecord(String leagueid, Integer seasonid, Integer matchid) {
        super(SeasonMatches.SEASON_MATCHES);

        set(0, leagueid);
        set(1, seasonid);
        set(2, matchid);
    }
}
