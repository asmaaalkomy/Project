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
 * simulationTest3 simulated 11 different requests of two stops in a given time all initiated from ground floor.  
 */
public class SimulationTest3 extends TestCase {
	
	SystemSimulation thirdSimulation = new SystemSimulation();
	Request request1= new Request(0,12,"Up");
	Request request2= new Request(0,35,"Up");
	Request request3= new Request(0,16,"Up");
	Request request4= new Request(0,23,"Up");
	Request request5= new Request(0,12,"Up");
	Request request6= new Request(0,19,"Up");
	Request request7= new Request(0,45,"Up");
	Request request8= new Request(0,5,"Up");
	Request request9= new Request(0,33,"Up");
	Request request10= new Request(0,40,"Up");
	Request request11= new Request(0,50,"Up");


	protected void setUp() throws Exception {
		thirdSimulation.initialStatus();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSystemSimulation() {
		thirdSimulation.addRequest(request1);
		thirdSimulation.addRequest(request2);
		thirdSimulation.addRequest(request3);
		thirdSimulation.addRequest(request4);
		thirdSimulation.addRequest(request5);
		thirdSimulation.addRequest(request6);
		thirdSimulation.addRequest(request7);
		thirdSimulation.addRequest(request8);
		thirdSimulation.addRequest(request9);
		thirdSimulation.addRequest(request10);
		thirdSimulation.addRequest(request11);
		thirdSimulation.checkAvaliableElevators();
	}

}
