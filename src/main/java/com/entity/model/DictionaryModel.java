package com.entity.model;

import com.entity.DictionaryEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 字典表
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-18
 */
public class DictionaryModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 字段
     */
    private String dicCode;


    /**
     * 字段名
     */
    private String dicName;


    /**
     * 编码
     */
    private Integer codeIndex;


    /**
     * 编码名字
     */
    private String indexName;


    /**
     * 父字段id
     */
    private Integer superId;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


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
	 * 设置：字段
	 */
    public String getDicCode() {
        return dicCode;
    }


    /**
	 * 获取：字段
	 */

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }
    /**
	 * 设置：字段名
	 */
    public String getDicName() {
        return dicName;
    }


    /**
	 * 获取：字段名
	 */

    public void setDicName(String dicName) {
        this.dicName = dicName;
    }
    /**
	 * 设置：编码
	 */
    public Integer getCodeIndex() {
        return codeIndex;
    }


    /**
	 * 获取：编码
	 */

    public void setCodeIndex(Integer codeIndex) {
        this.codeIndex = codeIndex;
    }
    /**
	 * 设置：编码名字
	 */
    public String getIndexName() {
        return indexName;
    }


    /**
	 * 获取：编码名字
	 */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    /**
	 * 设置：父字段id
	 */
    public Integer getSuperId() {
        return superId;
    }


    /**
	 * 获取：父字段id
	 */

    public void setSuperId(Integer superId) {
        this.superId = superId;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
