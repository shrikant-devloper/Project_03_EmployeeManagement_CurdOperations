package com.nit.repo;

import org.springframework.data.repository.CrudRepository;

import com.nit.model.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}
