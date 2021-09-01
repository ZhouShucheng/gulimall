package com.zhoushucheng.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoushucheng.common.utils.PageUtils;
import com.zhoushucheng.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author zhoushucheng
 * @email zhou.shucheng.s@outlook.com
 * @date 2021-08-16 17:38:58
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

