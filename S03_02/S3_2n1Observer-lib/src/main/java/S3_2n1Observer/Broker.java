package S3_2n1Observer;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<StockAgency> stockAgencies = new ArrayList<>();
	private float state;
	
	public float getState() {
		return state;
	}
	
	public void setState(float state) {
		this.state = state;
		notifyAllAgencies();
	}
	
	public void attach(StockAgency stockAgency) {
		stockAgencies.add(stockAgency);
	}
	
	public void notifyAllAgencies() {
		stockAgencies.forEach(sa -> sa.update());
	}
}
