
public class Car {
	private final Engine engine;
	private final CarType carType;
	private final int weight;
	
	public Car(Engine engine, CarType carType, int weight) {
		
		this.engine = engine;
		this.carType = carType;
		this.weight = weight;
	}

	public Engine getEngineType() {
		return engine;
	}

	public CarType getCarType() {
		return carType;
	}

	public int getWeight() {
		return weight;
	}
}
