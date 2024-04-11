class ExceptionDuckingThrowsA{
    public void show() throws ClassNotFoundException {
        //Class.forName("ExceptionDuckingThrows");
        Class.forName("ThisClassNotExist");
    }
}

public class ExceptionDuckingThrows {

    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        ExceptionDuckingThrowsA obj = new ExceptionDuckingThrowsA();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
