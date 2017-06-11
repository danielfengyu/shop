/**
 * @author    fengyu
 * @filename  2016年4月18日-UserService.java
 * @time      下午10:52:16
 * @classname UserService
 */
package com.daniel.shop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.daniel.shop.dao.UserMapper;
import com.daniel.shop.entities.User;
import com.daniel.shop.service.IUserService;

/**
 * @author fengyu
 * @time 2016年4月18日::下午10:52:16
 *
 */
@Service("userService")
public class UserServiceImpl implements IUserService
{

	@Resource
	private UserMapper userMapper;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.daniel.shop.service.IUserService#getUserById(int)
	 */
	@Override
	public User getUserById(int userId)
	{
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey( userId );
	}
}
