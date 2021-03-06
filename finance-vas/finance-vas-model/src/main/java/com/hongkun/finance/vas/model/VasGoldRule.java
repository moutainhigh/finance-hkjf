package com.hongkun.finance.vas.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.format.annotation.DateTimeFormat;

import com.yirun.framework.core.model.BaseModel;

/**
 * @Project : finance
 * @Program Name : com.hongkun.finance.vas.model.VasGoldRule.java
 * @Class Name : VasGoldRule.java
 * @Description : GENERATOR VO类
 * @Author : generator
 */
public class VasGoldRule extends BaseModel {

	private static final long serialVersionUID = 1L;

	/**
	 * 描述: 主键 字段: id INT(10)
	 */
	private java.lang.Integer id;

	/**
	 * 描述: 发放金额 字段: money DECIMAL(20) 默认值: 0
	 */
	private java.math.BigDecimal money;

	/**
	 * 描述: 事件类型 字段: type TINYINT(3) 默认值: 0
	 */
	private Integer type;

	/**
	 * 描述: 体验金周期 字段: period INT(10) 默认值: 0
	 */
	private java.lang.Integer period;

	/**
	 * 描述: 规则生效时间 字段: begin_time DATETIME(19) 默认值: 0000-00-00 00:00:00
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date beginTime;

	// 【非数据库字段，查询时使用】
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date beginTimeBegin;

	// 【非数据库字段，查询时使用】
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date beginTimeEnd;
	/**
	 * 描述: 规则失效时间 字段: end_time DATETIME(19) 默认值: 0000-00-00 00:00:00
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private java.util.Date endTime;

	// 【非数据库字段，查询时使用】
	private java.util.Date endTimeBegin;

	// 【非数据库字段，查询时使用】
	private java.util.Date endTimeEnd;
	/**
	 * 描述: 状态:0-无效，1-有效 字段: state TINYINT(3) 默认值: 1
	 */
	private Integer state;

	/**
	 * 描述: 创建时间 字段: create_time DATETIME(19) 默认值: CURRENT_TIMESTAMP
	 */
	private java.util.Date createTime;

	// 【非数据库字段，查询时使用】
	private java.util.Date createTimeBegin;

	// 【非数据库字段，查询时使用】
	private java.util.Date createTimeEnd;
	/**
	 * 描述: 修改时间 字段: modify_time DATETIME(19) 默认值: CURRENT_TIMESTAMP
	 */
	private java.util.Date modifyTime;

	// 【非数据库字段，查询时使用】
	private java.util.Date modifyTimeBegin;

	// 【非数据库字段，查询时使用】
	private java.util.Date modifyTimeEnd;

	public VasGoldRule() {
	}

	public VasGoldRule(java.lang.Integer id) {
		this.id = id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setMoney(java.math.BigDecimal money) {
		this.money = money;
	}

	public java.math.BigDecimal getMoney() {
		return this.money;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return this.type;
	}

	public void setPeriod(java.lang.Integer period) {
		this.period = period;
	}

	public java.lang.Integer getPeriod() {
		return this.period;
	}

	public void setBeginTime(java.util.Date beginTime) {
		this.beginTime = beginTime;
	}

	public java.util.Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTimeBegin(java.util.Date beginTimeBegin) {
		this.beginTimeBegin = beginTimeBegin;
	}

	public java.util.Date getBeginTimeBegin() {
		return this.beginTimeBegin;
	}

	public void setBeginTimeEnd(java.util.Date beginTimeEnd) {
		this.beginTimeEnd = beginTimeEnd;
	}

	public java.util.Date getBeginTimeEnd() {
		return this.beginTimeEnd;
	}

	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}

	public java.util.Date getEndTime() {
		return this.endTime;
	}

	public void setEndTimeBegin(java.util.Date endTimeBegin) {
		this.endTimeBegin = endTimeBegin;
	}

	public java.util.Date getEndTimeBegin() {
		return this.endTimeBegin;
	}

	public void setEndTimeEnd(java.util.Date endTimeEnd) {
		this.endTimeEnd = endTimeEnd;
	}

	public java.util.Date getEndTimeEnd() {
		return this.endTimeEnd;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getState() {
		return this.state;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTimeBegin(java.util.Date createTimeBegin) {
		this.createTimeBegin = createTimeBegin;
	}

	public java.util.Date getCreateTimeBegin() {
		return this.createTimeBegin;
	}

	public void setCreateTimeEnd(java.util.Date createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public java.util.Date getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setModifyTime(java.util.Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public java.util.Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTimeBegin(java.util.Date modifyTimeBegin) {
		this.modifyTimeBegin = modifyTimeBegin;
	}

	public java.util.Date getModifyTimeBegin() {
		return this.modifyTimeBegin;
	}

	public void setModifyTimeEnd(java.util.Date modifyTimeEnd) {
		this.modifyTimeEnd = modifyTimeEnd;
	}

	public java.util.Date getModifyTimeEnd() {
		return this.modifyTimeEnd;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
}
