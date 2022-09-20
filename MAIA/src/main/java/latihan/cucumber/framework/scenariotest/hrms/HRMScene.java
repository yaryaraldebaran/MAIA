package latihan.cucumber.framework.scenariotest.hrms;



public enum HRMScene {
	
//	T1("User invalid login"),
	T1("User valid login"),
	T2("User valid login"),
	T3("User valid login"),
	T4("User valid login"),
	T5("User valid login"),
	T6("User valid login");
//	T3("Dashboard user function");
	
	private String testName;
	
	private HRMScene(String values) {
		testName = values;
	}
	
	public String getTestName() {
		return testName;
	}	
}