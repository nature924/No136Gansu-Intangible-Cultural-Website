package com.entity.model;

import com.entity.ShenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-18
 */
public class ShenqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 申请人
     */
    private Long yhTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date shenqingTime;


    /**
     * 是否同意
     */
    private Integer sfTypes;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：申请人
	 */
    public Long getYhTypes() {
        return yhTypes;
    }


    /**
	 * 获取：申请人
	 */

    public void setYhTypes(Long yhTypes) {
        this.yhTypes = yhTypes;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getShenqingTime() {
        return shenqingTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setShenqingTime(Date shenqingTime) {
        this.shenqingTime = shenqingTime;
    }
    /**
	 * 设置：是否同意
	 */
    public Integer getSfTypes() {
        return sfTypes;
    }


    /**
	 * 获取：是否同意
	 */

    public void setSfTypes(Integer sfTypes) {
        this.sfTypes = sfTypes;
    }

    }
