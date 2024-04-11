package CoreJava;
public class JaggedArray {
    public static void main(String[] args) {
        int [][] nums = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        // Randomly assigning values
        // disregarding the assignment on top and randomly doing it here
        for(int i =0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int) (Math.random() * 10);
            }
            System.out.println();
        }

        System.out.println("getting all the assigned values using Enhanced for loop");
        for (int [] i : nums){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
            
        }
    
}
}
