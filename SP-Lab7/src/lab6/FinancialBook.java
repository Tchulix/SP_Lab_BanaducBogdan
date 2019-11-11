package lab6;

public class FinancialBook extends BookStatistics {
	public void printStatistics() {
		System.out.println("Cost total: "+(numarImage*10+numarTable*5+numarParagraph*3));
	}
}
