/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables;


import dataLayer.Tables.Demodb;
import dataLayer.Tables.Indexes;
import dataLayer.Tables.Keys;
import dataLayer.Tables.tables.records.FoulRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class Foul extends TableImpl<FoulRecord> {

    private static final long serialVersionUID = -436990395;

    /**
     * The reference instance of <code>demodb.foul</code>
     */
    public static final Foul FOUL = new Foul();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FoulRecord> getRecordType() {
        return FoulRecord.class;
    }

    /**
     * The column <code>demodb.foul.MatchID</code>.
     */
    public final TableField<FoulRecord, Integer> MATCHID = createField(DSL.name("MatchID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>demodb.foul.EventID</code>.
     */
    public final TableField<FoulRecord, Integer> EVENTID = createField(DSL.name("EventID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>demodb.foul.Time</code>.
     */
    public final TableField<FoulRecord, String> TIME = createField(DSL.name("Time"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>demodb.foul.PlayerAgainstID</code>.
     */
    public final TableField<FoulRecord, String> PLAYERAGAINSTID = createField(DSL.name("PlayerAgainstID"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>demodb.foul.PlayerInFavorID</code>.
     */
    public final TableField<FoulRecord, String> PLAYERINFAVORID = createField(DSL.name("PlayerInFavorID"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>demodb.foul</code> table reference
     */
    public Foul() {
        this(DSL.name("foul"), null);
    }

    /**
     * Create an aliased <code>demodb.foul</code> table reference
     */
    public Foul(String alias) {
        this(DSL.name(alias), FOUL);
    }

    /**
     * Create an aliased <code>demodb.foul</code> table reference
     */
    public Foul(Name alias) {
        this(alias, FOUL);
    }

    private Foul(Name alias, Table<FoulRecord> aliased) {
        this(alias, aliased, null);
    }

    private Foul(Name alias, Table<FoulRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Foul(Table<O> child, ForeignKey<O, FoulRecord> key) {
        super(child, key, FOUL);
    }

    @Override
    public Schema getSchema() {
        return Demodb.DEMODB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FOUL_MATCHID);
    }

    @Override
    public List<UniqueKey<FoulRecord>> getKeys() {
        return Arrays.<UniqueKey<FoulRecord>>asList(Keys.KEY_FOUL_MATCHID_EVENTID);
    }

    @Override
    public List<ForeignKey<FoulRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FoulRecord, ?>>asList(Keys.FK_FOUL_MATCH, Keys.FK_FOUL_PLAYERS, Keys.FK_FOUL_PLAYERS_2);
    }

    public Match match() {
        return new Match(this, Keys.FK_FOUL_MATCH);
    }

    public Players fkFoulPlayers() {
        return new Players(this, Keys.FK_FOUL_PLAYERS);
    }

    public Players fkFoulPlayers_2() {
        return new Players(this, Keys.FK_FOUL_PLAYERS_2);
    }

    @Override
    public Foul as(String alias) {
        return new Foul(DSL.name(alias), this);
    }

    @Override
    public Foul as(Name alias) {
        return new Foul(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Foul rename(String name) {
        return new Foul(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Foul rename(Name name) {
        return new Foul(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
