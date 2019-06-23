package com.feicui.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feicui.model.Users;

@Controller
public class IndexController {
	
	@RequestMapping("showIndex")
	public String showIndex(HttpServletRequest request,Model model){
		Users user=(Users) request.getSession().getAttribute("user");
		if(user!=null){
			model.addAttribute("name", user.getNickname());
		}
		return "index";
	}
	@RequestMapping("/")
	public String showIndex1(Model model,Integer page){
//		
		return "login";
	}
	
	
	@RequestMapping("showAdminIndex")
	public String showAdminIndex(HttpServletRequest request, HttpServletResponse resp, Model model){
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		if(user == null)
		{
			model.addAttribute("power", false);   
			return "jump";
		}
		//System.err.println(user);
		String role = user.getRole();
		if("admin".equals(role)){
			model.addAttribute("name", user.getNickname());
			return "admin/index";
		}
			model.addAttribute("power", false);
			return "jump";
	}
	
	

}
