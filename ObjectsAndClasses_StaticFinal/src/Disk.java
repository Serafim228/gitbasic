
public class Disk {
	private final DiskType diskType;
	private final DiskVolume volume;
	private final double weight;
	
	public Disk(DiskType diskType, DiskVolume volume, double weight) {
		
		this.diskType = diskType;
		this.volume = volume;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public DiskType getDiskType() {
		return diskType;
	}

	public DiskVolume getVolume() {
		return volume;
	}

}
