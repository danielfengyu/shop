/**
 * @author    fengyu
 * @filename  2016年4月23日-ICustomerService.java
 * @time      下午11:38:19
 * @classname ICustomerService
 */
package com.daniel.shop.service;

import java.util.List;

import com.daniel.shop.entities.Customer;

/**
 * @author fengyu
 * @time 2016年4月23日::下午11:38:19
 *
 */
public interface ICustomerService
{
	public List<Customer> getAll();
}
