package com.liudehuang.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-09
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-09
 * @UpdateRemark:
 * @Version: 1.0
 */
@Data
public class Response implements Serializable {
    /**
     * code返回码
     */
    protected Integer code;
    /**
     * 错误消息
     */
    protected String msg;
}
