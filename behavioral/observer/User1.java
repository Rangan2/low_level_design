package lld_practice.behavioral.observer;

public class User1 implements Userfactory{

	private String userName;
	private String userLocation;
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

	@Override
	public void setName(String userName) {
		// TODO Auto-generated method stub
		this.userName = userName;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.userName;
	}

	@Override
	public void setLocation(String userLocation) {
		// TODO Auto-generated method stub
		this.userLocation = userLocation;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return this.userLocation;
	}

}
