public class ThreadRunnableImproved {
    public static void main(String[] args) {
        Runnable objA = () -> {
                for(int i = 1; i < 100; i++)
                    System.out.println("Hello");
        };

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {throw new RuntimeException(e);
        }

        Runnable objB = () -> {
            for(int i = 1; i < 100; i++)
                System.out.println("Hi");
        };
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);
        t1.start();
        t2.start();
    }
}