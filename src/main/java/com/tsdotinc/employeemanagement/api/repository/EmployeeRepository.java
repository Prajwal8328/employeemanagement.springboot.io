package com.tsdotinc.employeemanagement.api.repository;

import com.tsdotinc.employeemanagement.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeById(Long id);
}

