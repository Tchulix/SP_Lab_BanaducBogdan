package lab8;
import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Observable {
	public String sectionTitle;
	public String oldValue;
	public List<Element> content;
	public ArrayList<Observer> observerList;
	public Section(String sectionTitle) {
		this.sectionTitle = sectionTitle;
		this.content = new ArrayList<Element>();
		observerList = new ArrayList<Observer>();
	}
	public void addObserver(Observer obs) {
		observerList.add(obs);
	}
	public void setNewValue(String newValue) {
		this.oldValue = sectionTitle;
		this.sectionTitle = newValue;
	}
	public void removeObserver(Observer obs) {
		this.observerList.remove(obs);
	}
	public void notifyObservers() {
		for (Observer obs : observerList) {
			obs.update(this.oldValue, this.sectionTitle);
		}
	}
	public int add(Element e) {
		content.add(e);
		return content.indexOf(e);
	}
	
	public void remove(Element e) {
		content.remove(e);
	}
	
	public Element getElement(int index) {
		return content.get(index);
	}
	
	public void print() {
		System.out.println(sectionTitle);
		for (Element element : content) {
			element.print();
		}
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
		for (Element element : content) {
			element.accept(visitor);
		}
	}
	
	public Element copy() {
		Section s = new Section(this.sectionTitle);
		for (Element e : this.content) {
			s.add(e.copy());
		}
		return s;
	}
	
}
