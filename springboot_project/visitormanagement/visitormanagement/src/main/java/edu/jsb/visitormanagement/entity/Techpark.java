package edu.jsb.visitormanagement.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Techpark {

	@Id
	private Long visitorid;
	private String visitorName;
	private String phoneNumber;
	private String purpose;
	private LocalDateTime inTime;
	private LocalDateTime outTime;
	private String visitorPerson;
	private String proofId;
	private String status;
	private LocalDateTime createAt;
	private LocalDateTime updatedAt;
	private String companyName;

	public Long getVisitorid() {
		return visitorid;
	}

	public void setVisitorid(Long visitorid) {
		this.visitorid = visitorid;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public LocalDateTime getInTime() {
		return inTime;
	}

	public void setInTime(LocalDateTime inTime) {
		this.inTime = inTime;
	}

	public LocalDateTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalDateTime outTime) {
		this.outTime = outTime;
	}

	public String getVisitorPerson() {
		return visitorPerson;
	}

	public void setVisitorPerson(String visitorPerson) {
		this.visitorPerson = visitorPerson;
	}

	public String getProofId() {
		return proofId;
	}

	public void setProofId(String proofId) {
		this.proofId = proofId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Techpark [visitorid=" + visitorid + ", visitorName=" + visitorName + ", phoneNumber=" + phoneNumber
				+ ", purpose=" + purpose + ", inTime=" + inTime + ", outTime=" + outTime + ", visitorPerson="
				+ visitorPerson + ", proofId=" + proofId + ", status=" + status + ", createAt=" + createAt
				+ ", updatedAt=" + updatedAt + ", companyName=" + companyName + "]";
	}

}
