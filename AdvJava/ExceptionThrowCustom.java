class SeyiException extends RuntimeException { // can also extend Exception
    // Note that you have to create a paremeterised constructor if expecting argument
    // and super will pass the argument to inherited super class constructor
    public SeyiException(String str){
        super(str);
    }
}

public class ExceptionThrowCustom {
    public static void main(String[] args) {
        int i = 20; // use 0, 2 and 20 to test the use of Throw
        int k = 0;
        int [] nums = new int[5];
        String str = null;

        try {
            k = 18/i;
            if(k==0)
                throw new SeyiException("This is Seyi's custom Exception");
        } catch (SeyiException e) {
            k = 18/1;
            System.out.println("This is the default output " + e);
        }
        catch(Exception e){
            System.out.println("Something else went wrong : " + e.getMessage());
        }
        System.out.println(k);
        System.out.println("Bye");
    }
}
