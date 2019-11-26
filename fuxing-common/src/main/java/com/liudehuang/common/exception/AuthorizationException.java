package com.liudehuang.common.exception;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-09
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-09
 * @UpdateRemark:授权异常
 * @Version: 1.0
 */
public class AuthorizationException extends RuntimeException {

    public AuthorizationException(String message) {
        super(message);
    }
}
