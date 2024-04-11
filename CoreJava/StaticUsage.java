package CoreJava;
public class StaticUsage {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Android";
        obj2.price = 1003;
        Mobile.name = "SmartPhone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
    
}

class Mobile{
    int price;
    String brand;
    static String name;

    public void show(){
        System.out.println(price + " " + brand + " " + name);
    }

    // To indirectly use a non static variable in this static method,
    // the method has to have a Class parameter which will be explicitly used to access the non static variable
    public static void show1(Mobile obj){
        System.out.println("In static method");
        System.out.println(obj.price + " " + obj.brand + " " + name);
    }
}
