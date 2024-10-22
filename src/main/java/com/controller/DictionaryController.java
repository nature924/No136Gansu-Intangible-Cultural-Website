package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.DictionaryEntity;

import com.service.DictionaryService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 字典表
 * 后端接口
 * @author
 * @email
 * @date 2021-03-18
*/
@RestController
@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    private static final Logger logger = LoggerFactory.getLogger(DictionaryController.class);

    @Autowired
    private DictionaryService dictionaryService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = dictionaryService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        DictionaryEntity dictionary = dictionaryService.selectById(id);
        if(dictionary!=null){
            return R.ok().put("data", dictionary);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody DictionaryEntity dictionary, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<DictionaryEntity> queryWrapper = new EntityWrapper<DictionaryEntity>()
            .eq("dic_code", dictionary.getDicCode())
            .eq("dic_name", dictionary.getDicName())
            .eq("code_index", dictionary.getCodeIndex())
            .eq("index_name", dictionary.getIndexName())
            .eq("super_id", dictionary.getSuperId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DictionaryEntity dictionaryEntity = dictionaryService.selectOne(queryWrapper);
        if(dictionaryEntity==null){
            dictionaryService.insert(dictionary);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody DictionaryEntity dictionary, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<DictionaryEntity> queryWrapper = new EntityWrapper<DictionaryEntity>()
            .notIn("id",dictionary.getId())
            .eq("dic_code", dictionary.getDicCode())
            .eq("dic_name", dictionary.getDicName())
            .eq("code_index", dictionary.getCodeIndex())
            .eq("index_name", dictionary.getIndexName())
            .eq("super_id", dictionary.getSuperId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        DictionaryEntity dictionaryEntity = dictionaryService.selectOne(queryWrapper);
        if(dictionaryEntity==null){
            dictionaryService.updateById(dictionary);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        dictionaryService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

