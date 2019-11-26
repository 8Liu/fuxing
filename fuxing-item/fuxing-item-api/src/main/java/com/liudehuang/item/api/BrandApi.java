package com.liudehuang.item.api;

import com.liudehuang.item.pojo.Brand;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-26
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-26
 * @UpdateRemark:
 * @Version: 1.0
 */
@RequestMapping("brand")
public interface BrandApi {
    /**
     * 根据品牌ID集合，查询品牌信息
     * @param ids
     * @return
     */
    @PostMapping("/list")
    List<Brand> queryBrandByIds(@RequestBody List<Long> ids);
}
