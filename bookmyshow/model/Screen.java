package lld_practice.questions.bookmyshow.model;

import java.util.List;
import java.util.Objects;

import lld_practice.questions.bookmyshow.model.builder.SeatBuilder;

public class Screen {
	private int screenId;
	private int screenNumber;
	private List<SeatBuilder> seatBuilderList;
	private boolean status;
	
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public int getScreenNumber() {
		return screenNumber;
	}
	public void setScreenNumber(int screenNumber) {
		this.screenNumber = screenNumber;
	}
	public List<SeatBuilder> getSeatBuilderList() {
		return seatBuilderList;
	}
	public void setSeatBuilderList(List<SeatBuilder> seatBuilderList) {
		this.seatBuilderList = seatBuilderList;
	}
	public boolean isStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(screenId, screenNumber, status, seatBuilderList);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Screen other = (Screen) obj;
		return screenId == other.screenId && screenNumber == other.screenNumber && status == other.status
				&& Objects.equals(seatBuilderList, other.seatBuilderList);
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenNumber=" + screenNumber + ", seatBuilderList="
				+ seatBuilderList + ", status=" + status + ", getScreenId()=" + getScreenId() + ", getScreenNumber()="
				+ getScreenNumber() + ", getSeatBuilderList()=" + getSeatBuilderList() + ", isStatus()=" + isStatus()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
