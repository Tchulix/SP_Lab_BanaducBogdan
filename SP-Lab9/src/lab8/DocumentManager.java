package lab8;

public class DocumentManager {
	private static DocumentManager instance=null;
	public static Book book = null;
	private DocumentManager() {}
	public static DocumentManager getInstance() {
		if (instance == null) {
			instance = new DocumentManager();
		}
		return instance;
	}
	public static Book getBook() {
		return book;
	}
	public static void setBook(Book setBook) {
		book = setBook;
	}
}
