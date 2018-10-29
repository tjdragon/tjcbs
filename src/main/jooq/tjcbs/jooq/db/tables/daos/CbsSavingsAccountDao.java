/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;

import tjcbs.jooq.db.tables.CbsSavingsAccount;
import tjcbs.jooq.db.tables.records.CbsSavingsAccountRecord;


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
public class CbsSavingsAccountDao extends DAOImpl<CbsSavingsAccountRecord, tjcbs.jooq.db.tables.pojos.CbsSavingsAccount, Record2<String, String>> {

    /**
     * Create a new CbsSavingsAccountDao without any configuration
     */
    public CbsSavingsAccountDao() {
        super(CbsSavingsAccount.CBS_SAVINGS_ACCOUNT, tjcbs.jooq.db.tables.pojos.CbsSavingsAccount.class);
    }

    /**
     * Create a new CbsSavingsAccountDao with an attached configuration
     */
    public CbsSavingsAccountDao(Configuration configuration) {
        super(CbsSavingsAccount.CBS_SAVINGS_ACCOUNT, tjcbs.jooq.db.tables.pojos.CbsSavingsAccount.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(tjcbs.jooq.db.tables.pojos.CbsSavingsAccount object) {
        return compositeKeyRecord(object.getId(), object.getNino());
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsAccount> fetchById(String... values) {
        return fetch(CbsSavingsAccount.CBS_SAVINGS_ACCOUNT.ID, values);
    }

    /**
     * Fetch records that have <code>NINO IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsAccount> fetchByNino(String... values) {
        return fetch(CbsSavingsAccount.CBS_SAVINGS_ACCOUNT.NINO, values);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsAccount> fetchByName(String... values) {
        return fetch(CbsSavingsAccount.CBS_SAVINGS_ACCOUNT.NAME, values);
    }

    /**
     * Fetch records that have <code>CCY IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsAccount> fetchByCcy(String... values) {
        return fetch(CbsSavingsAccount.CBS_SAVINGS_ACCOUNT.CCY, values);
    }

    /**
     * Fetch records that have <code>BALANCE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsAccount> fetchByBalance(Double... values) {
        return fetch(CbsSavingsAccount.CBS_SAVINGS_ACCOUNT.BALANCE, values);
    }

    /**
     * Fetch records that have <code>INTEREST IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsAccount> fetchByInterest(Double... values) {
        return fetch(CbsSavingsAccount.CBS_SAVINGS_ACCOUNT.INTEREST, values);
    }
}
