package lab8;

public class OpenCommand implements Command{
	public String path;
	public void execute() {
		Builder jsonBuilder = new JSONBuilder(path);
		jsonBuilder.build();
		Book book = new Book("My Book");
		book.addContent(jsonBuilder.getResult());
		DocumentManager.setBook(book);
	}
	public OpenCommand(String path) {
		this.path = path;
	}
}
