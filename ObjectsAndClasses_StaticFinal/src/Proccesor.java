
public class Proccesor {
	private final Mhz mhz;
	private final NumberOfCores noc;
	private final Fabricator fabricator;
	private final double weight;
	
	public Proccesor(Mhz mhz, NumberOfCores noc, Fabricator fabricator, double weight) {
		
		this.mhz = mhz;
		this.noc = noc;
		this.fabricator = fabricator;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public Mhz getMhz() {
		return mhz;
	}

	public NumberOfCores getNoc() {
		return noc;
	}

	public Fabricator getFabricator() {
		return fabricator;
	}

}
