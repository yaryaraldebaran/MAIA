package ujian.ujiankedua.parsedata;

public class parseStrToNmrc {
	public int strToInt (String str) {
		System.out.println("fungsi untuk parse string ke integer");
		String outputA="";
		int intStr = 0;
		try {
			intStr = Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println("Ini error catch strInt()"+e );
			outputA = ""+e;
		}
		return intStr;
	}
	
	public double strToDbl (String str) {
		System.out.println("fungsi untuk parse string ke double");
		double doStr = 0.0;
		doStr = Double.parseDouble(str);
		System.out.println("Hasil parsing "+doStr);
		return doStr;
	}
	public boolean testParseToIntActual(String x) {
		boolean isExcept = true;
		try {
			int b = Integer.parseInt(x);
		} catch (Exception e) {
			isExcept = false;
		}
		return isExcept;
	}
	public boolean testParseToIntExpect(String x) {
		boolean isExcept = true;
		try {
			int b = Integer.parseInt(x);
		} catch (Exception e) {
			isExcept = false;
		}
		return isExcept;
	}
	public String testMathPowExpect(String x) {
		String strOutput = "";
		try {
			strOutput = String.valueOf(Math.pow(Double.parseDouble(x), Double.parseDouble(x)));
		} catch (Exception e) {
			strOutput = ""+e;
		}
		System.out.println("Test math pow expect ==> "+strOutput);
		return strOutput;
	}
	public String testMathPowActual(String x) {
		String strOutput = "";
		try {
			strOutput = String.valueOf(Math.pow(Double.parseDouble(x), Double.parseDouble(x)));
		} catch (Exception e) {
			strOutput = ""+e;
		}
		System.out.println("Test math pow actual ==> "+strOutput);
		return strOutput;
	}
	
}
