/*
 * This file is generated by jOOQ.
 */
package com.schedlo.postlinker.dao.tables.records;


import com.schedlo.postlinker.dao.tables.Post;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PostRecord extends UpdatableRecordImpl<PostRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>app.post.is_deleted</code>.
     */
    public void setIsDeleted(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>app.post.is_deleted</code>.
     */
    public Byte getIsDeleted() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>app.post.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>app.post.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>app.post.user_id</code>.
     */
    public void setUserId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>app.post.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>app.post.media_id</code>.
     */
    public void setMediaId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>app.post.media_id</code>.
     */
    public Long getMediaId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>app.post.message</code>.
     */
    public void setMessage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>app.post.message</code>.
     */
    public String getMessage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>app.post.date_created</code>.
     */
    public void setDateCreated(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>app.post.date_created</code>.
     */
    public LocalDateTime getDateCreated() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>app.post.date_updated</code>.
     */
    public void setDateUpdated(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>app.post.date_updated</code>.
     */
    public LocalDateTime getDateUpdated() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PostRecord
     */
    public PostRecord() {
        super(Post.POST);
    }

    /**
     * Create a detached, initialised PostRecord
     */
    public PostRecord(Byte isDeleted, Long id, Long userId, Long mediaId, String message, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        super(Post.POST);

        setIsDeleted(isDeleted);
        setId(id);
        setUserId(userId);
        setMediaId(mediaId);
        setMessage(message);
        setDateCreated(dateCreated);
        setDateUpdated(dateUpdated);
        resetChangedOnNotNull();
    }
}