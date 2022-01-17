package com.liceu.demohibernate.models;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "job_id", nullable = true)
    Job job;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable
    public Job getJob() {
        return job;
    }

    public void setJob(@Nullable Job job) {
        this.job = job;
    }
}
