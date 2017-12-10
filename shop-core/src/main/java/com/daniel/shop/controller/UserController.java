/**
 * @author    fengyu
 * @filename  2016年4月19日-UserController.java
 * @time      上午12:14:12
 * @classname UserController
 */
package com.daniel.shop.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniel.shop.entities.User;
import com.daniel.shop.service.IUserService;

/**
 * @author fengyu
 * @time 2016年4月19日::上午12:14:12
 *
 */
@Controller
@RequestMapping("/user")
public class UserController
{
	@Resource
	private IUserService userService;

	@RequestMapping("/index")
	public String userIndex(HttpServletRequest request, Model model){
		return "/user/login";
	}

	@RequestMapping("/login")
	public String userLogin(HttpServletRequest request, Model model)
	{
		final User user = this.userService.getUserById( 1 );
		model.addAttribute( "user", user );
		return "/user/success";
	}
}
