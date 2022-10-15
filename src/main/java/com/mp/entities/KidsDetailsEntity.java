package com.mp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "dc_childrens")
public class KidsDetailsEntity {
	private int childrenId;
	private int caseNo;
	private String kidName;
	private int age;
	private int kidSsn;
}
