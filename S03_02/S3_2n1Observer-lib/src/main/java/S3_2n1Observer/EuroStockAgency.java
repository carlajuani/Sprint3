package S3_2n1Observer;

public class EuroStockAgency extends StockAgency{

	public EuroStockAgency(Broker broker) {
		this.broker = broker;
		this.broker.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Euro change: " + (float)Math.round(1.9*broker.getState()*1000)/1000);
	}
}