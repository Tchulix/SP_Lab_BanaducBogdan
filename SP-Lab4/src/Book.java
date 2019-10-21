import java.util.ArrayList;
import java.util.List;

public class Book {
	public String name;
	public List<Element> elements;
	public List<Author> authors;
	public Book(String name) {
		this.elements = new ArrayList<Element>();
		this.authors = new ArrayList<Author>();
		this.name=name;
	}
	
	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public void addContent(Element e) {
		elements.add(e);
	}
	
	public void print() {
		System.out.println("Book: "+name);
		System.out.println("");
		System.out.println("Authors: ");
		for (Author author : authors) {
			System.out.println("Author: "+author.title);
		}
		System.out.println("");
		for (Element element : elements) {
			element.print();
		}
	}
	
}
