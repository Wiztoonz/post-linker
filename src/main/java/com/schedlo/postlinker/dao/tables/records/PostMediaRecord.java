/*
 * This file is generated by jOOQ.
 */
package com.schedlo.postlinker.dao.tables.records;


import com.schedlo.postlinker.dao.tables.PostMedia;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PostMediaRecord extends UpdatableRecordImpl<PostMediaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>app.post_media.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>app.post_media.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>app.post_media.post_id</code>.
     */
    public void setPostId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>app.post_media.post_id</code>.
     */
    public Long getPostId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>app.post_media.media_id</code>.
     */
    public void setMediaId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>app.post_media.media_id</code>.
     */
    public Long getMediaId() {
        return (Long) get(2);
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
     * Create a detached PostMediaRecord
     */
    public PostMediaRecord() {
        super(PostMedia.POST_MEDIA);
    }

    /**
     * Create a detached, initialised PostMediaRecord
     */
    public PostMediaRecord(Long id, Long postId, Long mediaId) {
        super(PostMedia.POST_MEDIA);

        setId(id);
        setPostId(postId);
        setMediaId(mediaId);
        resetChangedOnNotNull();
    }
}
