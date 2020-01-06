package lab8;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Observable {
	public String value;
	public String oldValue;
	public ArrayList<Observer> observersList;
	Image(String name) {
		value = name;
		this.observersList = new ArrayList<Observer>();
		try {
		TimeUnit.SECONDS.sleep(5);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void addObserver(Observer obs) {
			this.observersList.add(obs);
	}
	public void removeObserver(Observer obs) {
		this.observersList.remove(obs);
		}
	public void notifyObservers() {
		for (Observer obs : this.observersList) {
			obs.update(this.oldValue, this.value);
		}
	}
	public void print() {
		System.out.println("Image with name: " + value);
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void setNewValue(String newValue) {
		this.oldValue = this.value;
		this.value = newValue;
	}
	public Element copy() {
		return new Image(this.value);
	}
}
