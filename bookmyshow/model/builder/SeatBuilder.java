package lld_practice.questions.bookmyshow.model.builder;

import lld_practice.questions.bookmyshow.enums.SeatType;
import lld_practice.questions.bookmyshow.model.Seat;

public final class SeatBuilder {
	
	private Seat seat;
	
	private SeatBuilder() {
		seat = new Seat();
	}
	
	public static SeatBuilder newBuilder() {
		return new SeatBuilder();
	}
	
	public SeatBuilder setSeatId(int seatId){
		this.seat.setSeatId(seatId);
		return this;
	}

	public SeatBuilder setSeatNumber(int seatNumber){
		this.seat.setSeatId(seatNumber);
		return this;
	}

	public SeatBuilder setSeatPrice(int seatPrice){
		this.seat.setSeatPrice(seatPrice);
		return this;
	}

	public SeatBuilder setSeatType(SeatType seatType){
		this.seat.setSeatType(seatType);
		return this;
	}

	public SeatBuilder setisAvailable(boolean isAvailable){
		this.seat.setAvailable(isAvailable);
		return this;
	}

	public SeatBuilder setSeatComment(String seatComments){
		this.seat.setSeatComments(seatComments);
		return this;
	}
	
	public Seat build() {
		return this.seat;
	}
}
