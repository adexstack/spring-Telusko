public class ThreadPriority {
    public static void main(String[] args) {
        ThreadPriorityA objA = new ThreadPriorityA();
        /**
        Setting priority is only a suggestion to the schedular; it is the
        schedular job to actualize the order of execution.
         */
        //objA.setPriority(10); // OR
        //objA.setPriority(Thread.MAX_PRIORITY);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {throw new RuntimeException(e);
        }

        ThreadPriorityB objB = new ThreadPriorityB();
        //objB.setPriority(Thread.NORM_PRIORITY); // 5
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {throw new RuntimeException(e);
        }
        objA.start();
        objB.start();
    }
}

class ThreadPriorityA extends Thread{

    public void run(){
        for(int i = 1; i < 100; i++)
            System.out.println("Hello");
    }
}

class ThreadPriorityB extends Thread{

    public void run(){
        for(int i = 1; i < 100; i++)
            System.out.println("Hi");
    }
}
