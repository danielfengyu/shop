/**
 * @author    fengyu
 * @filename  2016年4月23日-CustomerController.java
 * @time      下午11:34:52
 * @classname CustomerController
 */
package com.daniel.shop.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.daniel.shop.entities.Customer;
import com.daniel.shop.service.ICustomerService;

/**
 * @author fengyu
 * @time 2016年4月23日::下午11:34:52
 *
 */
@Controller
@RequestMapping("/customer")
public class CustomerController
{
	@Resource
	private ICustomerService customerService;

	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model)
	{
		return "/customer/list";
	}

	@RequestMapping("/customer-list")
	public String getAll(HttpServletRequest request, Model model)
	{
		final List<Customer> customers = customerService.getAll();
		model.addAttribute( "customers", JSON.toJSON( customers ) );
		return "/customer/customer-list";
	}

	@ResponseBody
	@RequestMapping("/customer-data")
	public List<Customer> customerData(HttpServletRequest request, Model model)
	{
		final List<Customer> customers = customerService.getAll();
		return customers;
	}
}
