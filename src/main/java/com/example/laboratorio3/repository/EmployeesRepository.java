package com.example.laboratorio3.repository;


import com.example.laboratorio3.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.entity.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;
import java.util.List;

import java.util.List;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
    List<Employees> findByEmployee_id(int employee_id);


    @Query(value = "select * from employees e inner join department d on e.department_id=d.department_id inner join job_history j on e.employee_id=j.employee_id where e.first_name like %?1% or e.last_name like %?1% or d.department_name like %?1% or j.employee_id  like %?1% ",nativeQuery = true)
    List<Employees> searchEmployees(String text);
    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "")
    void actualizar





public interface EmployeesRepository extends JpaRepository<Employees,Integer> {
    @Query(nativeQuery = true,value = "select first_name, last_name, salary from employees where salary>15000")
    List<Employees> listarPorMayorSalario();
}
