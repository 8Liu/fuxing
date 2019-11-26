package com.liudehuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-09
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-09
 * @UpdateRemark:
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class,args);
    }
}
