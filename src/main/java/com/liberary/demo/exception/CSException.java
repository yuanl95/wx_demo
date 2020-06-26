package com.liberary.demo.exception;

import com.liberary.demo.enums.ErrorEnum;

/**自定义的异常类
 * @author ly
 *
 */
public class CSException extends RuntimeException {
/**
	 * 
	 */
	private static final long serialVersionUID = 274368402494615162L;
	private Integer code;
		
		public CSException(ErrorEnum errorEnum) {
			super(errorEnum.getMsg());
			this.code = errorEnum.getCode();
		}
	
		public CSException(String message, Throwable cause) {
			super(message, cause);
			// TODO Auto-generated constructor stub
		}
	
		public CSException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
	
		public Integer getCode() {
			return code;
		}
	
		public void setCode(Integer code) {
			this.code = code;
		}
}
