
public class Main {

	public static void main(String[] args) {
		
		Book discoTitanic = new Book("Disco Titanic");
		Author rpGheo = new Author("Radu Pavel Gheo");
		discoTitanic.addAuthor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");

		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
		scOneOne.print();
		
		
		
		// TODO Auto-generated method stub
		/*Book discoTitanic = new Book("Disco Titanic");
		Author rPavel = new Author("Radu Pavel");
		discoTitanic.addAuthor(rPavel);
		int indexOfChapter = discoTitanic.createChapter("Chapter One");
		Chapter chpOne = discoTitanic.getChapter(indexOfChapter);
		int indexOfSubChapter = chpOne.createSubChapter("ChapterOneOne");
		SubChapter chpOneOne = chpOne.getSubChapter(indexOfSubChapter);
		int indexOfParagraph = chpOneOne.createParagraph("Paragraph1");
		int indexOfImage = chpOneOne.createImage("Image1");
		int indexOfTable = chpOneOne.createTable("Table1");*/
	}

}





