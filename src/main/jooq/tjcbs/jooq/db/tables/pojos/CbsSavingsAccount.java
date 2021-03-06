/*
 * This file is generated by jOOQ.
 */
package tjcbs.jooq.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class CbsSavingsAccount implements Serializable {

    private static final long serialVersionUID = -1471353289;

    private String id;
    private String nino;
    private String name;
    private String ccy;
    private Double balance;
    private Double interest;

    public CbsSavingsAccount() {}

    public CbsSavingsAccount(CbsSavingsAccount value) {
        this.id = value.id;
        this.nino = value.nino;
        this.name = value.name;
        this.ccy = value.ccy;
        this.balance = value.balance;
        this.interest = value.interest;
    }

    public CbsSavingsAccount(
        String id,
        String nino,
        String name,
        String ccy,
        Double balance,
        Double interest
    ) {
        this.id = id;
        this.nino = nino;
        this.name = name;
        this.ccy = ccy;
        this.balance = balance;
        this.interest = interest;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNino() {
        return this.nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCcy() {
        return this.ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getInterest() {
        return this.interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CbsSavingsAccount (");

        sb.append(id);
        sb.append(", ").append(nino);
        sb.append(", ").append(name);
        sb.append(", ").append(ccy);
        sb.append(", ").append(balance);
        sb.append(", ").append(interest);

        sb.append(")");
        return sb.toString();
    }
}
