package lld_practice.behavioral.observer;

public interface ObservableInterface {
	
	 void add(ObserverInterface observerInterface);
	 void remove(ObserverInterface observerInterface);
	 void notifyObservers();
	 
}
