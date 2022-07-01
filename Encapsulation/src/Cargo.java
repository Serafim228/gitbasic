
public class Cargo {
	private final Dimensions dimensions;
	private final double mass; 
	private final String addres;
	private final boolean canBeTurnedOver;
	private final String registrationNumber;
	private final boolean isFragile;


	public Cargo(double mass, String addres, boolean canBeTurnedOver, 
			String registrationNumber, boolean isFragile, Dimensions dimensions) {
		this.mass = mass;
		this.addres = addres;
		this.canBeTurnedOver = canBeTurnedOver;
		this.registrationNumber = registrationNumber;
		this.isFragile = isFragile;
		this.dimensions = dimensions; 
	}
	
	public Cargo setAddres (String addres) {
		return new Cargo ( mass,  addres,  canBeTurnedOver, 
			 registrationNumber,  isFragile,  dimensions);
	}
	
	public Cargo setDemensions (Dimensions dimensions) {
		return new Cargo ( mass,  addres,  canBeTurnedOver, 
			 registrationNumber,  isFragile,  dimensions);
	}
	
	public Cargo setMass (double mass) {
		return new Cargo ( mass,  addres,  canBeTurnedOver, 
			 registrationNumber,  isFragile,  dimensions);
	}
	
	public String getString() {
		return mass + "  " + addres + "  " +  dimensions;
	}
	
}





