package com.zhoushucheng.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoushucheng.common.utils.PageUtils;
import com.zhoushucheng.gulimall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author zhoushucheng
 * @email zhou.shucheng.s@outlook.com
 * @date 2021-08-16 17:02:55
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

