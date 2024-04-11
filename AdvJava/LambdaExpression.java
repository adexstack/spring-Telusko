public class LambdaExpression {
    public static void main(String[] args) {
        // using Lambda expression for SAM
        LambdaExpressionA obj = i -> System.out.println("In show " + i);
        obj.show(5);
    }
}
interface LambdaExpressionA{
    void show(int i);
}

