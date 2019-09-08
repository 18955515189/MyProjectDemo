package com.example.myproject;

import com.example.myproject.jooq.service.impl.EmployeeTableMigration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyprojectApplicationTests {

    @Autowired
    private EmployeeTableMigration employeeTableMigration;

    @Test
    public void contextLoads() {

        employeeTableMigration.migrate();
    }

}
