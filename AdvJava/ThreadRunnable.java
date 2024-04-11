public class ThreadRunnable {
    public static void main(String[] args) {
        Runnable objA = new ThreadRunnableA();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {throw new RuntimeException(e);
        }

        Runnable objB = new ThreadRunnableB();
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);
        t1.start();
        t2.start();
    }
}

class ThreadRunnableA implements Runnable{

    public void run(){
        for(int i = 1; i < 100; i++)
            System.out.println("Hello");
    }
}

class ThreadRunnableB implements Runnable{

    public void run(){
        for(int i = 1; i < 100; i++)
            System.out.println("Hi");
    }
}
