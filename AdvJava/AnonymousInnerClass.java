public class AnonymousInnerClass {
    public static void main(String[] args) {
        J obj = new J(){
            public void show(){
                System.out.println("New Show");
            }
        };
        obj.show();
        
    }   
}

class J {
    public void show(){
        System.out.println("In A Show");
    }
}
