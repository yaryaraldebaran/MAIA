package latihan.latihanrstassured;

import org.json.simple.JSONObject;

public class jsontry {
	 
	public static void main(String[] args) {
		JSONObject jsonn = new JSONObject();
		
		jsonn.put("aku", "jalan");
		jsonn.put("akua", "makan");
		jsonn.put("akus", "malan");
		jsonn.put("akue", "js");
		jsonn.put("akur", "jarn");
		System.out.println(jsonn.get("aku"));
		
	}
}
