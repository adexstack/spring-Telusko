public class ExceptionThrow {
    public static void main(String[] args) {
        int i = 0; // use 0, 2 and 20 to test the use of Throw
        int k = 0;
        int [] nums = new int[5];
        String str = null;

        try {
            k = 18/i;
            if(k==0)
                throw new ArithmeticException("I don't want to print zero");
        } catch (ArithmeticException e) {
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
