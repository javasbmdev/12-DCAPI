package com.mp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mp.entities.EducationDetailsEntity;

public interface EducationDetailsRepository extends JpaRepository<EducationDetailsEntity, Serializable>{

}
