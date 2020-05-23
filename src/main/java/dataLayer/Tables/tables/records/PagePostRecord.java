/*
 * This file is generated by jOOQ.
 */
package dataLayer.Tables.tables.records;


import dataLayer.Tables.tables.PagePost;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * all posts of username
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PagePostRecord extends TableRecordImpl<PagePostRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -837409096;

    /**
     * Setter for <code>localsoccer.page_post.usernameID</code>.
     */
    public void setUsernameid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>localsoccer.page_post.usernameID</code>.
     */
    public String getUsernameid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>localsoccer.page_post.post</code>.
     */
    public void setPost(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>localsoccer.page_post.post</code>.
     */
    public String getPost() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PagePost.PAGE_POST.USERNAMEID;
    }

    @Override
    public Field<String> field2() {
        return PagePost.PAGE_POST.POST;
    }

    @Override
    public String component1() {
        return getUsernameid();
    }

    @Override
    public String component2() {
        return getPost();
    }

    @Override
    public String value1() {
        return getUsernameid();
    }

    @Override
    public String value2() {
        return getPost();
    }

    @Override
    public PagePostRecord value1(String value) {
        setUsernameid(value);
        return this;
    }

    @Override
    public PagePostRecord value2(String value) {
        setPost(value);
        return this;
    }

    @Override
    public PagePostRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PagePostRecord
     */
    public PagePostRecord() {
        super(PagePost.PAGE_POST);
    }

    /**
     * Create a detached, initialised PagePostRecord
     */
    public PagePostRecord(String usernameid, String post) {
        super(PagePost.PAGE_POST);

        set(0, usernameid);
        set(1, post);
    }
}
