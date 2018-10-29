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
import tjcbs.jooq.db.tables.records.CbsSimpleLoanRecord;


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
public class CbsSimpleLoan extends TableImpl<CbsSimpleLoanRecord> {

    private static final long serialVersionUID = -2041410397;

    /**
     * The reference instance of <code>APP.CBS_SIMPLE_LOAN</code>
     */
    public static final CbsSimpleLoan CBS_SIMPLE_LOAN = new CbsSimpleLoan();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CbsSimpleLoanRecord> getRecordType() {
        return CbsSimpleLoanRecord.class;
    }

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.ID</code>.
     */
    public final TableField<CbsSimpleLoanRecord, String> ID = createField("ID", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.NINO</code>.
     */
    public final TableField<CbsSimpleLoanRecord, String> NINO = createField("NINO", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.CASA_ID</code>.
     */
    public final TableField<CbsSimpleLoanRecord, String> CASA_ID = createField("CASA_ID", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.FROM_DATE</code>.
     */
    public final TableField<CbsSimpleLoanRecord, Integer> FROM_DATE = createField("FROM_DATE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.TO_DATE</code>.
     */
    public final TableField<CbsSimpleLoanRecord, Integer> TO_DATE = createField("TO_DATE", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.PRINCIPAL</code>.
     */
    public final TableField<CbsSimpleLoanRecord, Double> PRINCIPAL = createField("PRINCIPAL", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.INTEREST</code>.
     */
    public final TableField<CbsSimpleLoanRecord, Double> INTEREST = createField("INTEREST", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.INSTALLMENTS</code>.
     */
    public final TableField<CbsSimpleLoanRecord, Integer> INSTALLMENTS = createField("INSTALLMENTS", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.PAYMENT_DUE</code>.
     */
    public final TableField<CbsSimpleLoanRecord, String> PAYMENT_DUE = createField("PAYMENT_DUE", org.jooq.impl.SQLDataType.VARCHAR(12).nullable(false), this, "");

    /**
     * The column <code>APP.CBS_SIMPLE_LOAN.STATUS</code>.
     */
    public final TableField<CbsSimpleLoanRecord, String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * Create a <code>APP.CBS_SIMPLE_LOAN</code> table reference
     */
    public CbsSimpleLoan() {
        this(DSL.name("CBS_SIMPLE_LOAN"), null);
    }

    /**
     * Create an aliased <code>APP.CBS_SIMPLE_LOAN</code> table reference
     */
    public CbsSimpleLoan(String alias) {
        this(DSL.name(alias), CBS_SIMPLE_LOAN);
    }

    /**
     * Create an aliased <code>APP.CBS_SIMPLE_LOAN</code> table reference
     */
    public CbsSimpleLoan(Name alias) {
        this(alias, CBS_SIMPLE_LOAN);
    }

    private CbsSimpleLoan(Name alias, Table<CbsSimpleLoanRecord> aliased) {
        this(alias, aliased, null);
    }

    private CbsSimpleLoan(Name alias, Table<CbsSimpleLoanRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CbsSimpleLoan(Table<O> child, ForeignKey<O, CbsSimpleLoanRecord> key) {
        super(child, key, CBS_SIMPLE_LOAN);
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
    public UniqueKey<CbsSimpleLoanRecord> getPrimaryKey() {
        return Keys.CBS_SIMPLE_LOAN_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CbsSimpleLoanRecord>> getKeys() {
        return Arrays.<UniqueKey<CbsSimpleLoanRecord>>asList(Keys.CBS_SIMPLE_LOAN_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CbsSimpleLoanRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CbsSimpleLoanRecord, ?>>asList(Keys.SQL181029115214590);
    }

    public CbsCustomer cbsCustomer() {
        return new CbsCustomer(this, Keys.SQL181029115214590);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsSimpleLoan as(String alias) {
        return new CbsSimpleLoan(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsSimpleLoan as(Name alias) {
        return new CbsSimpleLoan(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CbsSimpleLoan rename(String name) {
        return new CbsSimpleLoan(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CbsSimpleLoan rename(Name name) {
        return new CbsSimpleLoan(name, null);
    }
}