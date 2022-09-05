package ujian.ujiankedua.produkoop;

public class Product {
	static int counter;
	String namaProduk;
	int stok;
	int harga;
	double diskon;
	
	Product(String namaP,int stokP,int hargaBarang, double d){
		this.namaProduk=namaP;
		this.stok=stokP;
		this.diskon = d;
		this.harga = hargaBarang;
	}

	public String getNamaProduk() {
		return namaProduk;
	}

	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public double getDiskon() {
		return diskon;
	}

	public void setDiskon(double d) {
		this.diskon = d;
	}
	
}
