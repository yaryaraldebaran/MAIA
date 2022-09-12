package tugas.async;

import java.time.LocalDateTime;

public class MainAsynChildSyncTaskForAsync {

	private static int intLoop = 0;//you can change this variable into static or not-static for testing
	private AsyncListener asyncListener; // listener field
	  
    // setting the listener
    public void registerAsynchronous(AsyncListener mListener)
    {
    	System.out.println("LISTENER REGISTER ON INTLOOP KE "+intLoop);
    	intLoop++;
        this.asyncListener = mListener;
    }
    
    public void getIntLoop()
    {
    	System.out.println("LAST VALUE OF intLoop Variable is "+intLoop);
    }
  
    // My Asynchronous task main
    public void asyncParent(final int intAsyncParent)
    {
    	System.out.println("CREATE Thread Process - "+intLoop);
        // An Async task always executes in new thread
        new Thread(new Runnable() {
            public void run()
            {
            	for(int i=0;i<4;i++)
            	{
            		asyncChild(intAsyncParent,i);//yang ini jalan terus, total 11 detik
            		synchronousTaskForAsync(intAsyncParent,i); //delay 15 detik
            		try {
						Thread.sleep(3000); //delay 6 detik
					} catch (InterruptedException e) {
						System.out.println("Exception Thread asyncParent "+e);
					}//dari synchronoustaskforasync pertama beda 8detik
            		//delay total 18 detik, asyncChild baru mulai pada detik ke 20
            		System.out.println(LocalDateTime.now().getSecond()+" Asynchronous asyncParent Activity Loop - "+i);
            		//setelah ini baru asyncChild jalan
            	}
  
                // check if listener is registered.
                if (asyncListener != null) {
                	System.out.println("Asynchronous asyncParent Listener ");
                    // invoke the callback method of class UsualEvent
                	asyncListener.onAsyncParent(intAsyncParent);
                }
            }
        }).start();
    }
    
    // My Asynchronous task without sync task inside it
    public void asyncChild(final int intAsyncParent, final int intAsyncParentLoop)
    {
        // An Async task always executes in new thread
        new Thread(new Runnable() {
            public void run()
            {
            	for(int i=0;i<5;i++)
            	{
            		try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						System.out.println("Exception Thread asyncChild "+e);
					}
            		System.err.println(LocalDateTime.now().getSecond()+" Asynchronous asyncChild Activity "+i+" From asyncParent - "+intAsyncParent+" Loop - "+intAsyncParentLoop);
            	}
  
                // check if listener is registered.
                if (asyncListener != null) {
                	System.out.println("Asynchronous asyncChild Listener ");
                    // invoke the callback method of class UsualEvent
                	asyncListener.onAsyncChild(intAsyncParent,intAsyncParentLoop);
                }
            }
        }).start();
    }
    
    public void synchronousTask()
    {
    	for(int i=0;i<4;i++)
    	{
    		intLoop++;
    		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception in Synchronous Task "+e);
			}
    		System.out.println(LocalDateTime.now().getSecond()+" Synchronous Task - "+i+" INT LOOP VALUE "+intLoop);
    	}
    }
    
    public void synchronousTaskForAsync(int intAsyncParent,int intLoopAsyncParent)
    {
    	for(int i=0;i<5;i++)
    	{
    		intLoop++;
    		try {
				Thread.sleep(3000);//jadi 3 detik
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception in Synchronous Task "+e);
			}
    		System.out.println(LocalDateTime.now().getSecond()+" synchronousTaskForAsync Synchronous Task - "+i+" From asyncParent "+intAsyncParent+" Loop - "+intLoopAsyncParent);
    	}
    }
    
    public static void main(String[] args)
    {	
    	MainAsynChildSyncTaskForAsync obj = new MainAsynChildSyncTaskForAsync();
    	System.out.println("start pada "+LocalDateTime.now().getSecond());
    	AsyncListener mListener = new UsualEvent();
        obj.registerAsynchronous(mListener);
        obj.asyncParent(1);
        
        obj.getIntLoop();
        
        obj.synchronousTask();
        
        obj.getIntLoop();
//        obj = new MainAsync();
//    	mListener = new UsualEvent();
//        obj.registerAsynchronous(mListener);
//        obj.asyncParent(2);
//        
//        obj.synchronousTask();
//        
//        obj = new MainAsync();
//    	mListener = new UsualEvent();
//        obj.registerAsynchronous(mListener);
//        obj.asyncParent(3);
    }
}
