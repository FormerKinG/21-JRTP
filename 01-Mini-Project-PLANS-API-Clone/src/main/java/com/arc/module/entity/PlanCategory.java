package com.arc.module.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "PLAN_CATEGORY")
public class PlanCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CATEGORY_ID")
	private Integer categoryId;
	
	@Column(name = "CATEGORY_NAME")
	private String categotyName;
	
	@Column(name = "ACTIVATE_SWITCH")
	private String activeSW;
	
	@Column(name = "CRETAED_BY")
	private String createdBy;
	
	@Column(name = "UPADTED_BY")
	private String updatedBy;
	
	@Column(name = "CREATE_DATE")
	@CreationTimestamp
	private LocalDate createDate ; 
	
	@Column(name = "UPDATE_DATE")
	@UpdateTimestamp
	private LocalDate updateDate;

}
