package com.hongkun.finance.qdz.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.yirun.framework.core.model.BaseModel;

/**
 * @Project       : finance
 * @Program Name  : com.hongkun.finance.qdz.model.QdzAccount.java
 * @Class Name    : QdzAccount.java
 * @Description   : GENERATOR VO类
 * @Author        : generator
 */
public class QdzAccount extends BaseModel {
	
	private static final long serialVersionUID = 1L;
 
	/**
	 * 描述: id
	 * 字段: id  INT(10)
	 */
	private java.lang.Integer id;
	
	/**
	 * 描述: 用户id
	 * 字段: reg_user_id  INT(10)
	 */
	private java.lang.Integer regUserId;
	
	/**
	 * 描述: 账户金额
	 * 字段: money  DECIMAL(20)
	 * 默认值: 0.00
	 */
	private java.math.BigDecimal money;
	
	/**
	 * 描述: 剩余债权金额
	 * 字段: creditor_money  DECIMAL(20)
	 * 默认值: 0.00
	 */
	private java.math.BigDecimal creditorMoney;
	
	/**
	 * 描述: 昨日收益
	 * 字段: yed_interest  DECIMAL(10)
	 * 默认值: 0.00
	 */
	private java.math.BigDecimal yedInterest;
	
	/**
	 * 描述: 累计收益
	 * 字段: total_interest  DECIMAL(10)
	 * 默认值: 0.00
	 */
	private java.math.BigDecimal totalInterest;
	
	/**
	 * 描述: 累积加息利率
	 * 字段: interest_rate  DECIMAL(10)
	 * 默认值: 0.00
	 */
	private java.math.BigDecimal interestRate;
	
	/**
	 * 描述: 累积加息天数
	 * 字段: interest_day  INT(10)
	 * 默认值: 0
	 */
	private java.lang.Integer interestDay;
	
	/**
	 * 描述: 0-删除  1-正常
	 * 字段: state  TINYINT(3)
	 * 默认值: 1
	 */
	private Integer state;
	
	/**
	 * 描述: 创建时间
	 * 字段: create_time  DATETIME(19)
	 * 默认值: CURRENT_TIMESTAMP
	 */
	private java.util.Date createTime;
	
	//【非数据库字段，查询时使用】
	private java.util.Date createTimeBegin;
	
	//【非数据库字段，查询时使用】
	private java.util.Date createTimeEnd;
	/**
	 * 描述: 修改时间
	 * 字段: modify_time  DATETIME(19)
	 * 默认值: CURRENT_TIMESTAMP
	 */
	private java.util.Date modifyTime;
	
	//【非数据库字段，查询时使用】
	private java.util.Date modifyTimeBegin;
	
	//【非数据库字段，查询时使用】
	private java.util.Date modifyTimeEnd;
 
	public QdzAccount(){
	}

	public QdzAccount(java.lang.Integer id){
		this.id = id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setRegUserId(java.lang.Integer regUserId) {
		this.regUserId = regUserId;
	}
	
	public java.lang.Integer getRegUserId() {
		return this.regUserId;
	}
	
	public void setMoney(java.math.BigDecimal money) {
		this.money = money;
	}
	
	public java.math.BigDecimal getMoney() {
		return this.money;
	}
	
	public void setCreditorMoney(java.math.BigDecimal creditorMoney) {
		this.creditorMoney = creditorMoney;
	}
	
	public java.math.BigDecimal getCreditorMoney() {
		return this.creditorMoney;
	}
	
	public void setYedInterest(java.math.BigDecimal yedInterest) {
		this.yedInterest = yedInterest;
	}
	
	public java.math.BigDecimal getYedInterest() {
		return this.yedInterest;
	}
	
	public void setTotalInterest(java.math.BigDecimal totalInterest) {
		this.totalInterest = totalInterest;
	}
	
	public java.math.BigDecimal getTotalInterest() {
		return this.totalInterest;
	}
	
	public void setInterestRate(java.math.BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	
	public java.math.BigDecimal getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestDay(java.lang.Integer interestDay) {
		this.interestDay = interestDay;
	}
	
	public java.lang.Integer getInterestDay() {
		return this.interestDay;
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
