package com.mp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mp.entities.KidsDetailsEntity;

public interface KidsDetailsRepository extends JpaRepository<KidsDetailsEntity, Serializable>{

}
