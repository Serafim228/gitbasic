
public class RAM {
	private final RAMtypes ramType;
	private final VoluemRAM voluem;
	private final double weight;
	
	public RAM(RAMtypes ramType, VoluemRAM voluem, double weight) {
		
		this.ramType = ramType;
		this.voluem = voluem;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public RAMtypes getRamType() {
		return ramType;
	}

	public VoluemRAM getVoluem() {
		return voluem;
	}
}
