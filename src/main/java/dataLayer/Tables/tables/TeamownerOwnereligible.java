/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables;


import dataLayer.Tables.Indexes;
import dataLayer.Tables.Keys;
import dataLayer.Tables.Localsoccer;
import dataLayer.Tables.tables.records.TeamownerOwnereligibleRecord;

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
public class TeamownerOwnereligible extends TableImpl<TeamownerOwnereligibleRecord> {

    private static final long serialVersionUID = -1177603218;

    /**
     * The reference instance of <code>localsoccer.teamowner_ownereligible</code>
     */
    public static final TeamownerOwnereligible TEAMOWNER_OWNERELIGIBLE = new TeamownerOwnereligible();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TeamownerOwnereligibleRecord> getRecordType() {
        return TeamownerOwnereligibleRecord.class;
    }

    /**
     * The column <code>localsoccer.teamowner_ownereligible.OwnerID</code>.
     */
    public final TableField<TeamownerOwnereligibleRecord, String> OWNERID = createField(DSL.name("OwnerID"), org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>localsoccer.teamowner_ownereligible.playerID</code>.
     */
    public final TableField<TeamownerOwnereligibleRecord, String> PLAYERID = createField(DSL.name("playerID"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>localsoccer.teamowner_ownereligible.managerID</code>.
     */
    public final TableField<TeamownerOwnereligibleRecord, String> MANAGERID = createField(DSL.name("managerID"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>localsoccer.teamowner_ownereligible.coachID</code>.
     */
    public final TableField<TeamownerOwnereligibleRecord, String> COACHID = createField(DSL.name("coachID"), org.jooq.impl.SQLDataType.VARCHAR(50).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>localsoccer.teamowner_ownereligible</code> table reference
     */
    public TeamownerOwnereligible() {
        this(DSL.name("teamowner_ownereligible"), null);
    }

    /**
     * Create an aliased <code>localsoccer.teamowner_ownereligible</code> table reference
     */
    public TeamownerOwnereligible(String alias) {
        this(DSL.name(alias), TEAMOWNER_OWNERELIGIBLE);
    }

    /**
     * Create an aliased <code>localsoccer.teamowner_ownereligible</code> table reference
     */
    public TeamownerOwnereligible(Name alias) {
        this(alias, TEAMOWNER_OWNERELIGIBLE);
    }

    private TeamownerOwnereligible(Name alias, Table<TeamownerOwnereligibleRecord> aliased) {
        this(alias, aliased, null);
    }

    private TeamownerOwnereligible(Name alias, Table<TeamownerOwnereligibleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TeamownerOwnereligible(Table<O> child, ForeignKey<O, TeamownerOwnereligibleRecord> key) {
        super(child, key, TEAMOWNER_OWNERELIGIBLE);
    }

    @Override
    public Schema getSchema() {
        return Localsoccer.LOCALSOCCER;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TEAMOWNER_OWNERELIGIBLE_COACHID, Indexes.TEAMOWNER_OWNERELIGIBLE_MANAGERID, Indexes.TEAMOWNER_OWNERELIGIBLE_PLAYERID);
    }

    @Override
    public UniqueKey<TeamownerOwnereligibleRecord> getPrimaryKey() {
        return Keys.KEY_TEAMOWNER_OWNERELIGIBLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<TeamownerOwnereligibleRecord>> getKeys() {
        return Arrays.<UniqueKey<TeamownerOwnereligibleRecord>>asList(Keys.KEY_TEAMOWNER_OWNERELIGIBLE_PRIMARY);
    }

    @Override
    public List<ForeignKey<TeamownerOwnereligibleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TeamownerOwnereligibleRecord, ?>>asList(Keys.FK_TEAMOWNER_OWNERELIGIBLE_SUBSCRIBERS1, Keys.FK_TEAMOWNER_OWNERELIGIBLE_PLAYERS1, Keys.FK_TEAMOWNER_OWNERELIGIBLE_TEAMMANAGERS1, Keys.FK_TEAMOWNER_OWNERELIGIBLE_COACHES1);
    }

    public Subscribers subscribers() {
        return new Subscribers(this, Keys.FK_TEAMOWNER_OWNERELIGIBLE_SUBSCRIBERS1);
    }

    public Players players() {
        return new Players(this, Keys.FK_TEAMOWNER_OWNERELIGIBLE_PLAYERS1);
    }

    public Teammanagers teammanagers() {
        return new Teammanagers(this, Keys.FK_TEAMOWNER_OWNERELIGIBLE_TEAMMANAGERS1);
    }

    public Coaches coaches() {
        return new Coaches(this, Keys.FK_TEAMOWNER_OWNERELIGIBLE_COACHES1);
    }

    @Override
    public TeamownerOwnereligible as(String alias) {
        return new TeamownerOwnereligible(DSL.name(alias), this);
    }

    @Override
    public TeamownerOwnereligible as(Name alias) {
        return new TeamownerOwnereligible(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamownerOwnereligible rename(String name) {
        return new TeamownerOwnereligible(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TeamownerOwnereligible rename(Name name) {
        return new TeamownerOwnereligible(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
