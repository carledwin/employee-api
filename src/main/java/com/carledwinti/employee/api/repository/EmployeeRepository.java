package com.carledwinti.employee.api.repository;

import com.carledwinti.employee.api.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}
