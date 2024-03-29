/*
 * This file is generated by jOOQ.
 */
package com.example.myproject.jooq.tables.records;


import com.example.myproject.jooq.tables.Person;

import java.time.LocalDate;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonRecord extends UpdatableRecordImpl<PersonRecord> implements Record5<Integer, String, String, LocalDate, String> {

    private static final long serialVersionUID = 1627413051;

    /**
     * Setter for <code>jooq.person.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>jooq.person.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>jooq.person.first</code>.
     */
    public void setFirst(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>jooq.person.first</code>.
     */
    public String getFirst() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jooq.person.last</code>.
     */
    public void setLast(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>jooq.person.last</code>.
     */
    public String getLast() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jooq.person.dateofbirth</code>.
     */
    public void setDateofbirth(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>jooq.person.dateofbirth</code>.
     */
    public LocalDate getDateofbirth() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>jooq.person.placeofbirth</code>.
     */
    public void setPlaceofbirth(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>jooq.person.placeofbirth</code>.
     */
    public String getPlaceofbirth() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, LocalDate, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, LocalDate, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Person.PERSON.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Person.PERSON.FIRST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Person.PERSON.LAST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field4() {
        return Person.PERSON.DATEOFBIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Person.PERSON.PLACEOFBIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLast();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate component4() {
        return getDateofbirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPlaceofbirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirst();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLast();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value4() {
        return getDateofbirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPlaceofbirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value2(String value) {
        setFirst(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value3(String value) {
        setLast(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value4(LocalDate value) {
        setDateofbirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord value5(String value) {
        setPlaceofbirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PersonRecord values(Integer value1, String value2, String value3, LocalDate value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersonRecord
     */
    public PersonRecord() {
        super(Person.PERSON);
    }

    /**
     * Create a detached, initialised PersonRecord
     */
    public PersonRecord(Integer id, String first, String last, LocalDate dateofbirth, String placeofbirth) {
        super(Person.PERSON);

        set(0, id);
        set(1, first);
        set(2, last);
        set(3, dateofbirth);
        set(4, placeofbirth);
    }
}
