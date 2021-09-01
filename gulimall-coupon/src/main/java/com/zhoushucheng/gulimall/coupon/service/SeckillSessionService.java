package com.zhoushucheng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoushucheng.common.utils.PageUtils;
import com.zhoushucheng.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author zhoushucheng
 * @email zhou.shucheng.s@outlook.com
 * @date 2021-08-16 17:02:55
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

