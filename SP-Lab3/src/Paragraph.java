
public class Paragraph extends Element {
	public String title;
	public Paragraph(String title) {
		this.title = title;
	}
	public SubChapter subChapter;
	
	public void print() {
		System.out.println("Paragraph: " + title);
	}
}
