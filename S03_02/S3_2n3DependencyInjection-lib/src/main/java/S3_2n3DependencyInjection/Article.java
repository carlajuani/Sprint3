package S3_2n3DependencyInjection;

public class Article {
	private String name;
	private double price;
	private String initialCurrency;
	
	public Article (String name, double price, String initialCurrency) {
		this.name = name;
		this.price = price;
		this.initialCurrency = initialCurrency;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getInitialCurrency() {
		return initialCurrency;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + price + initialCurrency + "]";
	}
}
