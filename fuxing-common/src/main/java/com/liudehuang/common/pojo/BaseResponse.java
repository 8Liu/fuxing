package com.liudehuang.common.pojo;

import lombok.Data;

import java.io.Reader;
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
public class BaseResponse<T> extends Response implements Serializable {

    private T dataInfo;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg, T dataInfo) {
        this.code = code;
        this.msg = msg;
        this.dataInfo = dataInfo;
    }
}
