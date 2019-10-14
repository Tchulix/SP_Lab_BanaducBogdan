import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	public String title;
	public SubChapter(String title) {
		this.elements = new ArrayList<Element>();
		this.title=title;
	}
	public List<Element> elements;
	public Chapter chapter;
	public int createParagraph(String paragraphName) {
		Paragraph paragraph = new Paragraph(paragraphName);
		elements.add(paragraph);
		return elements.indexOf(paragraph);
	}
	public int createImage(String imageName) {
		Image image = new Image(imageName);
		elements.add(image);
		return elements.indexOf(image);
	}
	public int createTable(String tableName) {
		Table table = new Table(tableName);
		elements.add(table);
		return elements.indexOf(table);
	}	
	
	public void createNewParagraph(String paragraphName) {
		this.elements.add(new Paragraph(paragraphName));
	}
	
	public void createNewImage(String imageName) {
		this.elements.add(new Image(imageName));
	}
	
	public void createNewTable(String tableName) {
		this.elements.add(new Table(tableName));
	}
	
	public void print() {
		System.out.println("Subchapter: " + title);
		for(Element element : elements){
			element.print();
		}
	}
	
	
}
