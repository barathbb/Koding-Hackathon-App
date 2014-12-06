package com.app.component;

import java.sql.Timestamp;

public class Post {

	long postID;
	
	int status;
	
	String description,locality,image,targetDepartment;
	
	Timestamp createdTime, reviewedTime, assignedTime, finishedTime, closedTime;
	
	long ownerID, reviewerID, assignerID, closerID;

	public long getPostID() {
		return postID;
	}

	public void setPostID(long postID) {
		this.postID = postID;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTargetDepartment() {
		return targetDepartment;
	}

	public void setTargetDepartment(String targetDepartment) {
		this.targetDepartment = targetDepartment;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getReviewedTime() {
		return reviewedTime;
	}

	public void setReviewedTime(Timestamp reviewedTime) {
		this.reviewedTime = reviewedTime;
	}

	public Timestamp getAssignedTime() {
		return assignedTime;
	}

	public void setAssignedTime(Timestamp assignedTime) {
		this.assignedTime = assignedTime;
	}

	public Timestamp getFinishedTime() {
		return finishedTime;
	}

	public void setFinishedTime(Timestamp finishedTime) {
		this.finishedTime = finishedTime;
	}

	public Timestamp getClosedTime() {
		return closedTime;
	}

	public void setClosedTime(Timestamp closedTime) {
		this.closedTime = closedTime;
	}

	public long getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(long ownerID) {
		this.ownerID = ownerID;
	}

	public long getReviewerID() {
		return reviewerID;
	}

	public void setReviewerID(long reviewerID) {
		this.reviewerID = reviewerID;
	}

	public long getAssignerID() {
		return assignerID;
	}

	public void setAssignerID(long assignerID) {
		this.assignerID = assignerID;
	}

	public long getCloserID() {
		return closerID;
	}

	public void setCloserID(long closerID) {
		this.closerID = closerID;
	}
	
}
