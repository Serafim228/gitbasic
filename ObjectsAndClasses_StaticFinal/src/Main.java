
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc1 = new Computer("microsoft", "p4");
		Computer pc2 = new Computer("microsoft", "p3");
		Computer pc3 = new Computer("microsoft", "p5");
		
		pc1.setProccesor(new Proccesor (Mhz.MHZ2000 , NumberOfCores.EIGHTCORES, Fabricator.NVIDIEA, 22.0));
		pc1.setRam(new RAM (RAMtypes.DDR3, VoluemRAM.MG16000, 22.0));
		pc1.setDisk(new Disk(DiskType.HHD, DiskVolume.GB2048, 33.0));
		pc1.setScreen(new Screen(Dioganal.D19, ScreenType.PS, 31.0));
		pc1.setKeybord(new Keybord(KeybordType.Ergonomic, true, 15.6));
		
		pc2.setProccesor(new Proccesor (Mhz.MHZ2000 , NumberOfCores.EIGHTCORES, Fabricator.NVIDIEA, 22.0));
		pc2.setRam(new RAM (RAMtypes.DDR3, VoluemRAM.MG16000, 22.0));
		pc2.setDisk(new Disk(DiskType.HHD, DiskVolume.GB2048, 33.0));
		pc2.setScreen(new Screen(Dioganal.D19, ScreenType.PS, 31.0));
		pc2.setKeybord(new Keybord(KeybordType.Ergonomic, true, 15.6));
		
		System.out.println(pc1.toString() + "\n" + pc2.toString());
		System.out.println();
		System.out.println();
		System.out.println(pc1.getAllWeight());
		
	}
}