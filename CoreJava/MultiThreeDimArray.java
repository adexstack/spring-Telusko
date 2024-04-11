package CoreJava;
public class MultiThreeDimArray {
    public static void main(String[] args) {
        int [][][] num = new int[3][4][5];

        //num[0][0][0] = 2;

        // disregarding the assignment on top and randomly doing it here
        for(int i =0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                for(int k = 0; k < num[i][j].length; k++){
                    num[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }


        System.out.println("getting all the assigned values using Enhanced for loop");
        for (int [][] i : num){
            for (int[] j : i){
                for (int k : j){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
            
        }
}
}
