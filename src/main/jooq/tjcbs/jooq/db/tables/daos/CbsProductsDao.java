/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;

import tjcbs.jooq.db.tables.CbsProducts;
import tjcbs.jooq.db.tables.records.CbsProductsRecord;


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
public class CbsProductsDao extends DAOImpl<CbsProductsRecord, tjcbs.jooq.db.tables.pojos.CbsProducts, Record2<String, String>> {

    /**
     * Create a new CbsProductsDao without any configuration
     */
    public CbsProductsDao() {
        super(CbsProducts.CBS_PRODUCTS, tjcbs.jooq.db.tables.pojos.CbsProducts.class);
    }

    /**
     * Create a new CbsProductsDao with an attached configuration
     */
    public CbsProductsDao(Configuration configuration) {
        super(CbsProducts.CBS_PRODUCTS, tjcbs.jooq.db.tables.pojos.CbsProducts.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(tjcbs.jooq.db.tables.pojos.CbsProducts object) {
        return compositeKeyRecord(object.getPartnerId(), object.getProduct());
    }

    /**
     * Fetch records that have <code>PARTNER_ID IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsProducts> fetchByPartnerId(String... values) {
        return fetch(CbsProducts.CBS_PRODUCTS.PARTNER_ID, values);
    }

    /**
     * Fetch records that have <code>PRODUCT IN (values)</code>
     */
    public List<tjcbs.jooq.db.tables.pojos.CbsProducts> fetchByProduct(String... values) {
        return fetch(CbsProducts.CBS_PRODUCTS.PRODUCT, values);
    }
}
