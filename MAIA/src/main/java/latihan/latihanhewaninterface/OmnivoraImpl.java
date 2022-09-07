package latihan.latihanhewaninterface;

public class OmnivoraImpl implements Herbivora, Karnivora{
	String nama;
	OmnivoraImpl(String name){
		this.nama=name;
	}
	public void makanTanaman() {
		System.out.println(this.nama+" makan tanaman");
	}
	public void makanDaging() {
		System.out.println(this.nama+" makan daging");
	}
	public void jalan() {
		System.out.println("Hewan ini berjalan ");
		
	}
	
	public void makanSiang() {
		System.out.println("makan siang");
		
	}
	
}
