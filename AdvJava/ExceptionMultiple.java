public class ExceptionMultiple {
    public static void main(String[] args) {
        int i = 2;
        int k = 0;
        int [] nums = new int[5];
        String str = null;

        try {
            k = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[6]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
        catch(NullPointerException e){
            System.out.println("The string is null");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(k);
        System.out.println("Bye");
    }
}
