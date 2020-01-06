package lab8;

import java.util.ArrayList;
import java.util.List;

public class DocumentManager {
	private static DocumentManager instance=null;
	public static Section sec = null;
	private DocumentManager() {}
	public static List<Command> stack;
	public static DocumentManager getInstance() {
		if (instance == null) {
			{instance = new DocumentManager(); stack = new ArrayList<Command>();}
		}
		return instance;
	}
	public Section getBook() {
		return sec;
	}
	public void setBook(Section section) {
		sec = section;
	}
}
