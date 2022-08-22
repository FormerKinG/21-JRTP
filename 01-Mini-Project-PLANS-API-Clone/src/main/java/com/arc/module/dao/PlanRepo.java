package com.arc.module.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arc.module.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
