package com.ruoyi.saas.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 租户信息对象 saas_tenants_info
 * 
 * @author 头条号：春田小花花
 * @date 2021-10-30
 */
public class SaasTenantsInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 租户数据库用户名 */
    private String dbUser;

    /** 物理主键 */
    private Integer id;

    /** 租户编码 */
    @Excel(name = "租户编码")
    private String code;

    /** 租户名称 */
    @Excel(name = "租户名称")
    private String name;

    /** 租户数据库地址 */
    private String dbUrl;

    /** 租户数据库名称 */
    private String dbName;

    /** 租户数据库密码 */
    private String dbPassword;

    /** 状态：1-正常，0-关闭 */
    @Excel(name = "状态：1-正常，0-关闭")
    private Integer status;

    /** 删除标识：1-删除，0-未删除 */
    private Integer delFlag;

    public void setDbUser(String dbUser) 
    {
        this.dbUser = dbUser;
    }

    public String getDbUser() 
    {
        return dbUser;
    }
    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDbUrl(String dbUrl) 
    {
        this.dbUrl = dbUrl;
    }

    public String getDbUrl() 
    {
        return dbUrl;
    }
    public void setDbName(String dbName) 
    {
        this.dbName = dbName;
    }

    public String getDbName() 
    {
        return dbName;
    }
    public void setDbPassword(String dbPassword) 
    {
        this.dbPassword = dbPassword;
    }

    public String getDbPassword() 
    {
        return dbPassword;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setDelFlag(Integer delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Integer getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dbUser", getDbUser())
            .append("id", getId())
            .append("code", getCode())
            .append("name", getName())
            .append("dbUrl", getDbUrl())
            .append("dbName", getDbName())
            .append("dbPassword", getDbPassword())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
