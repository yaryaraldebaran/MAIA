package latihan.latihanoophewan;

public class Hewan {
	private String nama;
	//konstruktor 
	public Hewan(String ngaran) {
		this.nama=ngaran;
	}
	public String getNama() {
		return this.nama;
	}
	public void setNama(String nama) {
		this.nama=nama;
	}
	public void lari() {
		System.out.println("Hewan ini lari");
	}
	public void jalan() {
		System.out.println("Hewan ini jalan");
	}
	public static void jual() {
		System.out.println("Hewan ini mau dijual");
	}
}