/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.enums.CoachesRoleinteam;
import dataLayer.Tables.enums.CoachesTraining;
import dataLayer.Tables.tables.Coaches;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoachesRecord extends UpdatableRecordImpl<CoachesRecord> implements Record5<String, CoachesRoleinteam, CoachesTraining, Integer, String> {

    private static final long serialVersionUID = -1125724179;

    /**
     * Setter for <code>demodb.coaches.coachID</code>.
     */
    public void setCoachid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.coaches.coachID</code>.
     */
    public String getCoachid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>demodb.coaches.roleInTeam</code>.
     */
    public void setRoleinteam(CoachesRoleinteam value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.coaches.roleInTeam</code>.
     */
    public CoachesRoleinteam getRoleinteam() {
        return (CoachesRoleinteam) get(1);
    }

    /**
     * Setter for <code>demodb.coaches.training</code>.
     */
    public void setTraining(CoachesTraining value) {
        set(2, value);
    }

    /**
     * Getter for <code>demodb.coaches.training</code>.
     */
    public CoachesTraining getTraining() {
        return (CoachesTraining) get(2);
    }

    /**
     * Setter for <code>demodb.coaches.salary</code>.
     */
    public void setSalary(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>demodb.coaches.salary</code>.
     */
    public Integer getSalary() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>demodb.coaches.teamOwnerID_fictive</code>.
     */
    public void setTeamowneridFictive(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>demodb.coaches.teamOwnerID_fictive</code>.
     */
    public String getTeamowneridFictive() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, CoachesRoleinteam, CoachesTraining, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, CoachesRoleinteam, CoachesTraining, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Coaches.COACHES.COACHID;
    }

    @Override
    public Field<CoachesRoleinteam> field2() {
        return Coaches.COACHES.ROLEINTEAM;
    }

    @Override
    public Field<CoachesTraining> field3() {
        return Coaches.COACHES.TRAINING;
    }

    @Override
    public Field<Integer> field4() {
        return Coaches.COACHES.SALARY;
    }

    @Override
    public Field<String> field5() {
        return Coaches.COACHES.TEAMOWNERID_FICTIVE;
    }

    @Override
    public String component1() {
        return getCoachid();
    }

    @Override
    public CoachesRoleinteam component2() {
        return getRoleinteam();
    }

    @Override
    public CoachesTraining component3() {
        return getTraining();
    }

    @Override
    public Integer component4() {
        return getSalary();
    }

    @Override
    public String component5() {
        return getTeamowneridFictive();
    }

    @Override
    public String value1() {
        return getCoachid();
    }

    @Override
    public CoachesRoleinteam value2() {
        return getRoleinteam();
    }

    @Override
    public CoachesTraining value3() {
        return getTraining();
    }

    @Override
    public Integer value4() {
        return getSalary();
    }

    @Override
    public String value5() {
        return getTeamowneridFictive();
    }

    @Override
    public CoachesRecord value1(String value) {
        setCoachid(value);
        return this;
    }

    @Override
    public CoachesRecord value2(CoachesRoleinteam value) {
        setRoleinteam(value);
        return this;
    }

    @Override
    public CoachesRecord value3(CoachesTraining value) {
        setTraining(value);
        return this;
    }

    @Override
    public CoachesRecord value4(Integer value) {
        setSalary(value);
        return this;
    }

    @Override
    public CoachesRecord value5(String value) {
        setTeamowneridFictive(value);
        return this;
    }

    @Override
    public CoachesRecord values(String value1, CoachesRoleinteam value2, CoachesTraining value3, Integer value4, String value5) {
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
     * Create a detached CoachesRecord
     */
    public CoachesRecord() {
        super(Coaches.COACHES);
    }

    /**
     * Create a detached, initialised CoachesRecord
     */
    public CoachesRecord(String coachid, CoachesRoleinteam roleinteam, CoachesTraining training, Integer salary, String teamowneridFictive) {
        super(Coaches.COACHES);

        set(0, coachid);
        set(1, roleinteam);
        set(2, training);
        set(3, salary);
        set(4, teamowneridFictive);
    }
}