package com.liudehuang.item.mapper;

import com.liudehuang.item.pojo.Brand;
import org.apache.ibatis.annotations.Param;

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
public interface BrandMapper {
    /**
     * 新增商品分类和商品品牌中间表数据
     * @param cid 商品分类ID
     * @param bid 品牌ID
     * @return
     */
    Integer insertCategoryBrand(@Param("cid") Long cid, @Param("bid") Long bid);

    /**
     * 根据品牌ID删除中间表数据
     * @param bid
     * @return
     */
    Integer deleteByBrandIdInCategoryBrand(@Param("bid") Long bid);

    /**
     *
     * @param cid
     * @return
     */
    List<Brand> queryBrandByCategoryId(Long cid);
}
