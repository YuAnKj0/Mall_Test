package com.yuan.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yuan.mall.mbg.mapper")
public class MybatisConfig {
}
