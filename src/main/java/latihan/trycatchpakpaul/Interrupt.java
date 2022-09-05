package latihan.trycatchpakpaul;

public class Interrupt extends Thread{

	public static void main(String[] args)
            throws InterruptedException
    {
        Interrupt thread = new Interrupt();
        thread.start();
        
        Thread.sleep(400);
		thread.interrupt();
		Interrupt threads = new Interrupt();
//		threads.start();
        System.out.println("Main thread execution completes");
    }
	
	public void run()
    {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread Dijalankan");
                Thread.sleep(100);
                System.out.println("Loading.....");
            }
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException occur");
        }
    }
}
