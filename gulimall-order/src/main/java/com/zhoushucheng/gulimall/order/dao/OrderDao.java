package com.zhoushucheng.gulimall.order.dao;

import com.zhoushucheng.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhoushucheng
 * @email zhou.shucheng.s@outlook.com
 * @date 2021-08-16 17:49:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
