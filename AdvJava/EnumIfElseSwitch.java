public class EnumIfElseSwitch {
    public static void main(String[] args) {
        Estatus s = Estatus.Success;
        /*
        if (s == Estatus.Running) System.out.println("I am Running");
        else if (s == Estatus.Failed) {
            System.out.println("I Failed");
        } else if (s == Estatus.Pending) {
            System.out.println("I am Pending");
        } else {
            System.out.println("I succeeded");
        }
         */
        // Using switch in place of the above
        switch (s){
            case Running -> System.out.println("I am Running");
            case Failed -> System.out.println("I Failed");
            case Pending -> System.out.println("I am Pending");
            default -> System.out.println("I Succeeded");
        }
    }
}
enum Estatus {
        Running, Failed, Pending, Success
}

