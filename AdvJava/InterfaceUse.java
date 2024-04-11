public class InterfaceUse {
    public static void main(String[] args) {
        InterfaceUseA obj = new InterfaceUseB();
        obj.show();
        obj.config();
        System.out.println(InterfaceUseA.age);
        System.out.println(InterfaceUseA.area);
    }
}

interface InterfaceUseA{
    int age = 44;  // final and static by default
    String area = "Mumbai";
    void show();
    void config();
}

class InterfaceUseB implements InterfaceUseA{

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("In config");
    }
}
