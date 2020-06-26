package com.liberary.demo.enums;

/**错误类型枚举类
 * @author ly
 *
 */
public enum ErrorEnum {
	UNKNOW_ERROR(-1,"未知错误"),
	INSERT_ERROR(-2,"插入失败"),
	INSERT_ERROR_WITHOUTEFFECT(-3,"插入失败,无影响行数"),
	NULL_ERROR(-4,"空值异常"),
	UPDATE_ERROR(-5,"修改失败"),
	UPDATE_ERROR_WITHOUTEFFECT(-6,"修改失败,无影响行数"),
	DELETE_ERROR(-7,"删除失败"),
	DELETE_ERROR_WITHOUTEFFECT(-8,"删除失败,无影响行数"),
	FORMART_ERROR(-9,"格式异常"),
	UNIQUE_ERROR(-10,"唯一性异常"),
	CASCADE_ERROR(-11,"级联删除错误"),
	UPLOAD_ERROR(-12,"上传错误"),
	FILE_UPLOAD_NULL(-13,"上传图片为空文件"),
	FINISH_UPDATE_ERROR(-14,"不可更改已完成问题的状态"),
	PROCESS_DELETE_ERROR(-15,"不可删除处理中状态的问题"),
	NUMBERFORMAT_ERROR(-16,"请确认输入的账户为纯数字"),
	FILE_NAME_NULL(-17,"文件名不能为空"),
	FILE_PATH_NULL(-18,"文件路径不存在"),
	NUMBERS_ERROR(-19,"附件数目错误"),
	NUMBERS_ZERO(-20,"附件数目为零"),
	SUCCESS(0,"成功"),
	;
	private Integer code;
	private String msg;
	
	private ErrorEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
