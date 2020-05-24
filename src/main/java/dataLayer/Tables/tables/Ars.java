/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables;


import dataLayer.Tables.Demodb;
import dataLayer.Tables.Keys;
import dataLayer.Tables.tables.records.ArsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class Ars extends TableImpl<ArsRecord> {

    private static final long serialVersionUID = -595638493;

    /**
     * The reference instance of <code>demodb.ars</code>
     */
    public static final Ars ARS = new Ars();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ArsRecord> getRecordType() {
        return ArsRecord.class;
    }

    /**
     * The column <code>demodb.ars.AR_ID</code>.
     */
    public final TableField<ArsRecord, String> AR_ID = createField(DSL.name("AR_ID"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>demodb.ars.approved</code>.
     */
    public final TableField<ArsRecord, Boolean> APPROVED = createField(DSL.name("approved"), org.jooq.impl.SQLDataType.BIT.nullable(false).defaultValue(org.jooq.impl.DSL.field("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>demodb.ars</code> table reference
     */
    public Ars() {
        this(DSL.name("ars"), null);
    }

    /**
     * Create an aliased <code>demodb.ars</code> table reference
     */
    public Ars(String alias) {
        this(DSL.name(alias), ARS);
    }

    /**
     * Create an aliased <code>demodb.ars</code> table reference
     */
    public Ars(Name alias) {
        this(alias, ARS);
    }

    private Ars(Name alias, Table<ArsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ars(Name alias, Table<ArsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Ars(Table<O> child, ForeignKey<O, ArsRecord> key) {
        super(child, key, ARS);
    }

    @Override
    public Schema getSchema() {
        return Demodb.DEMODB;
    }

    @Override
    public UniqueKey<ArsRecord> getPrimaryKey() {
        return Keys.KEY_ARS_PRIMARY;
    }

    @Override
    public List<UniqueKey<ArsRecord>> getKeys() {
        return Arrays.<UniqueKey<ArsRecord>>asList(Keys.KEY_ARS_PRIMARY);
    }

    @Override
    public List<ForeignKey<ArsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ArsRecord, ?>>asList(Keys.FK_ARS_SUBSCRIBERS);
    }

    public Subscribers subscribers() {
        return new Subscribers(this, Keys.FK_ARS_SUBSCRIBERS);
    }

    @Override
    public Ars as(String alias) {
        return new Ars(DSL.name(alias), this);
    }

    @Override
    public Ars as(Name alias) {
        return new Ars(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ars rename(String name) {
        return new Ars(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ars rename(Name name) {
        return new Ars(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Boolean> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}