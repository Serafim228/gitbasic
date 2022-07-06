
public class Computer {
	private Proccesor proccesor;
	private RAM ram;
	private Disk disk;
	private Screen screen;
	private Keybord keybord;
	private String vendor;
	private String name;
	
	public Computer(String vendor, String name) {
		
		this.vendor = vendor;
		this.name = name;
	}

	public void setProccesor(Proccesor proccesor) {
		this.proccesor = proccesor;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public void setDisk(Disk disk) {
		this.disk = disk;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public void setKeybord(Keybord keybord) {
		this.keybord = keybord;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Proccesor getProccesor() {
		return proccesor;
	}

	public RAM getRam() {
		return ram;
	}

	public Disk getDisk() {
		return disk;
	}

	public Screen getScreen() {
		return screen;
	}

	public Keybord getKeybord() {
		return keybord;
	}

	public String getVendor() {
		return vendor;
	}

	public String getName() {
		return name;
	}
	
	public  double getAllWeight() {
		return proccesor.getWeight() + ram.getWeight() + disk.getWeight() 
			+ screen.getWeight() + keybord.getWeight();
	}
	
	public String toString () {
		return "Процессор: " + proccesor.getMhz() + " mhz, " + 
				proccesor.getNoc() + " cores, " + proccesor.getWeight() + " weight \n" +
				"RAM" + ram.getRamType() + ", " + ram.getVoluem() + ", "
				+ ram.getWeight() + " weight \n" +
				"Disk" + disk.getDiskType() + " ," + disk.getVolume() + ", " +
				disk.getWeight() + " weight \n" +
				"Screen" + screen.getDioganal() + " sm, " + screen.getScreenType() + " type"
				+ screen.getWeight() + " weight" + 
				"Keybord" + keybord.getKeybordType() + ",  Lighting" + 
				keybord.isLightining() + ", " + keybord.getWeight() + " weight" ;
	}
	
	
}
