package org.java.practise.General;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
 
@SuppressWarnings("rawtypes")
public class DemoExecutorUsage {
 
    private static ExecutorService executor = null;
   
	private static volatile Future taskOneResults = null;
    private static volatile Future taskTwoResults = null;
 
    public static void main(String[] args) {
        executor = Executors.newFixedThreadPool(3);
        while (true)
        {
            try
            {
                checkTasks();
                Thread.sleep(100000);
            } catch (Exception e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }
 
    private static void checkTasks() throws Exception {
        if (taskOneResults == null
                || taskOneResults.isDone()
                || taskOneResults.isCancelled())
        {
            taskOneResults = executor.submit(new TestOne());
        }
 
        if (taskTwoResults == null
                || taskTwoResults.isDone()
                || taskTwoResults.isCancelled())
        {
            taskTwoResults = executor.submit(new TestTwo());
        }
    }
}
 
class TestOne implements Runnable {
    public void run() {
        while (true)
        {
            System.out.println("Executing task one");
            try
            {
                Thread.sleep(10000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
 
    }
}
 
class TestTwo implements Runnable {
    public void run() {
        while (true)
        {
            System.out.println("Executing task two");
            try
            {
                Thread.sleep(10000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}

class TestThree implements Runnable {
    public void run() {
        while (true)
        {
            System.out.println("Executing task three");
            try
            {
                Thread.sleep(10000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}

class MultiRunnable implements Runnable {
	 
    private final List<Runnable> runnables;
 
    public MultiRunnable(List<Runnable> runnables) {
        this.runnables = runnables;
    }
 
    @Override
    public void run() {
        for (Runnable runnable : runnables) {
             new Thread(runnable).start();
             try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
