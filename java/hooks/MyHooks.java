package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {

	@Before
	public void setup(Scenario scenario) {
		
		System.out.println("** scenario steps will started-"+scenario.getName());
		System.out.println("++ application got openned");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		System.out.println("** scenario steps will ended-"+scenario.getName());
		System.out.println("-- application got closed");
	}
}
