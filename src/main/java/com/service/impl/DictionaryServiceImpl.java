package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.DictionaryDao;
import com.entity.DictionaryEntity;
import com.service.DictionaryService;
import com.entity.view.DictionaryView;

/**
 * 字典表 服务实现类
 * @since 2021-03-18
 */
@Service("dictionaryService")
@Transactional
public class DictionaryServiceImpl extends ServiceImpl<DictionaryDao, DictionaryEntity> implements DictionaryService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<DictionaryView> page =new Query<DictionaryView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
