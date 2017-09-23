/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.KeyValueRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeyValueTable extends TableImpl<KeyValueRecord> {

    private static final long serialVersionUID = 1335513035;

    /**
     * The reference instance of <code>cattle.key_value</code>
     */
    public static final KeyValueTable KEY_VALUE = new KeyValueTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeyValueRecord> getRecordType() {
        return KeyValueRecord.class;
    }

    /**
     * The column <code>cattle.key_value.name</code>.
     */
    public final TableField<KeyValueRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.key_value.value</code>.
     */
    public final TableField<KeyValueRecord, byte[]> VALUE = createField("value", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>cattle.key_value.revision</code>.
     */
    public final TableField<KeyValueRecord, Long> REVISION = createField("revision", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.key_value.ttl</code>.
     */
    public final TableField<KeyValueRecord, Long> TTL = createField("ttl", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>cattle.key_value</code> table reference
     */
    public KeyValueTable() {
        this("key_value", null);
    }

    /**
     * Create an aliased <code>cattle.key_value</code> table reference
     */
    public KeyValueTable(String alias) {
        this(alias, KEY_VALUE);
    }

    private KeyValueTable(String alias, Table<KeyValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeyValueTable(String alias, Table<KeyValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<KeyValueRecord>> getKeys() {
        return Arrays.<UniqueKey<KeyValueRecord>>asList(Keys.KEY_KEY_VALUE_UIX_KEY_VALUE_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyValueTable as(String alias) {
        return new KeyValueTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyValueTable rename(String name) {
        return new KeyValueTable(name, null);
    }
}
