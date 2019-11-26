package com.liudehuang.item.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.liudehuang.item.autoconfigration.datasource.DataSourceProperties;

import javax.sql.DataSource;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-11
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-11
 * @UpdateRemark:
 * @Version: 1.0
 */
public class DataSourcePropertiesUtil {

    public static final DataSource convertDataSource(DataSourceProperties dataSourceProperties) throws Exception {
        DataSource dataSource = DruidDataSourceFactory.createDataSource(dataSourceProperties.getDatasource());
        return dataSource;
    }
}
