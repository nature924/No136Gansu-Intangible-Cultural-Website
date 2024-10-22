package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.ShenqingDao;
import com.entity.ShenqingEntity;
import com.service.ShenqingService;
import com.entity.view.ShenqingView;

/**
 *  服务实现类
 * @since 2021-03-18
 */
@Service("shenqingService")
@Transactional
public class ShenqingServiceImpl extends ServiceImpl<ShenqingDao, ShenqingEntity> implements ShenqingService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShenqingView> page =new Query<ShenqingView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
