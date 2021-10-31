package com.ruoyi.web.controller.saas;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.saas.domain.SaasTenantsInfo;
import com.ruoyi.saas.service.ISaasTenantsInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 租户信息Controller
 *
 * @author 头条号：春田小花花
 * @date 2021-10-30
 */
@Controller
@RequestMapping("/saas/tenants")
public class SaasTenantsInfoController extends BaseController
{
    private String prefix = "saas/tenants";

    @Autowired
    private ISaasTenantsInfoService saasTenantsInfoService;

    @RequiresPermissions("saas:tenants:view")
    @GetMapping()
    public String tenants()
    {
        return prefix + "/tenants";
    }

    /**
     * 查询租户信息列表
     */
    @RequiresPermissions("saas:tenants:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SaasTenantsInfo saasTenantsInfo)
    {
        startPage();
        List<SaasTenantsInfo> list = saasTenantsInfoService.selectSaasTenantsInfoList(saasTenantsInfo);
        return getDataTable(list);
    }

    /**
     * 导出租户信息列表
     */
    @RequiresPermissions("saas:tenants:export")
    @Log(title = "租户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SaasTenantsInfo saasTenantsInfo)
    {
        List<SaasTenantsInfo> list = saasTenantsInfoService.selectSaasTenantsInfoList(saasTenantsInfo);
        ExcelUtil<SaasTenantsInfo> util = new ExcelUtil<SaasTenantsInfo>(SaasTenantsInfo.class);
        return util.exportExcel(list, "租户信息数据");
    }

    /**
     * 新增租户信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存租户信息
     */
    @RequiresPermissions("saas:tenants:add")
    @Log(title = "租户信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SaasTenantsInfo saasTenantsInfo)
    {
        return toAjax(saasTenantsInfoService.insertSaasTenantsInfo(saasTenantsInfo));
    }

    /**
     * 修改租户信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        SaasTenantsInfo saasTenantsInfo = saasTenantsInfoService.selectSaasTenantsInfoById(id);
        mmap.put("saasTenantsInfo", saasTenantsInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存租户信息
     */
    @RequiresPermissions("saas:tenants:edit")
    @Log(title = "租户信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SaasTenantsInfo saasTenantsInfo)
    {
        return toAjax(saasTenantsInfoService.updateSaasTenantsInfo(saasTenantsInfo));
    }

    /**
     * 租户状态修改
     */
    @Log(title = "租户信息", businessType = BusinessType.UPDATE)
    @RequiresPermissions("saas:tenants:edit")
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(SaasTenantsInfo saasTenantsInfo)
    {
        return toAjax(saasTenantsInfoService.changeStatus(saasTenantsInfo));
    }

    /**
     * 删除租户信息
     */
    @RequiresPermissions("saas:tenants:remove")
    @Log(title = "租户信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(saasTenantsInfoService.deleteSaasTenantsInfoByIds(ids));
    }
}
