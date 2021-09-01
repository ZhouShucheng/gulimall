package com.zhoushucheng.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoushucheng.common.utils.PageUtils;
import com.zhoushucheng.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author zhoushucheng
 * @email zhou.shucheng.s@outlook.com
 * @date 2021-08-16 18:02:28
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);
}

