package com.zhoushucheng.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoushucheng.common.utils.PageUtils;
import com.zhoushucheng.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author zhoushucheng
 * @email zhou.shucheng.s@outlook.com
 * @date 2021-08-16 17:49:45
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

