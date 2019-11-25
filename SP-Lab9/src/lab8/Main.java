package lab8;

public class Main {

	public static void main(String[] args) throws Exception {
		Command cmd1 = new OpenCommand("book.json");
		cmd1.execute();
		Command cmd2 = new StatisticsCommand();
		cmd2.execute();
		DocumentManager.getBook().print();
		}
}




