package latihan.latihantrycatch;

public class ThreadTut {

	public static void main(String[] args) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("123");
		System.out.println("345");
		System.out.println("897");
	}

}
