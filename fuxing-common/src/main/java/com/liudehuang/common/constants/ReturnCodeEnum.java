package com.liudehuang.common.constants;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-09
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-09
 * @UpdateRemark:返回状态码枚举
 * @Version: 1.0
 */
public enum ReturnCodeEnum {
    /**
     * 访问成功
     */
    SUCCESS(1000,"成功"),
    /**
     * 访问受限
     */
    ACCESS_DENIED(1001,"访问受限"),
    /**
     * 数据信息不存在
     */
    DATA_NOT_EXIST(1002,"数据信息不存在"),
    /**
     * 数据错误，不符合限定条件
     */
    DATA_ERROR(1003,"数据错误,不符合限定条件"),
    /**
     * 服务器处理异常
     */
    FAILED(1004,"服务器处理异常"),
    /**
     * 数据处理失败
     */
    DATA_PROCESS_FAILED(1005,"数据处理失败"),
    /**
     * 参数错误
     */
    PARAMETER_ERROR(1006,"参数错误"),
    /**
     * 通讯异常
     */
    COMMUNICATION_EXCEPTION(1007,"通讯异常"),
    /**
     * 数据信息已经存在
     */
    DATA_EXIST(1008,"数据已经存在"),
    /**
     * 登录状态已经失效
     */
    TOKEN_INVALID(1009,"登录状态已失效,请重新登录")
    ;
    private Integer code;

    private String msg;

    ReturnCodeEnum(Integer code, String msg) {
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

    /**
     * 根据枚举值获取对应的数据
     * @param code
     * @return
     */
    public static String getValue(Integer code){
        if(code==null){
            return null;
        }
        for(ReturnCodeEnum returnCodeEnum:values()){
            if(code.equals(returnCodeEnum.getCode())){
                return returnCodeEnum.getMsg();
            }
        }
        return null;
    }
}
