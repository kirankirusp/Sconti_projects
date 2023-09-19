package com.example.Scontidemo.model;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class Movie {
    @org.springframework.data.neo4j.core.schema.Id
    private Long Id;
    private String title;
    private String director;

    public Movie() {
    }

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }
}
