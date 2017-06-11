/**
 * @author    fengyu
 * @filename  2016年4月23日-ShopEnum.java
 * @time      下午9:19:30
 * @classname ShopEnum
 */
package com.daniel.shop.common;

/**
 * @author fengyu
 * @time 2016年4月23日::下午9:19:30
 *
 */
public enum ShopEnum
{
	USER_NOT_EXIT("用户不存在", 1);

	private int errCode;
	private String errMsg;

	private ShopEnum(String errMsg, int errCode)
	{
		this.errMsg = errMsg;
		this.errCode = errCode;
	}

	// 根据错误码获取错误信息
	public static String getErrorMsg(int errCode)
	{
		for (final ShopEnum shop : ShopEnum.values())
		{
			if (shop.errCode == errCode)
			{
				return shop.errMsg;
			}
		}
		return ShopConstant.NOT_KNOW_ERR;
	}
	/**
	 * @return the errCode
	 */
	public int getErrCode()
	{
		return errCode;
	}

	/**
	 * @param errCode
	 *            the errCode to set
	 */
	public void setErrCode(int errCode)
	{
		this.errCode = errCode;
	}
}
