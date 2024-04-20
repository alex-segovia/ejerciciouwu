package com.example.laboratorio3.repository;


import com.example.laboratorio3.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {
    List<Employees> findByEmployee_id(int employee_id);


    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "")
    void actualizar





}
