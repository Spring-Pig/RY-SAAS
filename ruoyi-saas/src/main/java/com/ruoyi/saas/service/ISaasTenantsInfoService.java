package com.ruoyi.saas.service;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.saas.domain.SaasTenantsInfo;

/**
 * 租户信息Service接口
 *
 * @author 头条号：春田小花花
 * @date 2021-10-30
 */
public interface ISaasTenantsInfoService
{
    /**
     * 查询租户信息
     *
     * @param id 租户信息主键
     * @return 租户信息
     */
    public SaasTenantsInfo selectSaasTenantsInfoById(Integer id);

    /**
     * 查询租户信息列表
     *
     * @param saasTenantsInfo 租户信息
     * @return 租户信息集合
     */
    public List<SaasTenantsInfo> selectSaasTenantsInfoList(SaasTenantsInfo saasTenantsInfo);

    /**
     * 新增租户信息
     *
     * @param saasTenantsInfo 租户信息
     * @return 结果
     */
    public int insertSaasTenantsInfo(SaasTenantsInfo saasTenantsInfo);

    /**
     * 修改租户信息
     *
     * @param saasTenantsInfo 租户信息
     * @return 结果
     */
    public int updateSaasTenantsInfo(SaasTenantsInfo saasTenantsInfo);

    /**
     * 租户状态修改
     *
     * @param saasTenantsInfo 租户信息
     * @return 结果
     */
    public int changeStatus(SaasTenantsInfo saasTenantsInfo);

    /**
     * 批量删除租户信息
     *
     * @param ids 需要删除的租户信息主键集合
     * @return 结果
     */
    public int deleteSaasTenantsInfoByIds(String ids);

    /**
     * 删除租户信息信息
     *
     * @param id 租户信息主键
     * @return 结果
     */
    public int deleteSaasTenantsInfoById(Integer id);
}
