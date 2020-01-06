package lab8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class BookSave implements Visitor{
	List<String> tipuri = new ArrayList<String>();
	List<String> date = new ArrayList<String>();
	public void visit(Image image) {
		tipuri.add("Image");
		date.add(image.value);
	}
	
	public void visit(ImageProxy imageProxy) {
		tipuri.add("ImageProxy");
		date.add(imageProxy.value);
	}
	
	public void visit(Table table) {
		tipuri.add("Table");
		date.add(table.value);
	}	
	
	public void visit(Paragraph paragraph) {
		tipuri.add("Paragraph");
		date.add(paragraph.value);
	}
	
	public void visit (Section section) {
		tipuri.add("Section");
		date.add(section.sectionTitle);
	}
	
	public void saveBook() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("bookSave.txt", "UTF-8");
			for (int i=0;i<tipuri.size();i++)
				writer.println(tipuri.get(i) + ": " + date.get(i));
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
