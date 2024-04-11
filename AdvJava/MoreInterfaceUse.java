public class MoreInterfaceUse {
    public static void main(String[] args) {
        MoreInterfaceUseA obj = new MoreInterfaceUseB();
        obj.show();
        obj.config();

        MoreInterfaceUseX obj1 = new MoreInterfaceUseB();
        obj1.run();

    }
}

interface MoreInterfaceUseA {
    int age = 44;  // final and static by default
    String area = "Mumbai";

    void show();

    void config();
}

interface MoreInterfaceUseX {
    void run();
}

interface MoreInterfaceUseY extends MoreInterfaceUseX {
    void run();
}

class MoreInterfaceUseB implements MoreInterfaceUseA,MoreInterfaceUseY {

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void config() {
        System.out.println("In config");
    }

    @Override
    public void run() {
        System.out.println("I am running");
    }
}

