package CoreJava;
public class QuizTest2 {
    public static void main(String[] args) {
        //What will be the value of variables ‘x’ and ‘y’ from the given code?

    int x = 5;

    int y = 10;

    int z = (x++ > 5 && y-- < 10) ? x-- : y;

    System.out.println("x = " + x); // 6
    System.out.println("y = " + y); // 10

    int i, j;

    i = 100;

    j = 300;

    while(++i < --j);

    System.out.println(i); // 200

    }
    
}
