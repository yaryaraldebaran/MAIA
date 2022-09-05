package latihan.latihanabstractclass;

public abstract class Animals {
	private String nama;
	public Animals (String nama) { this.nama = nama; }
	public void setNama (String nama) { this.nama = nama; }
	public String getNama() { return nama; }
	public void voice() {
		System.out.println("Rawr");
	};
	public abstract void suara();
	public abstract void jalan(int langkah);
}
