package latihan.latihantrycatch;

public class BelajarExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 1/0;
			System.out.println("Statement : ");
		} 
		catch(Exception e) {
			System.out.println("nilai yang dimasukkan error");
		}
	}

}
