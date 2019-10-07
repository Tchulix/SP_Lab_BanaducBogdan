
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book discoTitanic = new Book("Disco Titanic");
		Author rPavel = new Author("Radu Pavel");
		discoTitanic.addAuthor(rPavel);
		int indexOfChapter = discoTitanic.createChapter("Chapter One");
		Chapter chpOne = discoTitanic.getChapter(indexOfChapter);
		int indexOfSubChapter = chpOne.createSubChapter("ChapterOneOne");
		SubChapter chpOneOne = chpOne.getSubChapter(indexOfSubChapter);
		int indexOfParagraph = chpOneOne.createParagraph("Paragraph1");
		int indexOfImage = chpOneOne.createImage("Image1");
		int indexOfTable = chpOneOne.createTable("Table1");
	}

}
