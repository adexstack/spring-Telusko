package CoreJava;
public class ForLoop {
   
    public static void main(String[] args) {


        for(int i = 0; i<=5; i++){
            System.out.println("DAY " + i);

            for(int j = 0; j<=9; j++){
                if(j <= 2)
                    System.out.println(j + 9 + " AM");
                else if(j == 3)
                    System.out.println(j + 9 + " PM");
                else
                    System.out.println((j - 3) + " PM");
            }
        }


        // https://www.geeksforgeeks.org/bitwise-operators-in-java/
        int a = 3;
        int b = 6;
        int result = (~a & b) | (a & ~b);
        System.out.println(result);
      
    }
}
    

