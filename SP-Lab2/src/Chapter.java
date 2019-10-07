import java.util.ArrayList;
import java.util.List;

public class Chapter {
	public String title;
	public Chapter(String title) {
		this.subChapters = new ArrayList<SubChapter>();
		this.title=title;
	}
	public List<SubChapter> subChapters;
	public Book book;
	public int createSubChapter(String subChapterName) {
		SubChapter schp = new SubChapter(subChapterName);
		subChapters.add(schp);
		return subChapters.indexOf(schp);
	}
	public SubChapter getSubChapter(int index) {
		return subChapters.get(index);
	}
}
