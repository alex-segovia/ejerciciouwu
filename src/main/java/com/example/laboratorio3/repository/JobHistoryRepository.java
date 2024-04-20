package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.JobHistory;
import com.example.laboratorio3.entity.JobHistoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, JobHistoryId> {
    @Query(nativeQuery = true,value = "select e.first_name, e.last_name, start_date, end_date, j.job_title from job_history inner join hr.employees e on job_history.employee_id = e.employee_id inner join hr.jobs j on job_history.job_id = j.job_id where e.salary>15000")
    List<JobHistory> listarPorMayorSalario();
}
