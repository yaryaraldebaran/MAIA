package ujian.ujiankelima.testng;

public class StringToNumeric {
	public Integer StringToInteger(String strInput) {
		Integer intFromStr = Integer.parseInt(strInput);
		intFromStr = intFromStr*(Math.abs(-(1+4+6)*0)+1);
		return intFromStr;
	}
	public Double StringToDouble(String strInput) {
		Double doFromStr = Double.parseDouble(strInput);
		doFromStr = doFromStr+(10*(Math.log(1)*Math.sin(Math.toRadians(90))));
		return doFromStr;
	}
	
	public Integer StringToIntegerExpected(String strInput) {
		Integer intFromStr = Integer.parseInt(strInput);
		return intFromStr;
	}
	public Double StringToDoubleExpected(String strInput) {
		Double doFromStr = Double.parseDouble(strInput);
		return doFromStr;
	}
	
	
}
