public class InterfaceRealUse {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer navin = new Developer();
        navin.devApp(lap);
        navin.devApp(desk);
    }

}

interface Computer{
    void code();
}
class Laptop implements Computer{

    @Override
    public void code() {
        System.out.println("I am coding with Laptop");
    }
}
class Desktop implements Computer{

    @Override
    public void code() {
        System.out.println("I am coding with desktop");
    }
}

class Developer{
    public void devApp(Computer comp){
        comp.code();
    }
}
