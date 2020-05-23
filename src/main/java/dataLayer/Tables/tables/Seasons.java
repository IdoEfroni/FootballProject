/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables;


import dataLayer.Tables.Indexes;
import dataLayer.Tables.Keys;
import dataLayer.Tables.Testdb3;
import dataLayer.Tables.tables.records.SeasonsRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Seasons extends TableImpl<SeasonsRecord> {

    private static final long serialVersionUID = 137001545;

    /**
     * The reference instance of <code>testdb3.seasons</code>
     */
    public static final Seasons SEASONS = new Seasons();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SeasonsRecord> getRecordType() {
        return SeasonsRecord.class;
    }

    /**
     * The column <code>testdb3.seasons.leagueID</code>.
     */
    public final TableField<SeasonsRecord, String> LEAGUEID = createField(DSL.name("leagueID"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>testdb3.seasons.seasonID</code>.
     */
    public final TableField<SeasonsRecord, Integer> SEASONID = createField(DSL.name("seasonID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>testdb3.seasons.startDate</code>.
     */
    public final TableField<SeasonsRecord, LocalDate> STARTDATE = createField(DSL.name("startDate"), org.jooq.impl.SQLDataType.LOCALDATE.defaultValue(org.jooq.impl.DSL.field("curdate()", org.jooq.impl.SQLDataType.LOCALDATE)), this, "");

    /**
     * The column <code>testdb3.seasons.endDate</code>.
     */
    public final TableField<SeasonsRecord, LocalDate> ENDDATE = createField(DSL.name("endDate"), org.jooq.impl.SQLDataType.LOCALDATE.defaultValue(org.jooq.impl.DSL.field("curdate()", org.jooq.impl.SQLDataType.LOCALDATE)), this, "");

    /**
     * Create a <code>testdb3.seasons</code> table reference
     */
    public Seasons() {
        this(DSL.name("seasons"), null);
    }

    /**
     * Create an aliased <code>testdb3.seasons</code> table reference
     */
    public Seasons(String alias) {
        this(DSL.name(alias), SEASONS);
    }

    /**
     * Create an aliased <code>testdb3.seasons</code> table reference
     */
    public Seasons(Name alias) {
        this(alias, SEASONS);
    }

    private Seasons(Name alias, Table<SeasonsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Seasons(Name alias, Table<SeasonsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Seasons(Table<O> child, ForeignKey<O, SeasonsRecord> key) {
        super(child, key, SEASONS);
    }

    @Override
    public Schema getSchema() {
        return Testdb3.TESTDB3;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SEASONS_LEAGUEID, Indexes.SEASONS_SEASONID);
    }

    @Override
    public UniqueKey<SeasonsRecord> getPrimaryKey() {
        return Keys.KEY_SEASONS_PRIMARY;
    }

    @Override
    public List<UniqueKey<SeasonsRecord>> getKeys() {
        return Arrays.<UniqueKey<SeasonsRecord>>asList(Keys.KEY_SEASONS_PRIMARY, Keys.KEY_SEASONS_LEAGUEID_SEASONID);
    }

    @Override
    public List<ForeignKey<SeasonsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SeasonsRecord, ?>>asList(Keys.FK_SEASONS_LEAGUE);
    }

    public League league() {
        return new League(this, Keys.FK_SEASONS_LEAGUE);
    }

    @Override
    public Seasons as(String alias) {
        return new Seasons(DSL.name(alias), this);
    }

    @Override
    public Seasons as(Name alias) {
        return new Seasons(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Seasons rename(String name) {
        return new Seasons(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Seasons rename(Name name) {
        return new Seasons(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Integer, LocalDate, LocalDate> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
