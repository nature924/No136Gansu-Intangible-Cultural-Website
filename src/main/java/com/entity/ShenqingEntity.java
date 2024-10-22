package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 
 *
 * @email
 * @date 2021-03-18
 */
@TableName("shenqing")
public class ShenqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


    public ShenqingEntity() {

    }

    public ShenqingEntity(T t) {
    try {
    BeanUtils.copyProperties(this, t);
    } catch (IllegalAccessException | InvocationTargetException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 申请人
     */
    @TableField(value = "yh_types")

    private Long yhTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "shenqing_time",fill = FieldFill.UPDATE)

    private Date shenqingTime;


    /**
     * 是否同意
     */
    @TableField(value = "sf_types")

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

    @Override
    public String toString() {
    return "Shenqing{" +
            "id=" + id +
            ", yhTypes=" + yhTypes +
            ", shenqingTime=" + shenqingTime +
            ", sfTypes=" + sfTypes +
    "}";
    }
    }
