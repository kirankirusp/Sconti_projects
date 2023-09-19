package com.example.Scontidemo.repository;

import com.example.Scontidemo.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User,Long> {
    @Query("Match(u:User) <-[r:RATED]-(m:Movie) RETURN u,r,m")
    Collection<User> getAllUsers();
}
