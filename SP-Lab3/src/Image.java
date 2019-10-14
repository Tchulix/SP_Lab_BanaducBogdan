
public class Image extends Element {
	public String title;
	public Image(String title) {
		this.title = title;
	}
	public SubChapter subChapter;
	public void print() {
		System.out.println("Image with name: " + title);
	}
}
