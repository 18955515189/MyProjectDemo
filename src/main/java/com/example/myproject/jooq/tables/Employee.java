/*
 * This file is generated by jOOQ.
 */
package com.example.myproject.jooq.tables;


import com.example.myproject.jooq.Indexes;
import com.example.myproject.jooq.Jooq;
import com.example.myproject.jooq.Keys;
import com.example.myproject.jooq.tables.records.EmployeeRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Employee extends TableImpl<EmployeeRecord> {

    private static final long serialVersionUID = 325195490;

    /**
     * The reference instance of <code>jooq.employee</code>
     */
    public static final Employee EMPLOYEE = new Employee();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeRecord> getRecordType() {
        return EmployeeRecord.class;
    }

    /**
     * The column <code>jooq.employee.id</code>.
     */
    public final TableField<EmployeeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooq.employee.emp_um</code>.
     */
    public final TableField<EmployeeRecord, String> EMP_UM = createField("emp_um", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jooq.employee.emp_name</code>.
     */
    public final TableField<EmployeeRecord, String> EMP_NAME = createField("emp_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jooq.employee.age</code>.
     */
    public final TableField<EmployeeRecord, Integer> AGE = createField("age", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>jooq.employee.address</code>.
     */
    public final TableField<EmployeeRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jooq.employee.tele_num</code>.
     */
    public final TableField<EmployeeRecord, String> TELE_NUM = createField("tele_num", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jooq.employee.create_by</code>.
     */
    public final TableField<EmployeeRecord, String> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jooq.employee.create_date</code>.
     */
    public final TableField<EmployeeRecord, LocalDateTime> CREATE_DATE = createField("create_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>jooq.employee.update_by</code>.
     */
    public final TableField<EmployeeRecord, String> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>jooq.employee.update_date</code>.
     */
    public final TableField<EmployeeRecord, LocalDateTime> UPDATE_DATE = createField("update_date", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>jooq.employee</code> table reference
     */
    public Employee() {
        this(DSL.name("employee"), null);
    }

    /**
     * Create an aliased <code>jooq.employee</code> table reference
     */
    public Employee(String alias) {
        this(DSL.name(alias), EMPLOYEE);
    }

    /**
     * Create an aliased <code>jooq.employee</code> table reference
     */
    public Employee(Name alias) {
        this(alias, EMPLOYEE);
    }

    private Employee(Name alias, Table<EmployeeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Employee(Name alias, Table<EmployeeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Employee(Table<O> child, ForeignKey<O, EmployeeRecord> key) {
        super(child, key, EMPLOYEE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jooq.JOOQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EMPLOYEE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmployeeRecord> getPrimaryKey() {
        return Keys.KEY_EMPLOYEE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmployeeRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployeeRecord>>asList(Keys.KEY_EMPLOYEE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employee as(String alias) {
        return new Employee(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Employee as(Name alias) {
        return new Employee(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(String name) {
        return new Employee(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Employee rename(Name name) {
        return new Employee(name, null);
    }
}
