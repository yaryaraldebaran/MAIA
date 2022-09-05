package latihan.trycatchpakpaul;

public class StaticCounter extends Thread{
	
	public static int count = 0;
	int a=0;
	
	StaticCounter()
	{
        count ++;
    }
    public void getCount()
    {
        System.out.print(count+",");
    }
    
    public static void main( String args[] ) throws InterruptedException
    {
    	
    	StaticCounter c1 = new StaticCounter(); //count incremented to 1
        c1.start();
        c1.getCount();
        Thread.sleep(1000);
        StaticCounter c2 = new StaticCounter(); //count incremented to 2
        
        c2.getCount();
        
        X xX = new X();
        xX.start();
        xX.putMethod();
        c1.sleep(10000);
        
        System.out.println("JSAD");
        System.out.println("JSAD1");
        System.out.println("JSAD2");
        
        StaticCounter c3 = new StaticCounter(); //count incremented to 3
        c3.getCount();        
    }
    
    static class X extends Thread {
    	
    	public void putMethod() throws InterruptedException {
    		for(int i=0;i<5;i++)
    		{
    			Thread.sleep(1000);
    			StaticCounter c4 = new StaticCounter();
                c4.getCount();
    		}
    	}
    }
}