package com.week4.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "rest_employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private long id;
  @Column(name = "name", nullable = false)
  private String name;
  @Column(name = "salary", nullable = false)
  private int salary;
  @Column(name = "age", nullable = false)
  private int age;



  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", employee_name='" + name + '\'' +
        ", employee_salary=" + salary +
        ", employee_age=" + age +
        '}';
  }




}
