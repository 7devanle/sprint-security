package com.example.sprintsecurityapp.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Nodes {
    @Id
    private Long id;
    private String name;

    public Nodes(Long id) {
        this.id = id;
    }

    public Nodes() {

    }
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
}
