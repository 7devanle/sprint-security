package com.example.sprintsecurityapp.repo;

import com.example.sprintsecurityapp.entity.Nodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecureRepository extends JpaRepository<Nodes, Long> {

}
