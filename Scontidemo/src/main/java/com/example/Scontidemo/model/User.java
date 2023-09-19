package com.example.Scontidemo.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.List;

@Node
public class User {
    @org.springframework.data.neo4j.core.schema.Id
    private Long Id;
    private String name;
    private Integer age;
    @Relationship(type = "RATED",direction = Relationship.INCOMING)
    private List<Movie> movies;
    public List<Movie> getMovies(){
        return movies;
    }
    public User() {
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
