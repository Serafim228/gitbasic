
public class Keybord {
	private final KeybordType keybordType;
	private final boolean isLightining;
	private final double weight;
	
	public Keybord(KeybordType keybordType, boolean isLightining, double weight) {
		this.keybordType = keybordType;
		this.isLightining = isLightining;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public KeybordType getKeybordType() {
		return keybordType;
	}

	public boolean isLightining() {
		return isLightining;
	}
	
}
