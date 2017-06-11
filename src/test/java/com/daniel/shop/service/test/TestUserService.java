/**
 * @author    fengyu
 * @filename  2016年4月18日-TestUserService.java
 * @time      下午11:05:53
 * @classname TestUserService
 */
package com.daniel.shop.service.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.daniel.shop.entities.User;
import com.daniel.shop.service.IUserService;

/**
 * @author fengyu
 * @time 2016年4月18日::下午11:05:53
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestUserService
{
	private static Logger logger = Logger.getLogger( TestUserService.class );
	@Resource
	private IUserService userService;

	@Test
	public void test1()
	{
		final User user = userService.getUserById( 1 );
		logger.info( JSON.toJSONString( user ) );
	}

}
