import java.util.ArrayList;
import java.util.List;

public class Book {
	public String name;
	public List<Chapter> chapters;
	public List<Author> authors;
	public Book(String name) {
		this.chapters = new ArrayList<Chapter>();
		this.authors = new ArrayList<Author>();
		this.name=name;
	}
	public int createChapter(String chapterName) {
		Chapter chp = new Chapter(chapterName);
		chapters.add(chp);
		return chapters.indexOf(chp);
	}
	public void addAuthor(Author author) {
		authors.add(author);
	}
	public Chapter getChapter(int index) {
		return chapters.get(index);
	}
}
