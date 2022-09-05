package latihan.latihanoophewan;
public class Iguana {
	public final static double phi = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hewan iguana;
		iguana = new Hewan("rico");
		iguana.setNama("Rocky");
		iguana.lari();
	
		System.out.println(phi);
		System.out.println("nama adalah "+iguana.getNama());
		
	}

}
