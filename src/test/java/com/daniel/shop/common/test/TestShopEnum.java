/**
 * @author    fengyu
 * @filename  2016年4月23日-TestShopEnum.java
 * @time      下午9:36:43
 * @classname TestShopEnum
 */
package com.daniel.shop.common.test;

import org.junit.Assert;
import org.junit.Test;

import com.daniel.shop.common.ShopEnum;

/**
 * @author fengyu
 * @time 2016年4月23日::下午9:36:43
 *
 */
public class TestShopEnum
{
	@Test
	public void testGetErrorMsg(){
		Assert.assertEquals( "用户不存在", ShopEnum.getErrorMsg( 1 ) );
	}

	@Test
	public void testGetErrorMsg1()
	{
		Assert.assertNotEquals( "用户不存在", ShopEnum.getErrorMsg( 3 ) );
	}

	@Test
	public void testGetErrorMsg2()
	{
		Assert.assertEquals( "未知错误", ShopEnum.getErrorMsg( 2 ) );
	}
}
