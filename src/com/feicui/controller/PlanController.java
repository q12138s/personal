package com.feicui.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feicui.model.Plan;
import com.feicui.model.Users;
import com.feicui.service.PlanService;
@Controller
public class PlanController {
	@Autowired
	private PlanService PlanService;

	@RequestMapping("tiaozhuanPlansList")
	public String tiaozhuanzhangjie(Model model,HttpServletRequest request,HttpServletResponse resp){
		Plan plan=new Plan();
		Users user=(Users) request.getSession().getAttribute("user");
		plan.setUserid(user.getId());
		List<Plan> PlansList=PlanService.findPlansList(plan);
		model.addAttribute("PlansList", PlansList);
		return "planslist";
	}
	@RequestMapping("tiaozhuanadminPlansList")
	public String tiaozhuanadminPlansList(Model model,HttpServletRequest request,HttpServletResponse resp){
		Plan plan=new Plan();
		Users user=(Users) request.getSession().getAttribute("user");
		plan.setUserid(user.getId());
		plan.setState("已提交");
		List<Plan> PlansList=PlanService.findadminPlansList(plan);
		model.addAttribute("PlansList", PlansList);
		return "admin/planslist";
	}
	@RequestMapping("addPlantiaozhuan")
	public String adduesrtiaozhuan(){
		
		return "addPlan";
	}
	@RequestMapping("addPlan")
	public String addPlan(HttpServletRequest request,HttpServletResponse resp,Plan Plan,Model model){
		Users user=(Users) request.getSession().getAttribute("user");
		Plan.setUserid(user.getId());
		PlanService.savePlans(Plan);
		Plan plan=new Plan();
		plan.setUserid(user.getId());
		List<Plan> PlansList=PlanService.findPlansList(plan);
		model.addAttribute("PlansList", PlansList);
		return "planslist";
	}
	@RequestMapping("updatePlantiaozhuan")
	public String updatePlantiaozhuan(HttpServletRequest request,HttpServletResponse resp,Model model,Plan Plan){
		model.addAttribute("Plan", Plan);
		return "updatePlan";
	}
	@RequestMapping("Planjindutiaozhuan")
	public String Planjindutiaozhuan(HttpServletRequest request,HttpServletResponse resp,Model model,Plan Plan){
		model.addAttribute("Plan", Plan);
		return "planjindu";
	}
	@RequestMapping("updatePlan")
	public String updatePlan(HttpServletRequest request,HttpServletResponse resp,Plan Plan,Model model){
		Users user=(Users) request.getSession().getAttribute("user");
		Plan.setUserid(user.getId());
		PlanService.updatePlans(Plan);
		Plan plan=new Plan();
		
		plan.setUserid(user.getId());
		List<Plan> PlansList=PlanService.findPlansList(Plan);
		model.addAttribute("PlansList", PlansList);
		return "planslist";
	}
	@RequestMapping("deletePlan")
	public String deletePlan(Model model,HttpServletRequest request,HttpServletResponse resp,Plan Plan){
		Users user=(Users) request.getSession().getAttribute("user");
		PlanService.delPlans(Plan.getPlanid());
		Plan plan=new Plan();
		plan.setUserid(user.getId());
		List<Plan> PlansList=PlanService.findPlansList(plan);
		model.addAttribute("PlansList", PlansList);
		return "planslist";
	}
	@RequestMapping(value="submitPlan")
	public String submitPlan(HttpServletRequest request,HttpServletResponse resp,Plan Plan,Model model){
		Users user=(Users) request.getSession().getAttribute("user");
		Plan.setUserid(user.getId());
		PlanService.updatePlans(Plan);
		Plan plan=new Plan();
		plan.setUserid(user.getId());
		List<Plan> PlansList=PlanService.findPlansList(Plan);
		model.addAttribute("PlansList", PlansList);
		return "planslist";
	}
	@RequestMapping(value="remindPlan")
	public String remindPlan(HttpServletRequest request,HttpServletResponse resp,Plan Plan,Model model){
		
		Plan=PlanService.findPlanById(Plan.getPlanid());
		Plan.setComment("请尽快完成");
		PlanService.updatePlans(Plan);
		List<Plan> PlansList=PlanService.findadminPlansList(Plan);
		model.addAttribute("PlansList", PlansList);
		return "admin/planslist";
	}
	
}
