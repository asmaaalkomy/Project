package dc.tower.elevators.system;

import java.util.ArrayList;


/**
 * @author aalkomy SystemSimulation Class That Manage the Elevator System logic:
 * Which SetUp the Elevators initial Status bas on Random assumption of each Elevator's Floor. 
 * Requests recieved by the System is handled Sequentially. (Based on Corona Social Distancing period :))
 * 
 */
public class SystemSimulation {
	
	public SystemSimulation() {
		
	}
	
	/**
	 * @param pendingRequests list of pendingRequests in Case of no Elevators available immediately. 
	 * @param occupiedElevadors list of occupied Elevators at any given time. 
	 * @param avaliableElevadors list of available Elevators at any give time
	 */
    
	ArrayList<Elevator>  occupiedElevadors  = new ArrayList<Elevator>();
	ArrayList<Elevator>  availableElevadors = new ArrayList<Elevator>();	
	int initialElevatorFloor;
	int numberOfElevators = 7;
	
	/**
	 * Description:Initially All 7 Elevators are Located in Different Floors. 
	 * Elevator will change its currentFloor depending on each requests fulfilling later. 
	 */
	public  void initialStatus()
	{
		System.out.println("--------- The Current Status of Each Elevator ------");	
		
		for(int i =0;i<numberOfElevators; i++)
		{
			Elevator temp = new Elevator();
			temp.setElevatorNumber(i);
			initialElevatorFloor = (int)(Math.random()*((55-0)+1));  
			temp.setCurrentFloor(initialElevatorFloor);
			availableElevadors.add(temp);
			System.out.println(" Elevator no." + temp.getElevatorNumber()+" The current Floor " + temp.getCurrentFloor());
			
		}
		
	}
	
	/**
	 * processRequest method: gets the nearest Elevator available for a request
	 * by Calculating the difference between Elevator current floor and Request Current Floor, 
	 * The nearest Elevator is assigned to the Request. 
	 */
	public void processRequest(Request currentRequest)
	{
		int nearestFloor=55;
		Elevator nearestElevatorAvailable = new Elevator();
		
	for(int i=0 ; i < availableElevadors.size();i++)
	{
		
		if (nearestFloor >= Math.abs(availableElevadors.get(i).getCurrentFloor() - currentRequest.getCurrentFlour()))
		{
			nearestFloor = Math.abs(availableElevadors.get(i).getCurrentFloor() - currentRequest.getCurrentFlour());
			nearestElevatorAvailable=  availableElevadors.get(i);			
		}
			
		
	}
	System.out.println(" Enjoy your ride with Elevator no" + nearestElevatorAvailable.getElevatorNumber());

	nearestElevatorAvailable.setCurrentFloor(currentRequest.getDestinationflour());
	availableElevadors.remove(nearestElevatorAvailable);
	occupiedElevadors.add(nearestElevatorAvailable);
		
	}
	

	/**
	 * Description:Request Received, Regardless the Request Came from which Floor it should 
	 * fetch for Elevator that might stand in the current floor of the request or most nearest Floor from the 
	 * currently available Elevators.
	 * The Suitable Elevator's future floor should be the request destination.
	 * In Case no more available Elevators, checkAvaliableElevators is called to release the older 4 elevators.
	 */
	public void addRequest( Request currentRequest)
	{
	
		if(availableElevadors.isEmpty())
		{
			System.out.println("--------- Currently all elevators in the system are Occupied ------");	
			System.out.println("--------- Request to Go to Floor " + currentRequest.getDestinationflour()+" From Floor" + currentRequest.getCurrentFlour() +" has been added to the System --------");
			checkAvaliableElevators();	
		}
		
		processRequest(currentRequest);		
		
	}
	
	/**
	 * Description:checkAvaliableElevators: 
	 * 1-Check the continuous Status of the 7 Elevators at any given time. 
	 * 2-In Case of no longer available Elevators, it starts to release the first 4 Occupied Elevators that were occupied
	 * "assuming that those elevators are already done with there requests".
	 * In order to be available again to process pending request. 
	 */
	public void checkAvaliableElevators()
	{
		System.out.println("--------- Checking Elevators Current Status ------");	
		
		if(availableElevadors.isEmpty())
		{
			for(int i=0; i <numberOfElevators-3; i++) {
				availableElevadors.add(occupiedElevadors.remove(i));
				
			}
			System.out.println("--------- Elevators are available again ------");
		
		}else {
			for(int i=0;i<availableElevadors.size();i++) {
				System.out.println(" Elevator no " + availableElevadors.get(i).getElevatorNumber() +" ready for Requests");
				
			}
			for(int i=0;i<occupiedElevadors.size();i++) {
				System.out.println(" Elevator no " + occupiedElevadors.get(i).getElevatorNumber() +" is Occupied");
				
			}
						
		}

	}

}
