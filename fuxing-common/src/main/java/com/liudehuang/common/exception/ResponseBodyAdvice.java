package com.liudehuang.common.exception;

import com.liudehuang.common.constants.ReturnCodeEnum;
import com.liudehuang.common.pojo.Response;
import com.liudehuang.common.utils.BackResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-09
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-09
 * @UpdateRemark: 全局异常处理
 * @Version: 1.0
 */
@ResponseBody
@ControllerAdvice
@Slf4j
public class ResponseBodyAdvice {

    public ResponseBodyAdvice() {
    }

    @ResponseBody
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    public Response handleException(Exception exp){
        log.error("服务处理异常  timeStamp: {} msg: {}", System.currentTimeMillis(), exp);
        return BackResponseUtil.setBaseResponse(ReturnCodeEnum.FAILED);
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({ValidationException.class})
    public Response handleValidateException(ValidationException exp) {
        if (log.isDebugEnabled()) {
            log.debug("Object 属性校验错误 msg: {}", exp.getMessage());
        }
        return BackResponseUtil.setBaseResponse(ReturnCodeEnum.PARAMETER_ERROR, exp.getMessage());
    }


    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public Response handleMethodArgumentNoValidException(MethodArgumentNotValidException exp) {
        String defaultMessage = ((ObjectError)exp.getBindingResult().getAllErrors().get(0)).getDefaultMessage();
        if (log.isDebugEnabled()) {
            log.debug("Method Argument校验错误 msg: {}", defaultMessage);
        }

        return BackResponseUtil.setBaseResponse(ReturnCodeEnum.PARAMETER_ERROR, defaultMessage);
    }


    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({BusinessException.class})
    public Response handleBusinessException(BusinessException e) {
        log.error(e.getMessage(), e);
        return BackResponseUtil.setBaseResponse(ReturnCodeEnum.DATA_PROCESS_FAILED, e.getMessage());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler({AuthorizationException.class})
    public Response HandleAuthorizationException(AuthorizationException e){
        log.error(e.getMessage(), e);
        return BackResponseUtil.setBaseResponse(ReturnCodeEnum.ACCESS_DENIED);
    }
}
