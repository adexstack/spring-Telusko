public class EnumUse {
    public static void main(String[] args) {
        Status[] ss = Status.values();
        for(Status s : ss){
            System.out.println(s + " : " + s.ordinal());
        }

    }
}
enum Status{
    Running, Failed, Pending, Success
}

