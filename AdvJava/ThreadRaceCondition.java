class Counter{
    // Using synchronized to handle race condition. Ensuring 1 thread process
    // completes before another one starts
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}

public class ThreadRaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable objA = () -> {
                for(int i = 1; i <= 1000; i++)
                    c.increment();
        };

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {throw new RuntimeException(e);
        }

        Runnable objB = () -> {
            for(int i = 1; i <=
                    1000; i++)
                c.increment();
        };

        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);

        t1.start();
        t2.start();

        /**
         * Using join() method to ensure all the threads are completed before
         * printing the count. Without join(), main prints random values
         */
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
