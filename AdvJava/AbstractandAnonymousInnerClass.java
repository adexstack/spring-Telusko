public class AbstractandAnonymousInnerClass {
    public static void main(String[] args) {
        K obj = new K()
        {
            public void show(){
                System.out.println("New Show");
            }

            public void streaming(){
                System.out.println("I am streaming");
            }

        };

        obj.show();
        obj.streaming();

        
    }   
}

abstract class K {
    public abstract void show();

    public abstract void streaming();
    //public abstract void streaming();   
}
