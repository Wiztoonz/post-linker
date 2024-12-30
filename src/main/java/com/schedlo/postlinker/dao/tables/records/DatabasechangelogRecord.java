/*
 * This file is generated by jOOQ.
 */
package com.schedlo.postlinker.dao.tables.records;


import com.schedlo.postlinker.dao.tables.Databasechangelog;

import java.time.LocalDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DatabasechangelogRecord extends TableRecordImpl<DatabasechangelogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>app.databasechangelog.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>app.databasechangelog.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>app.databasechangelog.AUTHOR</code>.
     */
    public void setAuthor(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>app.databasechangelog.AUTHOR</code>.
     */
    public String getAuthor() {
        return (String) get(1);
    }

    /**
     * Setter for <code>app.databasechangelog.FILENAME</code>.
     */
    public void setFilename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>app.databasechangelog.FILENAME</code>.
     */
    public String getFilename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>app.databasechangelog.DATEEXECUTED</code>.
     */
    public void setDateexecuted(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>app.databasechangelog.DATEEXECUTED</code>.
     */
    public LocalDateTime getDateexecuted() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>app.databasechangelog.ORDEREXECUTED</code>.
     */
    public void setOrderexecuted(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>app.databasechangelog.ORDEREXECUTED</code>.
     */
    public Integer getOrderexecuted() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>app.databasechangelog.EXECTYPE</code>.
     */
    public void setExectype(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>app.databasechangelog.EXECTYPE</code>.
     */
    public String getExectype() {
        return (String) get(5);
    }

    /**
     * Setter for <code>app.databasechangelog.MD5SUM</code>.
     */
    public void setMd5sum(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>app.databasechangelog.MD5SUM</code>.
     */
    public String getMd5sum() {
        return (String) get(6);
    }

    /**
     * Setter for <code>app.databasechangelog.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>app.databasechangelog.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>app.databasechangelog.COMMENTS</code>.
     */
    public void setComments(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>app.databasechangelog.COMMENTS</code>.
     */
    public String getComments() {
        return (String) get(8);
    }

    /**
     * Setter for <code>app.databasechangelog.TAG</code>.
     */
    public void setTag(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>app.databasechangelog.TAG</code>.
     */
    public String getTag() {
        return (String) get(9);
    }

    /**
     * Setter for <code>app.databasechangelog.LIQUIBASE</code>.
     */
    public void setLiquibase(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>app.databasechangelog.LIQUIBASE</code>.
     */
    public String getLiquibase() {
        return (String) get(10);
    }

    /**
     * Setter for <code>app.databasechangelog.CONTEXTS</code>.
     */
    public void setContexts(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>app.databasechangelog.CONTEXTS</code>.
     */
    public String getContexts() {
        return (String) get(11);
    }

    /**
     * Setter for <code>app.databasechangelog.LABELS</code>.
     */
    public void setLabels(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>app.databasechangelog.LABELS</code>.
     */
    public String getLabels() {
        return (String) get(12);
    }

    /**
     * Setter for <code>app.databasechangelog.DEPLOYMENT_ID</code>.
     */
    public void setDeploymentId(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>app.databasechangelog.DEPLOYMENT_ID</code>.
     */
    public String getDeploymentId() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatabasechangelogRecord
     */
    public DatabasechangelogRecord() {
        super(Databasechangelog.DATABASECHANGELOG);
    }

    /**
     * Create a detached, initialised DatabasechangelogRecord
     */
    public DatabasechangelogRecord(String id, String author, String filename, LocalDateTime dateexecuted, Integer orderexecuted, String exectype, String md5sum, String description, String comments, String tag, String liquibase, String contexts, String labels, String deploymentId) {
        super(Databasechangelog.DATABASECHANGELOG);

        setId(id);
        setAuthor(author);
        setFilename(filename);
        setDateexecuted(dateexecuted);
        setOrderexecuted(orderexecuted);
        setExectype(exectype);
        setMd5sum(md5sum);
        setDescription(description);
        setComments(comments);
        setTag(tag);
        setLiquibase(liquibase);
        setContexts(contexts);
        setLabels(labels);
        setDeploymentId(deploymentId);
        resetChangedOnNotNull();
    }
}
