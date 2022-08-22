package com.arc.module.service;

import java.util.List;
import java.util.Map;

import com.arc.module.entity.Plan;


public interface PlanService {

//	public String getPlans();
	
	//Create / Update Plan Screen
	public Map<Integer, String> getPlanCategories();//1 select / get plan categories in drop down
	
	public boolean savePlan(Plan plan);//2 insert/save plan if true/valid
	
	//ViewPlan Screen
	public List<Plan> getAllPlans();//3 get all the plans
	
	public Plan getPlanById(Integer planId);//4 edit particular plan by ID 
	//& edit Plan object and return   
	
	public boolean updatePlan(Plan plan);//5 update plan if true/valid
	
	public boolean deletePlanById(Integer planId);//6 delete a perticular plan 
	
	//public boolean softDelete(Integer planId, String activeSW);//7 remove record temporary on UI
	public boolean planStatusChange(Integer planId, String status);//7 remove record temporary on UI
	
	
}
