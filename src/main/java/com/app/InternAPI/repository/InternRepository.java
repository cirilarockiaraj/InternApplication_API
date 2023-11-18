package com.app.InternAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.InternAPI.model.Interns;

@Repository
public interface InternRepository extends JpaRepository<Interns, Integer> {

}
