package lab8;

public interface Element {
	void print();
	void accept(Visitor visitor);
	public void setNewValue(String newValue);
	public Element copy();
}
