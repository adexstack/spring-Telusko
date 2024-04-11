public class InnerClassUse{
    public static void main(String[] args) {
        A obj = new A();
        obj.config();

        //A.B obj1 = new A().new B(); OR
        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = obj.new C();
        obj2.config();

        // As it's static class, can directly call new A.D() without creating obj of the class
        A.D obj3 = new A.D();
        obj3.config();
    }


}

class A{
    int age;

    public void config(){
        System.out.println("In Outer class A config");
    }

    class B{
        public void config(){
            System.out.println("In Inner class B config");
        }
    }

    class C{
        public void config(){
            System.out.println("In Inner class C config");
        }
    }

    static class D{
        public void config(){
            System.out.println("In Inner class D config");
        }
    }
}