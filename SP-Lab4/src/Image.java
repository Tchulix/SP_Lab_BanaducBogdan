
public class Image implements Element {
	public String title;
	public Image(String title) {
		this.title = title;
	}
	public void print() {
		System.out.println("Image with name: " + title);
	}
}
