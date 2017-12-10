/**
 * @author    fengyu
 * @filename  2016年4月20日-ShopException.java
 * @time      下午11:03:42
 * @classname ShopException
 */
package com.daniel.shop.exception;

/**
 * @author fengyu
 * @time 2016年4月20日::下午11:03:42
 *
 */
public class ShopException extends Exception
{
	private static final long serialVersionUID = 1L;
	// 错误码
	private String errorCode;
	// 错误信息
	private String errorMsg;

	public ShopException()
	{
		super();
	}

	public ShopException(String msg)
	{
		super( msg );
		this.errorMsg = msg;
	}

	public ShopException(String errorCode, String msg)
	{
		super();
		this.errorCode = errorCode;
		this.errorMsg = msg;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode()
	{
		return errorCode;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorString
	 */
	public String getErrorMsg()
	{
		return errorMsg;
	}

	/**
	 * @param errorString
	 *            the errorString to set
	 */
	public void setErrorMsg(String errorMsg)
	{
		this.errorMsg = errorMsg;
	}
}
