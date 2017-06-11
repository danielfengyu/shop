/**
 * @author    fengyu
 * @filename  2016年4月18日-IUserService.java
 * @time      下午10:51:56
 * @classname IUserService
 */
package com.daniel.shop.service;

import com.daniel.shop.entities.User;

/**
 * @author fengyu
 * @time 2016年4月18日::下午10:51:56
 *
 */
public interface IUserService
{
	public User getUserById(int userId);
}
