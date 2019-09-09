package com.ayan.springdatarest.department.repo;

import org.springframework.data.repository.CrudRepository;

import com.ayan.springdatarest.department.entity.Department;

public interface DepartmentRepositories extends CrudRepository<Department, Long> {

}
