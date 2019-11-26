package com.liudehuang.item.service.impl;

import com.liudehuang.common.exception.BusinessException;
import com.liudehuang.item.domain.Category;
import com.liudehuang.item.domain.CategoryExample;
import com.liudehuang.item.mapper.CategoryMapper;
import com.liudehuang.item.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryCategoryByPid(Long pid) {
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.createCriteria().andParentIdEqualTo(pid);
        List<Category> list = this.categoryMapper.selectByExample(categoryExample);
        if (CollectionUtils.isEmpty(list)){
            throw new BusinessException("分类信息不存在");
        }
        return list;
    }
}
