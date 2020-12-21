package dc.tower.elevators.system;

/**
 * @author aalkomy Object Represents Request received by the System. 
 *
 */
public class Request 
{
	public int currentFlour ;
	
	public int destinationflour ; 
	
	public String direction ;
	
	public Request(int requstedCurrent,int requestedDestination, String requestedDirection)
	{
		this.currentFlour=requstedCurrent;
		this.destinationflour=requestedDestination;
		this.direction=requestedDirection;
	}
	
	protected int getCurrentFlour() {
		return currentFlour;
	}

	protected void setCurrentFlour(int currentFlour) {
		this.currentFlour = currentFlour;
	}

	protected int getDestinationflour() {
		return destinationflour;
	}

	protected void setDestinationflour(int destinationflour) {
		this.destinationflour = destinationflour;
	}

	protected String getDirection() {
		return direction;
	}

	protected void setDirection(String direction) {
		this.direction = direction;
	}

	
	


}
