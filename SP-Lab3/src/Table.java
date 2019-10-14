
public class Table extends Element {
	public String title;
	public Table(String title) {
		this.title = title;
	}
	public SubChapter subChapter;
	public void print() {
		System.out.println("Table with Title: " + title);
	}
}
