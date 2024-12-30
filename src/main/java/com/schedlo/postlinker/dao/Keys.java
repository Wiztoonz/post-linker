/*
 * This file is generated by jOOQ.
 */
package com.schedlo.postlinker.dao;


import com.schedlo.postlinker.dao.tables.Databasechangeloglock;
import com.schedlo.postlinker.dao.tables.records.DatabasechangeloglockRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in app.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = Internal.createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, DSL.name("KEY_databasechangeloglock_PRIMARY"), new TableField[] { Databasechangeloglock.DATABASECHANGELOGLOCK.ID }, true);
}