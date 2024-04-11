package CoreJava;
public class Arrays {
    public static void main(String[] args) {

        int [] num2 = {9, 12, 32};

        System.out.println(num2[1]);

        int [] num = new int[4];
        num[0] = 4;
        num[1] = 3;
        num[2] = 2;
        num[3] = 7;
        for (int i=0; i<4; i++) {
            System.out.println(num[i]);
        }

        System.out.println("Using For Loop");
        for (int i : num) {
            System.out.println(i);
        }

        System.out.println(num.length - 1);

        
    }
}
