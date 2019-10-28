
public class Paragraph implements Element {
	public String title;
	public Paragraph(String title) {
		this.title = title;
	}

	public void print() {
		System.out.println("Paragraph: " + title);
	}
}
