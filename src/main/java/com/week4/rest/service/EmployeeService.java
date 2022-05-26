package com.week4.rest.service;

import com.week4.rest.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface EmployeeService {

  public List<Employee> getEmployeeOlderThan(int age);


  public Map<Integer, List<Employee>> getEmployeeGroupedByAge();


}
