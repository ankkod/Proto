package org.bestdeals.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Deal")
public class Deal implements Serializable{
	@Id @GeneratedValue
	@Column(name="DEAL_ID")
	private int dealId;
	@Column(name="DEAL_URL")
	private String dealUrl;
	@Column(name="IMAGE")
	private String imageUrl;
	@Column(name="TITLE")
	private String title;
	@Column(name="PRICE")
	private double price;
	@Column(name="TAGS")
	private String tags;
	@Column(name="CATEGORY_ID")
	private int categoryId;
	@Column(name="STARTDATE")
	private Date startDate;
	@Column(name="ENDDATE")
	private Date endDate;
	@Column(name="EMAILadd")
	private String email;
	@Column(name="DATE")
	private Date date;
	@Column(name="DEAL_INFO")
	private String dealInfo;
	@Column(name="UPVOTECOUNT")
	private int upvoteCount;
	@Column(name="DOWNVOTECOUNT")
	private int downvoteCount;
	@Column(name="COMMENTCOUNT")
	private int commentCount;
	
	
	public Deal(int dealId, String dealUrl, String imageUrl, String title, double price, String tags, int categoryId,
			Date startDate, Date endDate, String email, Date date, int upvoteCount, int downvoteCount,
			int commentCount) {
		super();
		this.dealId = dealId;
		this.dealUrl = dealUrl;
		this.imageUrl = imageUrl;
		this.title = title;
		this.price = price;
		this.tags = tags;
		this.categoryId = categoryId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.email = email;
		this.date = date;
		this.upvoteCount = upvoteCount;
		this.downvoteCount = downvoteCount;
		this.commentCount = commentCount;
	}


	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public int getDealId() {
		return dealId;
	}


	public void setDealId(int dealId) {
		this.dealId = dealId;
	}


	public String getDealUrl() {
		return dealUrl;
	}


	public void setDealUrl(String dealUrl) {
		this.dealUrl = dealUrl;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getTags() {
		return tags;
	}


	public void setTags(String tags) {
		this.tags = tags;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getUpvoteCount() {
		return upvoteCount;
	}


	public void setUpvoteCount(int upvoteCount) {
		this.upvoteCount = upvoteCount;
	}


	public int getDownvoteCount() {
		return downvoteCount;
	}


	public void setDownvoteCount(int downvoteCount) {
		this.downvoteCount = downvoteCount;
	}


	public int getCommentCount() {
		return commentCount;
	}


	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}


	public Deal() {
		// TODO Auto-generated constructor stub
	}

}
