package dc.tower.elevators.system;

public class Elevator {
	
	public int elevatorNumber; 
	
	public int currentFloor;
	
	public Elevator() {
		
	}

	protected int getElevatorNumber() {
		return elevatorNumber;
	}

	protected void setElevatorNumber(int elevatorNumber) {
		this.elevatorNumber = elevatorNumber;
	}

	protected int getCurrentFloor() {
		return currentFloor;
	}

	protected void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}


}
