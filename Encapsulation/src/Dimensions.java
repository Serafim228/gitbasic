
public class Dimensions {
	private final int height;
	private final int width;
	private final int length;
	
	public Dimensions(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	public double getVolume() {
		return height * width * length;
	}
	
}
