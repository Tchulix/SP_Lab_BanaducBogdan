package lab8;

import java.util.ArrayList;

public class Table implements Element, Observable {
	public String oldValue;
	public String value;
	public ArrayList<Observer> observerList;
	public Table(String title) {
		this.value = title;
		this.observerList = new ArrayList<Observer>();
	}
	public void print() {
		System.out.println("Table with Title: " + value);
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	public void addObserver(Observer obs) {
		this.observerList.add(obs);
	}
	public void setNewValue(String newValue) {
		this.oldValue = this.value;
		this.value = newValue;
	}
	public void removeObserver(Observer obs) {
		this.observerList.remove(obs);
	}
	public void notifyObservers() {
		for (Observer obs : this.observerList) {
			obs.update(this.oldValue, this.value);
		}
	}
	public Element copy() {
		return new Table(this.value);
	}
}
