/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables;


import dataLayer.Tables.Demodb;
import dataLayer.Tables.Indexes;
import dataLayer.Tables.Keys;
import dataLayer.Tables.tables.records.SeasonRefereeRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SeasonReferee extends TableImpl<SeasonRefereeRecord> {

    private static final long serialVersionUID = -1017800397;

    /**
     * The reference instance of <code>demodb.season_referee</code>
     */
    public static final SeasonReferee SEASON_REFEREE = new SeasonReferee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SeasonRefereeRecord> getRecordType() {
        return SeasonRefereeRecord.class;
    }

    /**
     * The column <code>demodb.season_referee.LeagueID</code>.
     */
    public final TableField<SeasonRefereeRecord, String> LEAGUEID = createField(DSL.name("LeagueID"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>demodb.season_referee.SeasonID</code>.
     */
    public final TableField<SeasonRefereeRecord, Integer> SEASONID = createField(DSL.name("SeasonID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>demodb.season_referee.RefereeID</code>.
     */
    public final TableField<SeasonRefereeRecord, String> REFEREEID = createField(DSL.name("RefereeID"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>demodb.season_referee</code> table reference
     */
    public SeasonReferee() {
        this(DSL.name("season_referee"), null);
    }

    /**
     * Create an aliased <code>demodb.season_referee</code> table reference
     */
    public SeasonReferee(String alias) {
        this(DSL.name(alias), SEASON_REFEREE);
    }

    /**
     * Create an aliased <code>demodb.season_referee</code> table reference
     */
    public SeasonReferee(Name alias) {
        this(alias, SEASON_REFEREE);
    }

    private SeasonReferee(Name alias, Table<SeasonRefereeRecord> aliased) {
        this(alias, aliased, null);
    }

    private SeasonReferee(Name alias, Table<SeasonRefereeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> SeasonReferee(Table<O> child, ForeignKey<O, SeasonRefereeRecord> key) {
        super(child, key, SEASON_REFEREE);
    }

    @Override
    public Schema getSchema() {
        return Demodb.DEMODB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SEASON_REFEREE_LEAGUEID_SEASONID);
    }

    @Override
    public List<ForeignKey<SeasonRefereeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SeasonRefereeRecord, ?>>asList(Keys.FK_SEASON_REFEREE_LEAGUE, Keys.FK_SEASON_REFEREE_REFEREES);
    }

    public League league() {
        return new League(this, Keys.FK_SEASON_REFEREE_LEAGUE);
    }

    public Referees referees() {
        return new Referees(this, Keys.FK_SEASON_REFEREE_REFEREES);
    }

    @Override
    public SeasonReferee as(String alias) {
        return new SeasonReferee(DSL.name(alias), this);
    }

    @Override
    public SeasonReferee as(Name alias) {
        return new SeasonReferee(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SeasonReferee rename(String name) {
        return new SeasonReferee(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SeasonReferee rename(Name name) {
        return new SeasonReferee(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
