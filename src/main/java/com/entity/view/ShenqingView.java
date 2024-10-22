package com.entity.view;

import com.entity.ShenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @email
 * @date 2021-03-18
 */
@TableName("shenqing")
public class ShenqingView extends ShenqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public ShenqingView() {

	}

	public ShenqingView(ShenqingEntity shenqingEntity) {
		try {
			BeanUtils.copyProperties(this, shenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
