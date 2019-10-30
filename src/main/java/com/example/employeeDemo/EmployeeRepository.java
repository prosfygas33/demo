package com.example.employeeDemo;

import com.example.demo.Tour;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Tour,Long> {
}
