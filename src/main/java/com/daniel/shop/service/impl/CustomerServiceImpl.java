/**
 * @author    fengyu
 * @filename  2016年4月23日-CustomerServiceImpl.java
 * @time      下午11:38:57
 * @classname CustomerServiceImpl
 */
package com.daniel.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private static final Logger LOG = LoggerFactory.getLogger( CustomerServiceImpl.class );
	@Override
	public List<Customer> getAll()
	{
		LOG.info( "get all customer" );
		return customerMapper.queryAll();
	}

}
