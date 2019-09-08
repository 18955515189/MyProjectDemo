package com.example.myproject.service.impl;

import com.example.myproject.service.TableMigration;
import com.example.myproject.jooq.tables.records.EmployeeRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.example.myproject.jooq.Tables.EMPLOYEE;
@Service
public class EmployeeTableMigration  implements TableMigration{

    private static final Integer MAX_BATCH=10;
    @Autowired
    private DSLContext create;

    @Override
    public void migrate() {
        Result<EmployeeRecord> employeeRecords = create.selectFrom(EMPLOYEE).where(EMPLOYEE.EMP_NAME.startsWith("AAA")).fetch();
        //批量修改 方法1 （可能出现数据量过大的问题）
        //create.batchUpdate(employeeRecords.stream().map(this::exchange).collect(Collectors.toList())).execute();
        //批量修改 方法2 （使用stream，可以按照自己定义的最大数量分批执行）
        List<EmployeeRecord> batch = new ArrayList<>();
        employeeRecords.stream().map(this::exchange).forEach(employeeRecord->{
            employeeRecord.setAge(20);
            batch.add(employeeRecord);
            if(batch.size()>MAX_BATCH){
                create.batchUpdate(batch).execute();
                batch.clear();
            }
        });
        create.batchUpdate(batch).execute();
    }

    public EmployeeRecord exchange(EmployeeRecord record){
        record.setAge(27);
        return record;
    }
}
