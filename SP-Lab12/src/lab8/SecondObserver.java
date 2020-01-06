package lab8;

public class SecondObserver implements Observer{
	public void update(String oldValue, String newValue) {
		System.out.println("Second observer - oldValue: "+oldValue+" newValue: "+newValue);
	}
	public SecondObserver() {
		
	}
}
