package S3_2n1Observer;

public class DollarStockAgency extends StockAgency{

	public DollarStockAgency(Broker broker) {
		this.broker = broker;
		this.broker.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Dollar change: " + (float)Math.round(1.7*broker.getState()*1000)/1000);
	}
}
