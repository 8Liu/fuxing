package com.liudehuang.common.utils;

import com.liudehuang.common.constants.ReturnCodeEnum;
import com.liudehuang.common.pojo.BasePageParam;
import com.liudehuang.common.pojo.BaseResponse;
import com.liudehuang.common.pojo.PageResponse;
import com.liudehuang.common.pojo.Response;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-09
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-09
 * @UpdateRemark:
 * @Version: 1.0
 */
public class BackResponseUtil {

    public BackResponseUtil() {
    }

    public static BaseResponse setBaseResponse(Integer code){
        BaseResponse response = new BaseResponse();
        response.setCode(code);
        String msg = ReturnCodeEnum.getValue(code);
        response.setMsg(msg);
        return response;
    }


    public static BaseResponse setBaseResponse(ReturnCodeEnum codeEnum){
        return setBaseResponse(codeEnum,null);
    }

    public static BaseResponse setBaseResponse(ReturnCodeEnum codeEnum,String msg){
        BaseResponse response = new BaseResponse();
        response.setCode(codeEnum.getCode());
        response.setMsg(StringUtils.isEmpty(msg)?codeEnum.getMsg():msg);
        return response;
    }

    public static PageResponse setPageResponseData(List dataList, Integer dataTotal, BasePageParam queryParam) {
        PageResponse pageData = new PageResponse();
        pageData.setCurrent(queryParam.getPageNo());
        pageData.setSize(queryParam.getPageSize());
        pageData.setRecords(dataList);
        pageData.setTotal(dataTotal);
        pageData.setCode(ReturnCodeEnum.SUCCESS.getCode());
        return pageData;
    }

    public static boolean isOk(Response response) {
        return null != response && ReturnCodeEnum.SUCCESS.getCode().equals(response.getCode());
    }

}
