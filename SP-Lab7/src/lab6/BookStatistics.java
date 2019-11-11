package lab6;

public class BookStatistics implements Visitor{
	public int numarImage = 0;
	public int numarParagraph = 0;
	public int numarTable = 0;
	
	public void visit(Image image) {
		numarImage++;
	}
	public void visit(ImageProxy imageProxy) {
		numarImage++;
	}
	public void visit(Paragraph paragraph) {
		numarParagraph++;
	}
	public void visit(Table table) {
		numarTable++;
	}
	
	public void printStatistics() {
		System.out.println("Book statistics: ");
		System.out.println("*** Number of images: " + numarImage);
		System.out.println("*** Number of tables: " + numarTable);
		System.out.println("*** Number of paragraph: " + numarParagraph);
	}
	
}
