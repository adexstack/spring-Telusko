package CoreJava;
public class StringBufferUse {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        sb.insert(5, " Seyi");
        System.out.println(sb);
        sb.append(" Dan");
        System.out.println(sb);
        sb.replace(9, 10, "ff");
        System.out.println(sb);

        //StringBuilder is not thread safe and StringBufferis thread safe
    }
}
