/**
 * @author    fengyu
 * @filename  2016年4月18日-UserService.java
 * @time      下午10:52:16
 * @classname UserService
 */
package com.daniel.shop.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private static final Logger LOG = LoggerFactory.getLogger( UserServiceImpl.class );
	@Resource
	private UserMapper userMapper;

	@Override
	public User getUserById(int userId)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug( "acquire user userId:{}", userId );
		}
		return this.userMapper.selectByPrimaryKey( userId );
	}
}
