package lld_practice.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AppleIphone15Pro implements ObservableInterface{

	private List<ObserverInterface> observerList;
	
	public AppleIphone15Pro() {
		observerList = new ArrayList<ObserverInterface>();
	}
	
	@Override
	public void add(ObserverInterface observerInterface) {
		// TODO Auto-generated method stub
		this.observerList.add(observerInterface);
		
	}

	@Override
	public void remove(ObserverInterface observerInterface) {
		// TODO Auto-generated method stub
		this.observerList.remove(observerInterface);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(ObserverInterface observerInterface : this.observerList) {
			observerInterface.update("Apple Iphone-15 Pro is Available Now !!!");
		}
	}
}
