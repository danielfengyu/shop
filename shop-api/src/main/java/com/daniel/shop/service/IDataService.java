/**
 * @author    fengyu
 * @filename  2016年6月15日-IDataService.java
 * @time      下午6:48:28
 * @classname IDataService
 */
package com.daniel.shop.service;

import java.util.List;

import com.daniel.shop.exception.ShopException;


/**
 * @author fengyu
 * @time 2016年6月15日::下午6:48:28
 *
 */
public interface IDataService<Mode, PK>
{
	/**
	 * 新增
	 * 
	 * @author fengyu
	 * @time 2016年6月15日::下午6:49:36
	 * @return boolean
	 * @return
	 * @throws ShopException
	 */
	boolean add(Mode model) throws ShopException;

	/**
	 * 删除
	 * 
	 * @author fengyu
	 * @time 2016年6月15日::下午6:52:11
	 * @return boolean
	 * @param t
	 * @return
	 * @throws ShopException
	 */
	boolean delete(Mode mode) throws ShopException;

	/**
	 * 修改
	 * 
	 * @author fengyu
	 * @time 2016年6月15日::下午6:52:22
	 * @return boolean
	 * @param t
	 * @return
	 * @throws ShopException
	 */
	boolean update(Mode model) throws ShopException;

	/**
	 * 按主键查询
	 * 
	 * @author fengyu
	 * @time 2016年6月15日::下午6:52:38
	 * @return List<T>
	 * @param t
	 * @return
	 * @throws ShopException
	 */
	Mode query(PK pk) throws ShopException;

	/**
	 * 查询所有
	 * 
	 * @author fengyu
	 * @time 2016年6月15日::下午6:56:11
	 * @return List<Mode>
	 * @return
	 * @throws ShopException
	 */
	List<Mode> queryAll() throws ShopException;
}
