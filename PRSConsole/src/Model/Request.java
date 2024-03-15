package Model;

import java.time.*; // this statement telling Java where to look
//import java.time.LocalDateTime;

public class Request {

	private int id;
	private User user; // Navigation property as foreign key
	private String description;
	private String justification;
	private LocalDate dateNeeded;
	private String deliveryMode;
	private String Status;
	private double Total;
	private LocalDateTime submitteDate;
	private String reasonForRejection;
	
	
	public Request() {
		super();
	}


	public Request(int id, User user, String description, String justification, LocalDate dateNeeded,
			String deliveryMode, String status, double total, LocalDateTime submitteDate, String reasonForRejection) {
		super();
		this.id = id;
		this.user = user;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		Status = status;
		Total = total;
		this.submitteDate = submitteDate;
		this.reasonForRejection = reasonForRejection;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getJustification() {
		return justification;
	}


	public void setJustification(String justification) {
		this.justification = justification;
	}


	public LocalDate getDateNeeded() {
		return dateNeeded;
	}


	public void setDateNeeded(LocalDate dateNeeded) {
		this.dateNeeded = dateNeeded;
	}


	public String getDeliveryMode() {
		return deliveryMode;
	}


	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public double getTotal() {
		return Total;
	}


	public void setTotal(double total) {
		Total = total;
	}


	public LocalDateTime getSubmitteDate() {
		return submitteDate;
	}


	public void setSubmitteDate(LocalDateTime submitteDate) {
		this.submitteDate = submitteDate;
	}


	public String getReasonForRejection() {
		return reasonForRejection;
	}


	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}


	@Override
	public String toString() {
		return "Request [id=" + id + ", user=" + user + ", description=" + description + ", justification="
				+ justification + ", dateNeeded=" + dateNeeded + ", deliveryMode=" + deliveryMode + ", Status=" + Status
				+ ", Total=" + Total + ", submitteDate=" + submitteDate + ", reasonForRejection=" + reasonForRejection
				+ "]";
	}
	
	
	
	
	
	
}
