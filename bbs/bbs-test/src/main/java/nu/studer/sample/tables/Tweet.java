/*
 * This file is generated by jOOQ.
 */
package nu.studer.sample.tables;


import java.util.Arrays;
import java.util.List;

import nu.studer.sample.BbsTest;
import nu.studer.sample.Keys;
import nu.studer.sample.tables.records.TweetRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tweet extends TableImpl<TweetRecord> {

    private static final long serialVersionUID = 1632927460;

    /**
     * The reference instance of <code>bbs_test.tweet</code>
     */
    public static final Tweet TWEET = new Tweet();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TweetRecord> getRecordType() {
        return TweetRecord.class;
    }

    /**
     * The column <code>bbs_test.tweet.id</code>.
     */
    public final TableField<TweetRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>bbs_test.tweet.name</code>.
     */
    public final TableField<TweetRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>bbs_test.tweet.text</code>.
     */
    public final TableField<TweetRecord, String> TEXT = createField(DSL.name("text"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>bbs_test.tweet</code> table reference
     */
    public Tweet() {
        this(DSL.name("tweet"), null);
    }

    /**
     * Create an aliased <code>bbs_test.tweet</code> table reference
     */
    public Tweet(String alias) {
        this(DSL.name(alias), TWEET);
    }

    /**
     * Create an aliased <code>bbs_test.tweet</code> table reference
     */
    public Tweet(Name alias) {
        this(alias, TWEET);
    }

    private Tweet(Name alias, Table<TweetRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tweet(Name alias, Table<TweetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Tweet(Table<O> child, ForeignKey<O, TweetRecord> key) {
        super(child, key, TWEET);
    }

    @Override
    public Schema getSchema() {
        return BbsTest.BBS_TEST;
    }

    @Override
    public Identity<TweetRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TWEET;
    }

    @Override
    public UniqueKey<TweetRecord> getPrimaryKey() {
        return Keys.KEY_TWEET_PRIMARY;
    }

    @Override
    public List<UniqueKey<TweetRecord>> getKeys() {
        return Arrays.<UniqueKey<TweetRecord>>asList(Keys.KEY_TWEET_PRIMARY);
    }

    @Override
    public Tweet as(String alias) {
        return new Tweet(DSL.name(alias), this);
    }

    @Override
    public Tweet as(Name alias) {
        return new Tweet(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tweet rename(String name) {
        return new Tweet(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tweet rename(Name name) {
        return new Tweet(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
