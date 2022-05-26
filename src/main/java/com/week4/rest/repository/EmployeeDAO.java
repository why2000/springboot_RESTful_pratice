package com.week4.rest.repository;

import com.week4.rest.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeDAO {
  @Select("SELECT * FROM rest_employee")
  List<Employee> getAllEmployees();
}
