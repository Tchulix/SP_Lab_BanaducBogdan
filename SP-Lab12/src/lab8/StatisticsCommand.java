package lab8;

public class StatisticsCommand implements Command{
	public void execute() {
		BookStatistics bookStatistics = new BookStatistics();
		bookStatistics.printStatistics();
	}
	public void unexecute() {
		
	}
}
