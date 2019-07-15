package com.lipengyun.common.utils;


/**
 *  自定义运行时异常类
 * @ClassName: CMSRuntimeException 
 * @Description: TODO
 * @author: 犯人:李某
 * @date: 2019年7月15日 上午8:40:05
 */
public class CMSRuntimeException extends RuntimeException{
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 编写无参异常父类
	 * @Title:CMSRuntimeException
	 * @Description:TODO
	 */
	public CMSRuntimeException() {
		super();
	}
	
	/**
	 * 编写有参父类
	 * @Title:CMSRuntimeException
	 * @Description:TODO 
	 * @param message
	 */
	public CMSRuntimeException(String message) {
		super(message);
	}
	
}
