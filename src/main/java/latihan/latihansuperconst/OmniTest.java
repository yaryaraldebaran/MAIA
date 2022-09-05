package latihan.latihansuperconst;

public class OmniTest {

	public static void main(String[] args) {
		OmnivoraImpl ayam = new OmnivoraImpl("ayam");
		ayam.makanDaging();
		ayam.makanTanaman();
		System.out.println(ayam.a);
		ayam.jalan();
		ayam.makanSiang();
	}

}
