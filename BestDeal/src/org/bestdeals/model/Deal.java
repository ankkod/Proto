package org.bestdeals.model;

import java.util.Date;

public class Deal {
	
	private int dealId;
	private String dealUrl;
	private String imageUrl;
	private String title;
	private String price;
	private String tags;
	private int categoryId;
	private Date startDate;
	private Date endDate;
	private String email;
	private Date date;
	private int upvoteCount;
	private int downvoteCount;
	private int commentCount;
	
	
	public Deal(int dealId, String dealUrl, String imageUrl, String title, String price, String tags, int categoryId,
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


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
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
