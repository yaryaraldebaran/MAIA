package ujian.ujiankedua.produkoop;

public class Belanja {
	Product prd;
	Belanja(){
		prd = new Product("Floridina",12,5000,20.0);
	}
	public int tambahStok(int plusStok) {
		System.out.println("tambah stok berhasil sebanyak "+plusStok);
		prd.setStok(prd.getStok()+plusStok);
		return prd.getStok();
	};
	public int kurangStok(int minusStok) {
		System.out.println("kurangi stok berhasil sebanyak "+minusStok);
		prd.setStok(prd.getStok()-minusStok); 
		return prd.getStok();
	};
	public int cekStok() {
		System.out.println("stok yang dicek terdapat "+prd.getStok());
		return prd.getStok();
	};
	public double kalkulasiDiskon() {
		double potonganHarga = prd.getHarga()*((100.0-prd.getDiskon())/100.0); 
		System.out.printf("potongan harganya adalah %.2f dari diskon %.2f persen\n",potonganHarga,prd.getDiskon());
		return potonganHarga;
	};
	//method overloading
	public double kalkulasiDiskon(double d) {
		prd.setDiskon(d);
		double potonganHarga = prd.getHarga()*((100.0-prd.getDiskon())/100.0);
		System.out.printf("potongan harganya adalah %.2f setelah diskon baru %.2f persen\n",potonganHarga,prd.getDiskon());
		return potonganHarga;
	}
}
