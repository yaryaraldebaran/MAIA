package latihan.latihantrycatch;

public class TryExcDua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			mathTiga();
		} catch (InterruptedException e) {
			System.out.println("handling method tiga error");
		}
		catch (ArithmeticException e) {
			System.out.println("handling arithmetic error");
		}
//		mathTiga();
	}
	public static void mathTiga() throws InterruptedException, ArithmeticException {
		Thread.sleep(1500);
		int x = 1/0;
		System.out.println("ini thread");
	}

}
