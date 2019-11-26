package com.liudehuang.item.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-26
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-26
 * @UpdateRemark:
 * @Version: 1.0
 */
@Data
public class Brand implements Serializable {

    private Long id;
    /**
     * 品牌名称
     */
    private String name;
    /**
     * 品牌图片
     */
    private String image;
    /**
     *
     */
    private Character letter;
}
