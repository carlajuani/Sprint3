package n3command;
//specific stock
public class Car extends Vehicle{
	
	public Car(String model, String color, String factoryYear) {
		super(model, color, factoryYear);
	}

	@Override
	public void start() {
		System.out.println("the "+ color +" "+ model +" car is in motion");
	}

	@Override
	public void accelerate() {
		System.out.println("the "+ color +" "+ model +" car is accelerating");
	}

	@Override
	public void stop() {
		System.out.println("the "+ color +" "+ model +" car is braking");
	}
}
