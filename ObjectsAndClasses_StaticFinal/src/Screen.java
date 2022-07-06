
public class Screen {
	private final Dioganal dioganal;
	private final ScreenType screenType;
	private final double weight;
	
	public Screen(Dioganal dioganal, ScreenType screenType, double weight) {
		
		this.dioganal = dioganal;
		this.screenType = screenType;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public Dioganal getDioganal() {
		return dioganal;
	}

	public ScreenType getScreenType() {
		return screenType;
	}
}
