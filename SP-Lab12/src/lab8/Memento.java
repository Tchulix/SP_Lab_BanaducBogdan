package lab8;

public class Memento {
	Element state;
	public Memento() {}
	public Element getState() {
		return state;
	}
	public void setState(Element newState) {
		this.state = newState.copy();
	}
}
