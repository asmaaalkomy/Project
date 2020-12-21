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
 * SimulationTest1 simulated 8 different requests of two stops in a given time initiated from different floors. 
 */

public class SimulationTest1 extends TestCase {

	SystemSimulation firstSimulation = new SystemSimulation();
	Request request1= new Request(0,12,"Up");
	Request request2= new Request(35,0,"Down");
	Request request3= new Request(35,16,"Down");
	Request request4= new Request(16,0,"Down");
	Request request5= new Request(0,12,"Up");
	Request request6= new Request(10,40,"Up");
	Request request7= new Request(35,0,"Down");
	Request request8= new Request(2,0,"Down");
	
	protected void setUp() throws Exception {
		firstSimulation.initialStatus();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testSystemSimulation() {
		
	    firstSimulation.addRequest(request1);
		firstSimulation.addRequest(request2);
		firstSimulation.checkAvaliableElevators();
		firstSimulation.addRequest(request3);
		firstSimulation.addRequest(request4);
		firstSimulation.addRequest(request5);
		firstSimulation.addRequest(request6);
		firstSimulation.addRequest(request7);
		firstSimulation.addRequest(request8);
		
	}

}
