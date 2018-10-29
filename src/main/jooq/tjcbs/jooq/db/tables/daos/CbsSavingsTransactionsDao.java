/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record3;
import org.jooq.impl.DAOImpl;

import tjcbs.jooq.db.tables.CbsSavingsTransactions;
import tjcbs.jooq.db.tables.records.CbsSavingsTransactionsRecord;


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
public class CbsSavingsTransactionsDao extends DAOImpl<CbsSavingsTransactionsRecord, tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions, Record3<String, String, String>> {

    /**
     * Create a new CbsSavingsTransactionsDao without any configuration
     */
    public CbsSavingsTransactionsDao() {
        super(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS, tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions.class);
    }

    /**
     * Create a new CbsSavingsTransactionsDao with an attached configuration
     */
    public CbsSavingsTransactionsDao(Configuration configuration) {
        super(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS, tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record3<String, String, String> getId(tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions object) {
        return compositeKeyRecord(object.getId(), object.getNino(), object.getTxid());
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions> fetchById(String... values) {
        return fetch(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS.ID, values);
    }

    /**
     * Fetch records that have <code>NINO IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions> fetchByNino(String... values) {
        return fetch(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS.NINO, values);
    }

    /**
     * Fetch records that have <code>TXID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions> fetchByTxid(String... values) {
        return fetch(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS.TXID, values);
    }

    /**
     * Fetch records that have <code>LABEL IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions> fetchByLabel(String... values) {
        return fetch(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS.LABEL, values);
    }

    /**
     * Fetch records that have <code>TDATE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions> fetchByTdate(Integer... values) {
        return fetch(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS.TDATE, values);
    }

    /**
     * Fetch records that have <code>TTIME IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions> fetchByTtime(Integer... values) {
        return fetch(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS.TTIME, values);
    }

    /**
     * Fetch records that have <code>AMOUNT IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSavingsTransactions> fetchByAmount(Double... values) {
        return fetch(CbsSavingsTransactions.CBS_SAVINGS_TRANSACTIONS.AMOUNT, values);
    }
}