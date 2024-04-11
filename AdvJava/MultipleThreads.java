public class MultipleThreads {
    public static void main(String[] args) {
        MultipleThreadsA objA = new MultipleThreadsA();
        MultipleThreadsB objB = new MultipleThreadsB();

        objA.start();
        objB.start();
    }
}

class MultipleThreadsA extends Thread{
    public void run2(){
        //show();
    }
    public void run(){
        for(int i = 1; i < 100; i++)
            System.out.println("Hello");
    }
}

class MultipleThreadsB extends Thread{
    public void run2(){
        //show();
    }
    public void run(){
        for(int i = 1; i < 100; i++)
            System.out.println("Hi");
    }
}
