/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HibernateSequence implements Serializable {

    private static final long serialVersionUID = 1743829609;

    private final Long nextVal;

    public HibernateSequence(HibernateSequence value) {
        this.nextVal = value.nextVal;
    }

    public HibernateSequence(
        Long nextVal
    ) {
        this.nextVal = nextVal;
    }

    public Long getNextVal() {
        return this.nextVal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HibernateSequence (");

        sb.append(nextVal);

        sb.append(")");
        return sb.toString();
    }
}
