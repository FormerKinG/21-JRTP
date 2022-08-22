package com.arc.module.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arc.module.entity.PlanCategory;

public interface PlanCategoryRepo extends JpaRepository<PlanCategory, Integer> {

}
