package com.example.employeeDemo;

import com.example.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import java.util.Date;

public class DemoApp {

    @Autowired
    EmployeeRepository employeeRepository;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    public void run(String... args) throws Exception {



        Employees kostis = new Employees();
        kostis.setLastName("Giannopoulos");
        kostis.setDepartment("IT");
        kostis.setHireDate(2001-03-10);


        EmployeeRepository.save(kostis);


        }

    }
