public class ImageProxy implements Element {
	Image realImage;
	String imageName;
	public ImageProxy(String imageName) {
		this.imageName = imageName;
	}
	
	public void print() {
		if (realImage!=null && realImage.imageName == imageName)
			realImage.print();
		else
			(realImage = new Image(imageName)).print();
	}
}
