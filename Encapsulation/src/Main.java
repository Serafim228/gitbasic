public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo cargo = new Cargo(22,"dsad",true,"32cxc323", false, 
				new Dimensions(32,32,32));
		System.out.println(cargo.getString());
		
		cargo.setAddres("32423423sosat");
		System.out.println(cargo.getString());
	}
	
		
}
