package com.entity.vo;

import com.entity.ShenqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-18
 */
@TableName("shenqing")
public class ShenqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "shenqing_time")
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

}
