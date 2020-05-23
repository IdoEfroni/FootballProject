/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables;


import dataLayer.Tables.Indexes;
import dataLayer.Tables.Keys;
import dataLayer.Tables.Testdb3;
import dataLayer.Tables.tables.records.RedcardRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Redcard extends TableImpl<RedcardRecord> {

    private static final long serialVersionUID = 265555387;

    /**
     * The reference instance of <code>testdb3.redcard</code>
     */
    public static final Redcard REDCARD = new Redcard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RedcardRecord> getRecordType() {
        return RedcardRecord.class;
    }

    /**
     * The column <code>testdb3.redcard.MatchID</code>.
     */
    public final TableField<RedcardRecord, Integer> MATCHID = createField(DSL.name("MatchID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>testdb3.redcard.EventID</code>.
     */
    public final TableField<RedcardRecord, Integer> EVENTID = createField(DSL.name("EventID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>testdb3.redcard.Time</code>.
     */
    public final TableField<RedcardRecord, String> TIME = createField(DSL.name("Time"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>testdb3.redcard.PlayerAgainstID</code>.
     */
    public final TableField<RedcardRecord, String> PLAYERAGAINSTID = createField(DSL.name("PlayerAgainstID"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>testdb3.redcard</code> table reference
     */
    public Redcard() {
        this(DSL.name("redcard"), null);
    }

    /**
     * Create an aliased <code>testdb3.redcard</code> table reference
     */
    public Redcard(String alias) {
        this(DSL.name(alias), REDCARD);
    }

    /**
     * Create an aliased <code>testdb3.redcard</code> table reference
     */
    public Redcard(Name alias) {
        this(alias, REDCARD);
    }

    private Redcard(Name alias, Table<RedcardRecord> aliased) {
        this(alias, aliased, null);
    }

    private Redcard(Name alias, Table<RedcardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Redcard(Table<O> child, ForeignKey<O, RedcardRecord> key) {
        super(child, key, REDCARD);
    }

    @Override
    public Schema getSchema() {
        return Testdb3.TESTDB3;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.REDCARD_MATCHID);
    }

    @Override
    public List<ForeignKey<RedcardRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RedcardRecord, ?>>asList(Keys.FK_REDCARD_MATCH, Keys.FK_REDCARD_PLAYERS);
    }

    public Match match() {
        return new Match(this, Keys.FK_REDCARD_MATCH);
    }

    public Players players() {
        return new Players(this, Keys.FK_REDCARD_PLAYERS);
    }

    @Override
    public Redcard as(String alias) {
        return new Redcard(DSL.name(alias), this);
    }

    @Override
    public Redcard as(Name alias) {
        return new Redcard(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Redcard rename(String name) {
        return new Redcard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Redcard rename(Name name) {
        return new Redcard(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
