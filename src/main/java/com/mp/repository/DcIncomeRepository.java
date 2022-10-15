package com.mp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mp.entities.IncomeEnitty;

public interface DcIncomeRepository extends JpaRepository<IncomeEnitty	, Serializable>{

}
