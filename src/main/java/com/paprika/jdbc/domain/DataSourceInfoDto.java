package com.paprika.jdbc.domain;

import lombok.Data;

/**
 * @author adam
 * @date 2019/4/25 15:34
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
@Data
public class DataSourceInfoDto {

    /**
     * 数据库驱动类的名称
     */
    private String className;
    /**
     * 建立数据库使用的连接
     */
    private String url;
    /**
     * 数据库用户名
     */
    private String user;
    /**
     * 用户名对应的密码
     */
    private String pwd;
}
