package latihan.cucumber.framework.scenariotest.shopdemoqa;

public enum ShopDemoQAScene {
	T1("User invalid register"),
	T2("User invalid register"),
	T3("User invalid register"),
	T4("User invalid register"),
	T5("User invalid comment"),
	T6("User invalid comment"),
	T7("User invalid comment"),
	T8("User invalid comment");
	
	private String testName;

	private ShopDemoQAScene(String values) {
		testName = values;
	}
	
	public String getTestName() {
		return testName;
	}
}
