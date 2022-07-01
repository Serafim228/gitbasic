
public class Elevator {
	int currentFloor = 1;
	int minFloor;
	int maxFloor;
	
	public Elevator(int min, int max) {
		minFloor = min;
		maxFloor = max;
	}
	
	
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	
	public void moveDown() {
		currentFloor -= 1; 
	}
	
	public void moveUp() {
		currentFloor += 1; 
	}
	
	public void move(int floor) {
		boolean r = floor > getCurrentFloor();
		if (floor == getCurrentFloor()) {}
		else if (floor >= minFloor && floor <= maxFloor && r) {
			
			for (int i = getCurrentFloor(); i < floor; i++) {
				moveUp();
				System.out.println(getCurrentFloor());
			}
		} else if (floor >= minFloor && floor <= maxFloor && !r) {
			
			for (int i = getCurrentFloor(); i > floor; i--) {
				moveDown();
				System.out.println(getCurrentFloor());
			}
		} 
		else {
		System.out.println("Error");
		}
	}

}
