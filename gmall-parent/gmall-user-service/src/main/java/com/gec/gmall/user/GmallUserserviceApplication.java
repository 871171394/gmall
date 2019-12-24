package com.gec.gmall.user;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = "com.gec.gmall.user.mapper")
public class GmallUserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserserviceApplication.class,args);
    }
}
