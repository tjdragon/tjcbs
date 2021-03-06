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
public class CbsCreditAccount implements Serializable {

    private static final long serialVersionUID = 1631067183;

    private String  id;
    private String  nino;
    private String  name;
    private String  label;
    private Integer tdate;
    private Integer ttime;
    private Double  amount;

    public CbsCreditAccount() {}

    public CbsCreditAccount(CbsCreditAccount value) {
        this.id = value.id;
        this.nino = value.nino;
        this.name = value.name;
        this.label = value.label;
        this.tdate = value.tdate;
        this.ttime = value.ttime;
        this.amount = value.amount;
    }

    public CbsCreditAccount(
        String  id,
        String  nino,
        String  name,
        String  label,
        Integer tdate,
        Integer ttime,
        Double  amount
    ) {
        this.id = id;
        this.nino = nino;
        this.name = name;
        this.label = label;
        this.tdate = tdate;
        this.ttime = ttime;
        this.amount = amount;
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

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getTdate() {
        return this.tdate;
    }

    public void setTdate(Integer tdate) {
        this.tdate = tdate;
    }

    public Integer getTtime() {
        return this.ttime;
    }

    public void setTtime(Integer ttime) {
        this.ttime = ttime;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CbsCreditAccount (");

        sb.append(id);
        sb.append(", ").append(nino);
        sb.append(", ").append(name);
        sb.append(", ").append(label);
        sb.append(", ").append(tdate);
        sb.append(", ").append(ttime);
        sb.append(", ").append(amount);

        sb.append(")");
        return sb.toString();
    }
}
