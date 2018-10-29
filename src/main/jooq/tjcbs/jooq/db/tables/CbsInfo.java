/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import tjcbs.jooq.db.App;
import tjcbs.jooq.db.Keys;
import tjcbs.jooq.db.tables.records.CbsInfoRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CbsInfo extends TableImpl<CbsInfoRecord> {

    private static final long serialVersionUID = 1078717617;

    /**
     * The reference instance of <code>APP.CBS_INFO</code>
     */
    public static final CbsInfo CBS_INFO = new CbsInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CbsInfoRecord> getRecordType() {
        return CbsInfoRecord.class;
    }

    /**
     * The column <code>APP.CBS_INFO.PARTNER_ID</code>.
     */
    public final TableField<CbsInfoRecord, String> PARTNER_ID = createField("PARTNER_ID", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>APP.CBS_INFO.VERSION</code>.
     */
    public final TableField<CbsInfoRecord, Integer> VERSION = createField("VERSION", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>APP.CBS_INFO</code> table reference
     */
    public CbsInfo() {
        this(DSL.name("CBS_INFO"), null);
    }

    /**
     * Create an aliased <code>APP.CBS_INFO</code> table reference
     */
    public CbsInfo(String alias) {
        this(DSL.name(alias), CBS_INFO);
    }

    /**
     * Create an aliased <code>APP.CBS_INFO</code> table reference
     */
    public CbsInfo(Name alias) {
        this(alias, CBS_INFO);
    }

    private CbsInfo(Name alias, Table<CbsInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private CbsInfo(Name alias, Table<CbsInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CbsInfo(Table<O> child, ForeignKey<O, CbsInfoRecord> key) {
        super(child, key, CBS_INFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return App.APP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CbsInfoRecord> getPrimaryKey() {
        return Keys.CBS_INFO_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CbsInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<CbsInfoRecord>>asList(Keys.CBS_INFO_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsInfo as(String alias) {
        return new CbsInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsInfo as(Name alias) {
        return new CbsInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CbsInfo rename(String name) {
        return new CbsInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CbsInfo rename(Name name) {
        return new CbsInfo(name, null);
    }
}
