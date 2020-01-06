package lab8;

public class ImageProxy implements Element {
	Image realImage;
	String oldValue;
	String value;
	public ImageProxy(String imageName) {
		this.value = imageName;
	}
	
	public void print() {
		if (realImage!=null && realImage.value == value)
			realImage.print();
		else
			(realImage = new Image(value)).print();
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void setNewValue(String newValue) {
		this.oldValue = this.value;
		this.value = newValue;
	}
	
	public Element copy() {
		return new ImageProxy(this.value);
	}
}
