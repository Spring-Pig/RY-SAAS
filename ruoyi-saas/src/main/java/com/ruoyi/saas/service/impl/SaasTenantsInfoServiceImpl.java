package com.ruoyi.saas.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.saas.mapper.SaasTenantsInfoMapper;
import com.ruoyi.saas.domain.SaasTenantsInfo;
import com.ruoyi.saas.service.ISaasTenantsInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 租户信息Service业务层处理
 *
 * @author 头条号：春田小花花
 * @date 2021-10-30
 */
@Service
public class SaasTenantsInfoServiceImpl implements ISaasTenantsInfoService
{
    @Autowired
    private SaasTenantsInfoMapper saasTenantsInfoMapper;

    /**
     * 查询租户信息
     *
     * @param id 租户信息主键
     * @return 租户信息
     */
    @Override
    public SaasTenantsInfo selectSaasTenantsInfoById(Integer id)
    {
        return saasTenantsInfoMapper.selectSaasTenantsInfoById(id);
    }

    /**
     * 查询租户信息列表
     *
     * @param saasTenantsInfo 租户信息
     * @return 租户信息
     */
    @Override
    public List<SaasTenantsInfo> selectSaasTenantsInfoList(SaasTenantsInfo saasTenantsInfo)
    {
        return saasTenantsInfoMapper.selectSaasTenantsInfoList(saasTenantsInfo);
    }

    /**
     * 新增租户信息
     *
     * @param saasTenantsInfo 租户信息
     * @return 结果
     */
    @Override
    public int insertSaasTenantsInfo(SaasTenantsInfo saasTenantsInfo)
    {
        saasTenantsInfo.setCreateTime(DateUtils.getNowDate());
        return saasTenantsInfoMapper.insertSaasTenantsInfo(saasTenantsInfo);
    }

    /**
     * 修改租户信息
     *
     * @param saasTenantsInfo 租户信息
     * @return 结果
     */
    @Override
    public int updateSaasTenantsInfo(SaasTenantsInfo saasTenantsInfo)
    {
        saasTenantsInfo.setUpdateTime(DateUtils.getNowDate());
        return saasTenantsInfoMapper.updateSaasTenantsInfo(saasTenantsInfo);
    }

    /**
     * 租户状态修改
     *
     * @param saasTenantsInfo 租户信息
     * @return 结果
     */
    @Override
    public int changeStatus(SaasTenantsInfo saasTenantsInfo) {
        return saasTenantsInfoMapper.updateSaasTenantsInfo(saasTenantsInfo);
    }

    /**
     * 批量删除租户信息
     *
     * @param ids 需要删除的租户信息主键
     * @return 结果
     */
    @Override
    public int deleteSaasTenantsInfoByIds(String ids)
    {
        return saasTenantsInfoMapper.deleteSaasTenantsInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除租户信息信息
     *
     * @param id 租户信息主键
     * @return 结果
     */
    @Override
    public int deleteSaasTenantsInfoById(Integer id)
    {
        return saasTenantsInfoMapper.deleteSaasTenantsInfoById(id);
    }
}
