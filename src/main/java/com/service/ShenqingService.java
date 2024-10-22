package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingEntity;
import java.util.Map;

/**
 *  服务类
 * @since 2021-03-18
 */
public interface ShenqingService extends IService<ShenqingEntity> {

     PageUtils queryPage(Map<String, Object> params);

}