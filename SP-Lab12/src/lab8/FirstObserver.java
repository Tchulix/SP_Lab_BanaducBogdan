package lab8;

public class FirstObserver implements Observer{
	public FirstObserver() {
		
	}
	public void update(String oldValue, String newValue) {
		System.out.println("First observer - oldValue: "+oldValue+" newValue: "+newValue);
	}
}
