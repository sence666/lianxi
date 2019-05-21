package com.hxzy.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxzy.springmvc.pojo.*;
import com.hxzy.springmvc.pojo.BaseDict;
import com.hxzy.springmvc.pojo.QueryVo;
import com.hxzy.springmvc.service.BaseDictService;
import com.hxzy.springmvc.service.CustomerService;
import com.hxzy.springmvc.utils.Page;

@Controller
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private BaseDictService baseDictService;
	@Autowired
	private CustomerService  customerService;
	
	@RequestMapping("list")
	public String list(Model model,QueryVo vo){
		
		List<BaseDict>  fromType=baseDictService.getBaseDictByCode("002");
		
		List<BaseDict>  industryType=baseDictService.getBaseDictByCode("001");
		
		List<BaseDict>  levelType=baseDictService.getBaseDictByCode("006");
		
		Page<Customer> page=customerService.getCustomerByQueryVo(vo);
		
		model.addAttribute("fromType",fromType);
		model.addAttribute("industryType",industryType);
		model.addAttribute("levelType",levelType);
		model.addAttribute("page",page);
		model.addAttribute("vo",vo);
		return "customer";
		
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Integer id) {
		 Customer c=customerService.getCustomerById(id);
		 System.out.println("45661");
		 System.out.println("569872");
		 return c;
		
	}
	@RequestMapping("update")
	@ResponseBody
	public String update(Customer c) {
		
		customerService.updateCustomer(c);
		return "0";
		
	}
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Integer id) {
		customerService.deleteCustomer(id);
		return "0";
	}
}


