package com.liudehuang.item.service;

import com.liudehuang.item.domain.Category;

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
public interface CategoryService {
    /**
     * 根据ID查询分类
     * @param pid
     * @return
     */
    List<Category> queryCategoryByPid(Long pid);
}
