package n3command;

public class VBraker implements IOrder{
	private Vehicle vehicle;
	
	public VBraker (Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void execute() {
		this.vehicle.stop();
	}
}
