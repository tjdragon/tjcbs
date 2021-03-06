/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import tjcbs.jooq.db.tables.CbsCreditAccountLimit;


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
public class CbsCreditAccountLimitRecord extends UpdatableRecordImpl<CbsCreditAccountLimitRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = 1719218644;

    /**
     * Setter for <code>APP.CBS_CREDIT_ACCOUNT_LIMIT.ID</code>.
     */
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>APP.CBS_CREDIT_ACCOUNT_LIMIT.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>APP.CBS_CREDIT_ACCOUNT_LIMIT.NINO</code>.
     */
    public void setNino(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>APP.CBS_CREDIT_ACCOUNT_LIMIT.NINO</code>.
     */
    public String getNino() {
        return (String) get(1);
    }

    /**
     * Setter for <code>APP.CBS_CREDIT_ACCOUNT_LIMIT.MAXIMUM_OVERDRAFT</code>.
     */
    public void setMaximumOverdraft(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>APP.CBS_CREDIT_ACCOUNT_LIMIT.MAXIMUM_OVERDRAFT</code>.
     */
    public Integer getMaximumOverdraft() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CbsCreditAccountLimit.CBS_CREDIT_ACCOUNT_LIMIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CbsCreditAccountLimit.CBS_CREDIT_ACCOUNT_LIMIT.NINO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return CbsCreditAccountLimit.CBS_CREDIT_ACCOUNT_LIMIT.MAXIMUM_OVERDRAFT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNino();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getMaximumOverdraft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNino();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMaximumOverdraft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCreditAccountLimitRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCreditAccountLimitRecord value2(String value) {
        setNino(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCreditAccountLimitRecord value3(Integer value) {
        setMaximumOverdraft(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCreditAccountLimitRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CbsCreditAccountLimitRecord
     */
    public CbsCreditAccountLimitRecord() {
        super(CbsCreditAccountLimit.CBS_CREDIT_ACCOUNT_LIMIT);
    }

    /**
     * Create a detached, initialised CbsCreditAccountLimitRecord
     */
    public CbsCreditAccountLimitRecord(String id, String nino, Integer maximumOverdraft) {
        super(CbsCreditAccountLimit.CBS_CREDIT_ACCOUNT_LIMIT);

        set(0, id);
        set(1, nino);
        set(2, maximumOverdraft);
    }
}
