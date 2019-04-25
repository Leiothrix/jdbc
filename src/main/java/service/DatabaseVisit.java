package service;

import domain.DataSourceInfoDto;

/**
 * @author adam
 * @date 2019/4/25 12:20
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public interface DatabaseVisit {

    /**
     * @param dataSourceInfoDto 建立数据库连接的源数据信息
     */
    public void conn(DataSourceInfoDto dataSourceInfoDto);

    /**
     * 关闭数据库连接
     */
    public void closeConnection();
}
