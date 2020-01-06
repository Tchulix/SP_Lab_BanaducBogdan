package lab8;

import java.util.ArrayList;

public class Paragraph implements Element,Observable {
	public String value;
	public String oldValue;
	public AlignStrategy align;
	ArrayList<Observer> observersList;
	public Paragraph(String title) {
		this.value = title;
		this.observersList = new ArrayList<Observer>();
	}

	public void print() {
		if (align == null)
			System.out.println(value);
		else
			this.align.print(value);
	}
	public void removeObserver(Observer obs) {
		this.observersList.remove(obs);
		}
	public void notifyObservers() {
		for (Observer obs : this.observersList) {
			obs.update(this.oldValue, this.value);
		}
	}
	public void setAlignStrategy(AlignStrategy alignStrategy) {
		this.align = alignStrategy;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void addObserver(Observer obs) {
		this.observersList.add(obs);
	}
	
	public void setNewValue(String newValue) {
		this.oldValue = this.value;
		this.value = newValue;
	}
	public Element copy() {
		return new Paragraph(this.value);
	}
}
