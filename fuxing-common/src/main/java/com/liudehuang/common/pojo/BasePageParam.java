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
public class BasePageParam implements Serializable {

    private Integer pageNo;

    private Integer pageSize;

    public Integer getPageNo() {
        return (this.pageNo-1)*this.pageSize;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
