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
public class CbsCreditAccountLimit implements Serializable {

    private static final long serialVersionUID = -1836410352;

    private String  id;
    private String  nino;
    private Integer maximumOverdraft;

    public CbsCreditAccountLimit() {}

    public CbsCreditAccountLimit(CbsCreditAccountLimit value) {
        this.id = value.id;
        this.nino = value.nino;
        this.maximumOverdraft = value.maximumOverdraft;
    }

    public CbsCreditAccountLimit(
        String  id,
        String  nino,
        Integer maximumOverdraft
    ) {
        this.id = id;
        this.nino = nino;
        this.maximumOverdraft = maximumOverdraft;
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

    public Integer getMaximumOverdraft() {
        return this.maximumOverdraft;
    }

    public void setMaximumOverdraft(Integer maximumOverdraft) {
        this.maximumOverdraft = maximumOverdraft;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CbsCreditAccountLimit (");

        sb.append(id);
        sb.append(", ").append(nino);
        sb.append(", ").append(maximumOverdraft);

        sb.append(")");
        return sb.toString();
    }
}
