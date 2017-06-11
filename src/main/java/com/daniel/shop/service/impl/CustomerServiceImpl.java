/**
 * @author    fengyu
 * @filename  2016年4月23日-CustomerServiceImpl.java
 * @time      下午11:38:57
 * @classname CustomerServiceImpl
 */
package com.daniel.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.daniel.shop.dao.CustomerMapper;
import com.daniel.shop.entities.Customer;
import com.daniel.shop.service.ICustomerService;

/**
 * @author fengyu
 * @time 2016年4月23日::下午11:38:57
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService
{
	@Resource
	private CustomerMapper customerMapper;

	private static final Logger log = Logger.getLogger( CustomerServiceImpl.class );
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.daniel.shop.service.ICustomerService#getAll()
	 */
	@Override
	public List<Customer> getAll()
	{
		log.info( "get all customer" );
		return customerMapper.queryAll();
	}

}
