
public class FirstObserver implements Observer {

	public FirstObserver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String oldValue, String newValue) {
		// TODO Auto-generated method stub
		System.out.println("Old value: " + oldValue + " was updated to: " + newValue);
	}

}
