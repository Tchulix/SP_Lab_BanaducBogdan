package lab8;
import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
	public String sectionTitle;
	private List<Element> content;
	public Section(String sectionTitle) {
		this.sectionTitle = sectionTitle;
		this.content = new ArrayList<Element>();
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
}
