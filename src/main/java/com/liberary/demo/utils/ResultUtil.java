package com.liberary.demo.utils;

import com.liberary.demo.dto.ResultSetOfError;
import com.liberary.demo.enums.ErrorEnum;

/**自定义的公共工具类
 * @author ly
 *
 */
public class ResultUtil {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ResultSetOfError error(Integer code,String msg) {
		ResultSetOfError resultSet=new ResultSetOfError();
		resultSet.setCode(code);
		resultSet.setMsg(msg);
		resultSet.setData(null);
		return resultSet;
	}
	
	@SuppressWarnings("rawtypes")
	public static ResultSetOfError success() {
		return success(null);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ResultSetOfError success(Object object) {
		ResultSetOfError resultSet=new ResultSetOfError();
		resultSet.setCode(ErrorEnum.SUCCESS.getCode());
		resultSet.setMsg(ErrorEnum.SUCCESS.getMsg());
		resultSet.setData(object);
		return resultSet;
	}
	
	public static boolean stringNotNull(String s) {
		if(s!=null&&!"".equals(s))
			return true;
		else
			return false;
	}
}
