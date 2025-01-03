/*
 * This file is generated by jOOQ.
 */
package com.schedlo.postlinker.dao.tables;


import com.schedlo.postlinker.dao.App;
import com.schedlo.postlinker.dao.Indexes;
import com.schedlo.postlinker.dao.Keys;
import com.schedlo.postlinker.dao.tables.PostMedia.PostMediaPath;
import com.schedlo.postlinker.dao.tables.records.MediaRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Media extends TableImpl<MediaRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>app.media</code>
     */
    public static final Media MEDIA = new Media();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MediaRecord> getRecordType() {
        return MediaRecord.class;
    }

    /**
     * The column <code>app.media.is_deleted</code>.
     */
    public final TableField<MediaRecord, Byte> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>app.media.id</code>.
     */
    public final TableField<MediaRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>app.media.media_type</code>.
     */
    public final TableField<MediaRecord, String> MEDIA_TYPE = createField(DSL.name("media_type"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>app.media.media_url</code>.
     */
    public final TableField<MediaRecord, String> MEDIA_URL = createField(DSL.name("media_url"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>app.media.width</code>.
     */
    public final TableField<MediaRecord, Integer> WIDTH = createField(DSL.name("width"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>app.media.height</code>.
     */
    public final TableField<MediaRecord, Integer> HEIGHT = createField(DSL.name("height"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>app.media.duration</code>.
     */
    public final TableField<MediaRecord, BigDecimal> DURATION = createField(DSL.name("duration"), SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>app.media.file_size</code>.
     */
    public final TableField<MediaRecord, Long> FILE_SIZE = createField(DSL.name("file_size"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>app.media.date_created</code>.
     */
    public final TableField<MediaRecord, LocalDateTime> DATE_CREATED = createField(DSL.name("date_created"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>app.media.date_updated</code>.
     */
    public final TableField<MediaRecord, LocalDateTime> DATE_UPDATED = createField(DSL.name("date_updated"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private Media(Name alias, Table<MediaRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Media(Name alias, Table<MediaRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>app.media</code> table reference
     */
    public Media(String alias) {
        this(DSL.name(alias), MEDIA);
    }

    /**
     * Create an aliased <code>app.media</code> table reference
     */
    public Media(Name alias) {
        this(alias, MEDIA);
    }

    /**
     * Create a <code>app.media</code> table reference
     */
    public Media() {
        this(DSL.name("media"), null);
    }

    public <O extends Record> Media(Table<O> path, ForeignKey<O, MediaRecord> childPath, InverseForeignKey<O, MediaRecord> parentPath) {
        super(path, childPath, parentPath, MEDIA);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class MediaPath extends Media implements Path<MediaRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> MediaPath(Table<O> path, ForeignKey<O, MediaRecord> childPath, InverseForeignKey<O, MediaRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private MediaPath(Name alias, Table<MediaRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public MediaPath as(String alias) {
            return new MediaPath(DSL.name(alias), this);
        }

        @Override
        public MediaPath as(Name alias) {
            return new MediaPath(alias, this);
        }

        @Override
        public MediaPath as(Table<?> alias) {
            return new MediaPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : App.APP;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.MEDIA_IDX_MEDIA_TYPE_DATE_UPDATED);
    }

    @Override
    public Identity<MediaRecord, Long> getIdentity() {
        return (Identity<MediaRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<MediaRecord> getPrimaryKey() {
        return Keys.KEY_MEDIA_PRIMARY;
    }

    private transient PostMediaPath _postMedia;

    /**
     * Get the implicit to-many join path to the <code>app.post_media</code>
     * table
     */
    public PostMediaPath postMedia() {
        if (_postMedia == null)
            _postMedia = new PostMediaPath(this, null, Keys.FK_POST_MEDIA_MEDIA_ID.getInverseKey());

        return _postMedia;
    }

    @Override
    public Media as(String alias) {
        return new Media(DSL.name(alias), this);
    }

    @Override
    public Media as(Name alias) {
        return new Media(alias, this);
    }

    @Override
    public Media as(Table<?> alias) {
        return new Media(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Media rename(String name) {
        return new Media(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Media rename(Name name) {
        return new Media(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Media rename(Table<?> name) {
        return new Media(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Media where(Condition condition) {
        return new Media(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Media where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Media where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Media where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Media where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Media where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Media where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Media where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Media whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Media whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
