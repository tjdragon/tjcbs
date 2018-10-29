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
public class CbsInfo implements Serializable {

    private static final long serialVersionUID = 968029723;

    private String  partnerId;
    private Integer version;

    public CbsInfo() {}

    public CbsInfo(CbsInfo value) {
        this.partnerId = value.partnerId;
        this.version = value.version;
    }

    public CbsInfo(
        String  partnerId,
        Integer version
    ) {
        this.partnerId = partnerId;
        this.version = version;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CbsInfo (");

        sb.append(partnerId);
        sb.append(", ").append(version);

        sb.append(")");
        return sb.toString();
    }
}
