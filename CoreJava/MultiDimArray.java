package CoreJava;
public class MultiDimArray {
    public static void main(String[] args) {
        int [][] num = new int[2][3];
        num[0][0] = 2;
        num[0][1] = 3;
        num[0][2] = 4;
        num[1][0] = 6;
        num[1][1] = 7;
        num[1][2] = 8;

        // disregarding the assignment on top and randomly doing it here
        for(int i =0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                num[i][j] = (int) (Math.random() * 10);
            }
            System.out.println();
        }

        System.out.println("getting all the assigned values using For loop");
        for(int i =0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("getting all the assigned values using Enhanced for loop");
        for (int [] i : num){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
        
    }
}
