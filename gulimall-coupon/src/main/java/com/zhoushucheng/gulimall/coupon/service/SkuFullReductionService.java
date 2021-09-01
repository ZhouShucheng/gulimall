package com.zhoushucheng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoushucheng.common.to.SkuReductionTo;
import com.zhoushucheng.common.utils.PageUtils;
import com.zhoushucheng.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author zhoushucheng
 * @email zhou.shucheng.s@outlook.com
 * @date 2021-08-16 17:02:55
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo reductionTo);
}

