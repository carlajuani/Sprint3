package S3_2n1Observer;

public class PoundStockAgency extends StockAgency{
	
	public PoundStockAgency(Broker broker) {
		this.broker = broker;
		this.broker.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Pound change: " + (float)Math.round(2.1*broker.getState()*1000)/1000);
	}
}
