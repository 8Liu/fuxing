package com.liudehuang.common.pojo;

import lombok.Data;

import java.io.Serializable;
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
@Data
public class PageResponse<T> extends Response implements Serializable {
    /**
     * 返回结果
     */
    private List<T> records;
    /**
     * 总条数
     */
    private Integer total = 0;
    /**
     * 一页多少条
     */
    private Integer size = 10;
    /**
     * 当前页
     */
    private Integer current = 1;

    public PageResponse() {
    }
}
