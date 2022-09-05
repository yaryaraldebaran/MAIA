package ujian.ujiankedua.geometri;

public class Geometri {
	public double luasPersegi(double doPanjang, double doLebar) {
		double doLuasPersegi=doPanjang*doLebar;
		System.out.printf("luas persegi dengan panjang %f dan lebar %f adalah %f\n",doPanjang,doLebar,doLuasPersegi);
		return doLuasPersegi;
	}
	public double luasSegitigaSatu(double doAlas, double doTinggi) {
		double doLuasSegitiga =0.5*doAlas*doTinggi;
		System.out.printf("luas segitiga dengan alas %f dan tinggi %f adalah %f\n", doAlas,doTinggi,doLuasSegitiga);
		return doLuasSegitiga;
		//atau bisa pake 1/2*alas*tinggi
	}
	public double luasSegitigaDua(double doAlasDua, double doTinggiDua) {
		double doLuasSegitigaDua =(doAlasDua*doTinggiDua)*(1.0/2.0); //harusnya 1.0/2.0 bukan 1/2
		System.out.printf("luas segitiga dengan alas %f dan tinggi %f adalah %f\n", doAlasDua,doTinggiDua,doLuasSegitigaDua);
		return doLuasSegitigaDua;
		//atau bisa pake 1/2*alas*tinggi
	}
	
	public double luasTrapesium(double doSisiA, double doSisiB,double doTinggi) {
		return (doSisiA+doSisiB)/2*doTinggi;
	}
}
