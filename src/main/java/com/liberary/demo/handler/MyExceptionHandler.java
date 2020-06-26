package com.liberary.demo.handler;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liberary.demo.dto.ResultSetOfError;
import com.liberary.demo.enums.ErrorEnum;
import com.liberary.demo.utils.ResultUtil;







/**异常统一处理类
 * @author ly
 *
 */
@ControllerAdvice
public class MyExceptionHandler {
	//记录系统异常
    private final static Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);
	@SuppressWarnings("rawtypes")
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResultSetOfError handle(Exception e){
		//数值转换的异常
        if(e instanceof NumberFormatException){
            return ResultUtil.error(ErrorEnum.NUMBERFORMAT_ERROR.getCode(),ErrorEnum.NUMBERFORMAT_ERROR.getMsg());
        }else {
            logger.error("【系统异常】 {}",e);
            return ResultUtil.error(ErrorEnum.UNKNOW_ERROR.getCode(),e.getMessage());
        }
    }
//	public Map<String,Object> exception(HttpServletRequest req,Exception e){
//		Map<String,Object>modelAndMap=new HashMap<String,Object>();
//		modelAndMap.put("success", false);
//		modelAndMap.put("errorMess", e.getMessage());
//		return modelAndMap;
//	}
}
