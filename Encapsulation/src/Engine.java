
public class Engine {
	private static EngineType engineType;
	private static double voluem;
	private static int power;
	
	
	public Engine(EngineType engineType, double voluem, int power) {

		Engine.engineType = engineType;
		Engine.voluem = voluem;
		Engine.power = power;
	}


	public static EngineType getEngineType() {
		return engineType;
	}


	public static double getVoluem() {
		return voluem;
	}


	public static int getPower() {
		return power;
	}
	
	
		 
	
}
