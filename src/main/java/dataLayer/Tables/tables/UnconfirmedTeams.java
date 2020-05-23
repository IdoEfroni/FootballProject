/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables;


import dataLayer.Tables.Keys;
import dataLayer.Tables.Testdb3;
import dataLayer.Tables.tables.records.UnconfirmedTeamsRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * all teams pending approval
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UnconfirmedTeams extends TableImpl<UnconfirmedTeamsRecord> {

    private static final long serialVersionUID = 1134763594;

    /**
     * The reference instance of <code>testdb3.unconfirmed_teams</code>
     */
    public static final UnconfirmedTeams UNCONFIRMED_TEAMS = new UnconfirmedTeams();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UnconfirmedTeamsRecord> getRecordType() {
        return UnconfirmedTeamsRecord.class;
    }

    /**
     * The column <code>testdb3.unconfirmed_teams.teamID</code>.
     */
    public final TableField<UnconfirmedTeamsRecord, String> TEAMID = createField(DSL.name("teamID"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>testdb3.unconfirmed_teams.establishedYear</code>.
     */
    public final TableField<UnconfirmedTeamsRecord, Integer> ESTABLISHEDYEAR = createField(DSL.name("establishedYear"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>testdb3.unconfirmed_teams.ownerID</code>.
     */
    public final TableField<UnconfirmedTeamsRecord, String> OWNERID = createField(DSL.name("ownerID"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>testdb3.unconfirmed_teams</code> table reference
     */
    public UnconfirmedTeams() {
        this(DSL.name("unconfirmed_teams"), null);
    }

    /**
     * Create an aliased <code>testdb3.unconfirmed_teams</code> table reference
     */
    public UnconfirmedTeams(String alias) {
        this(DSL.name(alias), UNCONFIRMED_TEAMS);
    }

    /**
     * Create an aliased <code>testdb3.unconfirmed_teams</code> table reference
     */
    public UnconfirmedTeams(Name alias) {
        this(alias, UNCONFIRMED_TEAMS);
    }

    private UnconfirmedTeams(Name alias, Table<UnconfirmedTeamsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UnconfirmedTeams(Name alias, Table<UnconfirmedTeamsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("all teams pending approval"), TableOptions.table());
    }

    public <O extends Record> UnconfirmedTeams(Table<O> child, ForeignKey<O, UnconfirmedTeamsRecord> key) {
        super(child, key, UNCONFIRMED_TEAMS);
    }

    @Override
    public Schema getSchema() {
        return Testdb3.TESTDB3;
    }

    @Override
    public UniqueKey<UnconfirmedTeamsRecord> getPrimaryKey() {
        return Keys.KEY_UNCONFIRMED_TEAMS_PRIMARY;
    }

    @Override
    public List<UniqueKey<UnconfirmedTeamsRecord>> getKeys() {
        return Arrays.<UniqueKey<UnconfirmedTeamsRecord>>asList(Keys.KEY_UNCONFIRMED_TEAMS_PRIMARY);
    }

    @Override
    public List<ForeignKey<UnconfirmedTeamsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UnconfirmedTeamsRecord, ?>>asList(Keys.FK_UNCONFIRMED_TEAMS_SUBSCRIBERS);
    }

    public Subscribers subscribers() {
        return new Subscribers(this, Keys.FK_UNCONFIRMED_TEAMS_SUBSCRIBERS);
    }

    @Override
    public UnconfirmedTeams as(String alias) {
        return new UnconfirmedTeams(DSL.name(alias), this);
    }

    @Override
    public UnconfirmedTeams as(Name alias) {
        return new UnconfirmedTeams(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UnconfirmedTeams rename(String name) {
        return new UnconfirmedTeams(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UnconfirmedTeams rename(Name name) {
        return new UnconfirmedTeams(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
