package latihan.latihantrycatch;

public class BelajarThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
		System.out.println("Kode berjalan dengan benar");
	}
	static void validate(int age) {
		if(age<14) {
			throw new ArithmeticException("Umur tidak valid");
		}
		else {
			System.out.println("umur valid");
		}
		System.out.println("Error yaaa");
	}

}
