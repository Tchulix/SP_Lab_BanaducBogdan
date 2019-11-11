package lab6;

public class Paragraph implements Element {
	public String title;
	public AlignStrategy align;
	public Paragraph(String title) {
		this.title = title;
	}

	public void print() {
		if (align == null)
			System.out.println(title);
		else
			this.align.print(title);
	}
	
	public void setAlignStrategy(AlignStrategy alignStrategy) {
		this.align = alignStrategy;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
