/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.tables.HibernateSequence;
import nu.studer.sample.tables.Tweet;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BbsTest extends SchemaImpl {

    private static final long serialVersionUID = -1480379878;

    /**
     * The reference instance of <code>bbs_test</code>
     */
    public static final BbsTest BBS_TEST = new BbsTest();

    /**
     * The table <code>bbs_test.hibernate_sequence</code>.
     */
    public final HibernateSequence HIBERNATE_SEQUENCE = HibernateSequence.HIBERNATE_SEQUENCE;

    /**
     * The table <code>bbs_test.tweet</code>.
     */
    public final Tweet TWEET = Tweet.TWEET;

    /**
     * No further instances allowed
     */
    private BbsTest() {
        super("bbs_test", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            HibernateSequence.HIBERNATE_SEQUENCE,
            Tweet.TWEET);
    }
}
