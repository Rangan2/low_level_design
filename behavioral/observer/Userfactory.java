package lld_practice.behavioral.observer;

public interface Userfactory extends ObserverInterface{

	void setName(String userName);
	String getName();
	void setLocation(String userLocation);
	String getLocation();
}
