public class FunctionalInterface {
    public static void main(String[] args) {
        // using Anonymous class here
        FunctionalInterfaceA obj = new FunctionalInterfaceA() {
            @Override
            public void show() {
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
interface FunctionalInterfaceA{
    void show();
}
//class FunctionalInterfaceB implements FunctionalInterfaceA{

//    @Override
//    public void show() {
//        System.out.println("In show");
//    }
//}
