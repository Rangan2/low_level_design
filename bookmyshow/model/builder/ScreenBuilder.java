package lld_practice.questions.bookmyshow.model.builder;

import java.util.List;

import lld_practice.questions.bookmyshow.model.Screen;

public class ScreenBuilder {

	private Screen screen;

	private ScreenBuilder() {
		this.screen = new Screen();
	}
	
	public ScreenBuilder newBuilder() {
		return new ScreenBuilder();
	}

	public ScreenBuilder setScreenId(int screenId) {
		this.screen.setScreenId(screenId);
		return this;
	}

	public ScreenBuilder setScreenNumber(int screenNumber) {
		this.screen.setScreenId(screenNumber);
		return this;
	}

	public ScreenBuilder setStatus(boolean status) {
		this.screen.setStatus(status);
		return this;
	}

	public ScreenBuilder setSeatBuilderList(List<SeatBuilder> seatBuilderList) {
		this.screen.setSeatBuilderList(seatBuilderList);
		return this;
	}

	public Screen build() {
		return this.screen;
	}
}
