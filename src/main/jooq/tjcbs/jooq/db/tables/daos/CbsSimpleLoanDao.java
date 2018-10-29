/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;

import tjcbs.jooq.db.tables.CbsSimpleLoan;
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
public class CbsSimpleLoanDao extends DAOImpl<CbsSimpleLoanRecord, tjcbs.jooq.db.tables.pojos.CbsSimpleLoan, Record2<String, String>> {

    /**
     * Create a new CbsSimpleLoanDao without any configuration
     */
    public CbsSimpleLoanDao() {
        super(CbsSimpleLoan.CBS_SIMPLE_LOAN, tjcbs.jooq.db.tables.pojos.CbsSimpleLoan.class);
    }

    /**
     * Create a new CbsSimpleLoanDao with an attached configuration
     */
    public CbsSimpleLoanDao(Configuration configuration) {
        super(CbsSimpleLoan.CBS_SIMPLE_LOAN, tjcbs.jooq.db.tables.pojos.CbsSimpleLoan.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(tjcbs.jooq.db.tables.pojos.CbsSimpleLoan object) {
        return compositeKeyRecord(object.getId(), object.getNino());
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchById(String... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.ID, values);
    }

    /**
     * Fetch records that have <code>NINO IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByNino(String... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.NINO, values);
    }

    /**
     * Fetch records that have <code>CASA_ID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByCasaId(String... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.CASA_ID, values);
    }

    /**
     * Fetch records that have <code>FROM_DATE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByFromDate(Integer... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.FROM_DATE, values);
    }

    /**
     * Fetch records that have <code>TO_DATE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByToDate(Integer... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.TO_DATE, values);
    }

    /**
     * Fetch records that have <code>PRINCIPAL IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByPrincipal(Double... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.PRINCIPAL, values);
    }

    /**
     * Fetch records that have <code>INTEREST IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByInterest(Double... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.INTEREST, values);
    }

    /**
     * Fetch records that have <code>INSTALLMENTS IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByInstallments(Integer... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.INSTALLMENTS, values);
    }

    /**
     * Fetch records that have <code>PAYMENT_DUE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByPaymentDue(String... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.PAYMENT_DUE, values);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoan> fetchByStatus(String... values) {
        return fetch(CbsSimpleLoan.CBS_SIMPLE_LOAN.STATUS, values);
    }
}
