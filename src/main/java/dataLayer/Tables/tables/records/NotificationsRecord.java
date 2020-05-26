/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.Notifications;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationsRecord extends TableRecordImpl<NotificationsRecord> implements Record3<String, String, Boolean> {

    private static final long serialVersionUID = -872024425;

    /**
     * Setter for <code>demodb.notifications.subscriberID</code>.
     */
    public void setSubscriberid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.notifications.subscriberID</code>.
     */
    public String getSubscriberid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>demodb.notifications.notification</code>.
     */
    public void setNotification(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.notifications.notification</code>.
     */
    public String getNotification() {
        return (String) get(1);
    }

    /**
     * Setter for <code>demodb.notifications.seen</code>.
     */
    public void setSeen(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>demodb.notifications.seen</code>.
     */
    public Boolean getSeen() {
        return (Boolean) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Boolean> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, Boolean> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Notifications.NOTIFICATIONS.SUBSCRIBERID;
    }

    @Override
    public Field<String> field2() {
        return Notifications.NOTIFICATIONS.NOTIFICATION;
    }

    @Override
    public Field<Boolean> field3() {
        return Notifications.NOTIFICATIONS.SEEN;
    }

    @Override
    public String component1() {
        return getSubscriberid();
    }

    @Override
    public String component2() {
        return getNotification();
    }

    @Override
    public Boolean component3() {
        return getSeen();
    }

    @Override
    public String value1() {
        return getSubscriberid();
    }

    @Override
    public String value2() {
        return getNotification();
    }

    @Override
    public Boolean value3() {
        return getSeen();
    }

    @Override
    public NotificationsRecord value1(String value) {
        setSubscriberid(value);
        return this;
    }

    @Override
    public NotificationsRecord value2(String value) {
        setNotification(value);
        return this;
    }

    @Override
    public NotificationsRecord value3(Boolean value) {
        setSeen(value);
        return this;
    }

    @Override
    public NotificationsRecord values(String value1, String value2, Boolean value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NotificationsRecord
     */
    public NotificationsRecord() {
        super(Notifications.NOTIFICATIONS);
    }

    /**
     * Create a detached, initialised NotificationsRecord
     */
    public NotificationsRecord(String subscriberid, String notification, Boolean seen) {
        super(Notifications.NOTIFICATIONS);

        set(0, subscriberid);
        set(1, notification);
        set(2, seen);
    }
}