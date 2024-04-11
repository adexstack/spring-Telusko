public class LambdaWithReturn {
    public static void main(String[] args) {
        // using Lambda expression for SAM
        LambdaWithReturnA obj = (i, j) -> i+j;
        int result = obj.add(5, 10);
        System.out.println(result);
    }
}
interface LambdaWithReturnA{
    int add(int i, int j);
}

