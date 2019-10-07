import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	public String title;
	public SubChapter(String title) {
		this.paragraphs = new ArrayList<Paragraph>();
		this.images = new ArrayList<Image>();
		this.tables = new ArrayList<Table>();
		this.title=title;
	}
	public List<Paragraph> paragraphs;
	public List<Image> images;
	public List<Table> tables;
	public Chapter chapter;
	public int createParagraph(String paragraphName) {
		Paragraph paragraph = new Paragraph(paragraphName);
		paragraphs.add(paragraph);
		return paragraphs.indexOf(paragraph);
	}
	public int createImage(String imageName) {
		Image image = new Image(imageName);
		images.add(image);
		return images.indexOf(image);
	}
	public int createTable(String tableName) {
		Table table = new Table(tableName);
		tables.add(table);
		return tables.indexOf(table);
	}	
}
