package n3command;

public class Ship extends Vehicle{
	
	public Ship(String model, String color, String factoryYear) {
		super(model, color, factoryYear);
	}
	
	@Override
	public void start() {
		System.out.println("the "+ color +" "+ model +" ship is in motion");
	}

	@Override
	public void accelerate() {
		System.out.println("the "+ color +" "+ model +" ship is accelerating");
	}

	@Override
	public void stop() {
		System.out.println("the "+ color +" "+ model +" ship is braking");
	}
}
