package lld_practice.questions.bookmyshow.model;

import java.util.Objects;

import lld_practice.questions.bookmyshow.enums.SeatType;

public class Seat{
	private int seatId;
	private int seatNumber;
	private int seatPrice;
	private SeatType seatType;
	private boolean isAvailable;
	private String seatComments;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public int getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(int seatPrice) {
		this.seatPrice = seatPrice;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getSeatComments() {
		return seatComments;
	}
	public void setSeatComments(String seatComments) {
		this.seatComments = seatComments;
	}
	@Override
	public int hashCode() {
		return Objects.hash(isAvailable, seatComments, seatId, seatNumber, seatPrice, seatType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return isAvailable == other.isAvailable && Objects.equals(seatComments, other.seatComments)
				&& seatId == other.seatId && seatNumber == other.seatNumber && seatPrice == other.seatPrice
				&& seatType == other.seatType;
	}
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatNumber=" + seatNumber + ", seatPrice=" + seatPrice + ", seatType="
				+ seatType + ", isAvailable=" + isAvailable + ", seatComments=" + seatComments + ", getSeatId()="
				+ getSeatId() + ", getSeatNumber()=" + getSeatNumber() + ", getSeatPrice()=" + getSeatPrice()
				+ ", getSeatType()=" + getSeatType() + ", isAvailable()=" + isAvailable() + ", getSeatComments()="
				+ getSeatComments() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}


