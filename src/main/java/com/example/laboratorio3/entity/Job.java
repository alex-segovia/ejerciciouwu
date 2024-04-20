package com.example.laboratorio3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @Size(max = 10)
    @Column(name = "job_id", nullable = false, length = 10)
    private String jobId;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    //TODO [JPA Buddy] generate columns from DB
}