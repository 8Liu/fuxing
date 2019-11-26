package com.liudehuang.item.controller;

import com.liudehuang.common.constants.ReturnCodeEnum;
import com.liudehuang.common.pojo.BaseResponse;
import com.liudehuang.common.utils.BackResponseUtil;
import com.liudehuang.item.domain.Category;
import com.liudehuang.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public BaseResponse<List<Category>> queryCategoryByPid(@RequestParam("pid") Long pid){
        List<Category> list = categoryService.queryCategoryByPid(pid);
        BaseResponse response = BackResponseUtil.setBaseResponse(ReturnCodeEnum.SUCCESS);
        response.setDataInfo(list);
        return response;
    }

}
