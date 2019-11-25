package lab8;

public class StatisticsCommand implements Command{
	public void execute() {
		BookStatistics bookStatistics = new BookStatistics();
		for (Element content : DocumentManager.getBook().elements) {
			content.accept(bookStatistics);
		}
		bookStatistics.printStatistics();
	}
}
