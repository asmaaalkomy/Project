package dc.tower.elevators.system;

import dc.tower.elevators.system.Request;
import dc.tower.elevators.system.SystemSimulation;
import junit.framework.TestCase;

/**
 * @author aalkomy 
 * TestCases generating consule messages that shows how the Elevator System Operates and 
 * checkAvaliableElevators can be used to know the Status of Elevators in any give time. 
 * prerequisite to use and test Simulation Class is to create and Initialise new Class Instance with
 * new Requests. 
 * SimulationTest2 simulated 16 different requests of two stops in a given time initiated from different floors. 
 */

public class SimulatonTest2 extends TestCase {
	
	SystemSimulation secondSimulation = new SystemSimulation();
	Request request1= new Request(0,12,"Up");
	Request request2= new Request(35,0,"Down");
	Request request3= new Request(35,16,"Down");
	Request request4= new Request(16,0,"Down");
	Request request5= new Request(0,12,"Up");
	Request request6= new Request(10,40,"Up");
	Request request7= new Request(35,0,"Down");
	Request request8= new Request(2,0,"Down");
	Request request9= new Request(6,12,"Up");
	Request request10= new Request(42,35,"Down");
	Request request11= new Request(36,16,"Down");
	Request request12= new Request(10,0,"Down");
	Request request13= new Request(5,35,"Up");
	Request request14= new Request(0,40,"Up");
	Request request15= new Request(40,35,"Down");
	Request request16= new Request(35,0,"Down");


	protected void setUp() throws Exception {
		secondSimulation.initialStatus();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSystemSimulation() {
		secondSimulation.addRequest(request1);
		secondSimulation.addRequest(request2);
		secondSimulation.addRequest(request3);
		secondSimulation.addRequest(request4);
		secondSimulation.addRequest(request5);
		secondSimulation.checkAvaliableElevators();
		secondSimulation.addRequest(request6);
		secondSimulation.addRequest(request7);
		secondSimulation.addRequest(request8);
		secondSimulation.addRequest(request9);
		secondSimulation.addRequest(request10);
		secondSimulation.addRequest(request11);
		secondSimulation.addRequest(request12);
		secondSimulation.addRequest(request13);
		secondSimulation.addRequest(request14);
		secondSimulation.addRequest(request15);
		secondSimulation.addRequest(request16);
		secondSimulation.checkAvaliableElevators();
	}

}
