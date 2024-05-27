package lld_practice.questions.bookmyshow;

import lld_practice.questions.bookmyshow.enums.SeatType;
import lld_practice.questions.bookmyshow.model.Seat;
import lld_practice.questions.bookmyshow.model.builder.SeatBuilder;

public class BookMyShowClient {

	public static void main(String args[]) {
		Seat goldSeat = SeatBuilder.newBuilder()
				.setSeatComment("Gold Seat")
				.setSeatId(1)
				.setSeatNumber(1)
				.setisAvailable(true)
				.setSeatPrice(350)
				.setSeatType(SeatType.GOLD).build();
		
		Seat middleSeat = SeatBuilder.newBuilder()
				.setSeatComment("Middle Seat")
				.setSeatId(2)
				.setSeatNumber(2)
				.setisAvailable(true)
				.setSeatPrice(250)
				.setSeatType(SeatType.MIDDLE).build();
		
		System.out.println("Gold Seat: "+ goldSeat.hashCode());
		System.out.println("Middle Seat: "+ middleSeat.hashCode());

	}
}
