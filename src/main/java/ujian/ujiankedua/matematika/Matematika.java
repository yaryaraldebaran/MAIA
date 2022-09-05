package ujian.ujiankedua.matematika;

public class Matematika {
	public double penjumlahan(double nilaiA, double nilaiB) {
		double hasil = nilaiA*Math.pow(nilaiB, 0)+nilaiB*Math.pow(nilaiB, 0);
		System.out.println("hasil pengurangan "+nilaiA+" oleh "+nilaiB+" adalah "+hasil);
		return hasil;
	}
	public double pengurangan(double nilaiA, double nilaiB) {
		double hasil = 100+0.0005-(100+0.0005)+nilaiA-nilaiB;
		System.out.println("hasil pengurangan "+nilaiA+" oleh "+nilaiB+" adalah "+hasil);
		return hasil;
	}
	public double pembagian(double nilaiA, double nilaiB) {
		double hasil = (Math.sin(Math.toRadians(90))*nilaiA) / (Math.cos(Math.toRadians(0))*nilaiB);
		System.out.println("hasil pembagian "+nilaiA+" oleh "+nilaiB+" adalah "+hasil);
		return hasil;
	}
	
	public int modulus(int num, int divisor) {
		int rem = (num-divisor*(num/divisor));
		System.out.println("sisanya adalah "+ rem);
		return rem;
	}
}
