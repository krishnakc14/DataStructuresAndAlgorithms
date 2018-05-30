package org.java.practise.General;

public class ThreadLocalExample {


    public static class MyRunnable implements Runnable {

        private ThreadLocal<Integer> threadLocal =  new ThreadLocal<Integer>();

    	static int threadlocal = 0;
        @Override
        public void run() {
           threadLocal.set( (int) (Math.random() * 100D) );
        	System.out.println("Running "+Thread.currentThread().getName());
        	threadlocal =  (int) (Math.random() * 100D) ;
        	System.out.println("Int value Static "+threadlocal);
        	System.out.println("Value generated for thread "+Thread.currentThread().getName()+" "+ threadLocal.get());
            try {
            	System.out.println("Sleeping "+Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
    
            System.out.println("Int value Static "+threadlocal);
            System.out.println("value of "+ Thread.currentThread().getName() + " "+ threadLocal.get());
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MyRunnable sharedRunnableInstance = new MyRunnable();
        MyRunnable sharedRunnableInstance2 = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance2);

        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate
    }

}
