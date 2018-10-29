/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;

import tjcbs.jooq.db.tables.CbsSimpleLoanPaymentSchedule;
import tjcbs.jooq.db.tables.records.CbsSimpleLoanPaymentScheduleRecord;


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
public class CbsSimpleLoanPaymentScheduleDao extends DAOImpl<CbsSimpleLoanPaymentScheduleRecord, tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule, Record2<String, String>> {

    /**
     * Create a new CbsSimpleLoanPaymentScheduleDao without any configuration
     */
    public CbsSimpleLoanPaymentScheduleDao() {
        super(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE, tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule.class);
    }

    /**
     * Create a new CbsSimpleLoanPaymentScheduleDao with an attached configuration
     */
    public CbsSimpleLoanPaymentScheduleDao(Configuration configuration) {
        super(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE, tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule object) {
        return compositeKeyRecord(object.getId(), object.getLoanId());
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchById(String... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.ID, values);
    }

    /**
     * Fetch records that have <code>LOAN_ID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchByLoanId(String... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.LOAN_ID, values);
    }

    /**
     * Fetch records that have <code>NINO IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchByNino(String... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.NINO, values);
    }

    /**
     * Fetch records that have <code>CASA_ID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchByCasaId(String... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.CASA_ID, values);
    }

    /**
     * Fetch records that have <code>AMOUNT_DUE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchByAmountDue(Double... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.AMOUNT_DUE, values);
    }

    /**
     * Fetch records that have <code>PRINCIPAL_DUE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchByPrincipalDue(Double... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.PRINCIPAL_DUE, values);
    }

    /**
     * Fetch records that have <code>INTEREST_DUE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchByInterestDue(Double... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.INTEREST_DUE, values);
    }

    /**
     * Fetch records that have <code>AT_DATE IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchByAtDate(Integer... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.AT_DATE, values);
    }

    /**
     * Fetch records that have <code>STATUS IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsSimpleLoanPaymentSchedule> fetchByStatus(String... values) {
        return fetch(CbsSimpleLoanPaymentSchedule.CBS_SIMPLE_LOAN_PAYMENT_SCHEDULE.STATUS, values);
    }
}