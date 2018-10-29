/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;

import tjcbs.jooq.db.tables.CbsCustomerAddress;


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
public class CbsCustomerAddressRecord extends TableRecordImpl<CbsCustomerAddressRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1608161869;

    /**
     * Setter for <code>APP.CBS_CUSTOMER_ADDRESS.NINO</code>.
     */
    public void setNino(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>APP.CBS_CUSTOMER_ADDRESS.NINO</code>.
     */
    public String getNino() {
        return (String) get(0);
    }

    /**
     * Setter for <code>APP.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_1</code>.
     */
    public void setAddressLine_1(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>APP.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_1</code>.
     */
    public String getAddressLine_1() {
        return (String) get(1);
    }

    /**
     * Setter for <code>APP.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_2</code>.
     */
    public void setAddressLine_2(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>APP.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_2</code>.
     */
    public String getAddressLine_2() {
        return (String) get(2);
    }

    /**
     * Setter for <code>APP.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_3</code>.
     */
    public void setAddressLine_3(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>APP.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_3</code>.
     */
    public String getAddressLine_3() {
        return (String) get(3);
    }

    /**
     * Setter for <code>APP.CBS_CUSTOMER_ADDRESS.CITY</code>.
     */
    public void setCity(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>APP.CBS_CUSTOMER_ADDRESS.CITY</code>.
     */
    public String getCity() {
        return (String) get(4);
    }

    /**
     * Setter for <code>APP.CBS_CUSTOMER_ADDRESS.PROVINCE</code>.
     */
    public void setProvince(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>APP.CBS_CUSTOMER_ADDRESS.PROVINCE</code>.
     */
    public String getProvince() {
        return (String) get(5);
    }

    /**
     * Setter for <code>APP.CBS_CUSTOMER_ADDRESS.POSTCODE</code>.
     */
    public void setPostcode(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>APP.CBS_CUSTOMER_ADDRESS.POSTCODE</code>.
     */
    public String getPostcode() {
        return (String) get(6);
    }

    /**
     * Setter for <code>APP.CBS_CUSTOMER_ADDRESS.COUNTRY</code>.
     */
    public void setCountry(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>APP.CBS_CUSTOMER_ADDRESS.COUNTRY</code>.
     */
    public String getCountry() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CbsCustomerAddress.CBS_CUSTOMER_ADDRESS.NINO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CbsCustomerAddress.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CbsCustomerAddress.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CbsCustomerAddress.CBS_CUSTOMER_ADDRESS.ADDRESS_LINE_3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CbsCustomerAddress.CBS_CUSTOMER_ADDRESS.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CbsCustomerAddress.CBS_CUSTOMER_ADDRESS.PROVINCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CbsCustomerAddress.CBS_CUSTOMER_ADDRESS.POSTCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return CbsCustomerAddress.CBS_CUSTOMER_ADDRESS.COUNTRY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getNino();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAddressLine_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAddressLine_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAddressLine_3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPostcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getNino();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAddressLine_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAddressLine_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAddressLine_3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProvince();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPostcode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCountry();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord value1(String value) {
        setNino(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord value2(String value) {
        setAddressLine_1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord value3(String value) {
        setAddressLine_2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord value4(String value) {
        setAddressLine_3(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord value5(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord value6(String value) {
        setProvince(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord value7(String value) {
        setPostcode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord value8(String value) {
        setCountry(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CbsCustomerAddressRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CbsCustomerAddressRecord
     */
    public CbsCustomerAddressRecord() {
        super(CbsCustomerAddress.CBS_CUSTOMER_ADDRESS);
    }

    /**
     * Create a detached, initialised CbsCustomerAddressRecord
     */
    public CbsCustomerAddressRecord(String nino, String addressLine_1, String addressLine_2, String addressLine_3, String city, String province, String postcode, String country) {
        super(CbsCustomerAddress.CBS_CUSTOMER_ADDRESS);

        set(0, nino);
        set(1, addressLine_1);
        set(2, addressLine_2);
        set(3, addressLine_3);
        set(4, city);
        set(5, province);
        set(6, postcode);
        set(7, country);
    }
}