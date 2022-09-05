package latihan.latihantrycatch;

import java.sql.SQLException;

public class TryExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			eception();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("ini dari catch");
		}
	}
	static void mathError() throws ArithmeticException {
		int x = 1/0;
	}
	static void math2Error() throws ArithmeticException {
		String x = "string";
	}
	static void eception()throws InterruptedException{
		Thread.sleep(100);
		System.out.println("OK Interrupt");
	}

}
