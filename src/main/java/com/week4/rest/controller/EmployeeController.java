package com.week4.rest.controller;

import com.week4.rest.model.Employee;
import com.week4.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

  private final EmployeeService employeeService;

  @Autowired
  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping("/api1/{age}")
  public ResponseEntity<List<Employee>> getEmployeeOlderThan(@PathVariable int age) {
    List<Employee> res = employeeService.getEmployeeOlderThan(age);
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

  @GetMapping("/api2")
  public ResponseEntity<Map<Integer, List<Employee>>> getEmployeeGroupedByAge(){
    Map<Integer, List<Employee>> res = employeeService.getEmployeeGroupedByAge();
    return new ResponseEntity<>(res, HttpStatus.OK);
  }

}
