package com.week4.rest.service;

import com.week4.rest.model.Employee;
import com.week4.rest.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private final RestTemplate restTemplate;
  private final EmployeeDAO employeeDAO;

  @Autowired
  public EmployeeServiceImpl(RestTemplate restTemplate, EmployeeDAO employeeDAO) {
    this.restTemplate = restTemplate;
    this.employeeDAO = employeeDAO;
  }


  @Override
  public List<Employee> getEmployeeOlderThan(int age){
    List<Employee> employeeList = employeeDAO.getAllEmployees();
    List<Employee> res = new LinkedList<>();
    for(Employee employee : employeeList) {
      if(employee.getAge() > age) {
        res.add(employee);
      }
    }
    return res;
  }

  @Override
  public Map<Integer, List<Employee>> getEmployeeGroupedByAge(){
    List<Employee> employeeList = employeeDAO.getAllEmployees();
    Map<Integer, List<Employee>> res = new HashMap<>();
    for(Employee employee : employeeList) {
      res.put(employee.getAge(), res.getOrDefault(employee.getAge(), new LinkedList<>()));
      res.get(employee.getAge()).add(employee);
    }
    return res;
  }



}
