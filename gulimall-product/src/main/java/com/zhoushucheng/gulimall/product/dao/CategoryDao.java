package com.zhoushucheng.gulimall.product.dao;

import com.zhoushucheng.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhoushucheng
 * @email zhou.shucheng.s@outlook.com
 * @date 2021-08-16 13:50:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
