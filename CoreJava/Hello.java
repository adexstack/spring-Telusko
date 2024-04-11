package CoreJava;
class Hello {
    public static void main(String[] args) {
    

        //byte b = 127;
        int a = 257;
        byte k = (byte) a; //will use modulus and print 1 (the remainder) 
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f; // Type casting will print 5

        System.out.println(t);

        byte b = 10;
        byte c = 30;
        int result = b * c;
        System.out.println(result); // 300 (type promotion)

        char ch = 'a';
        ch += 2;
        System.out.println(ch);

        int num1 = 7;
        int num2 = 7;
        int result1 = num1++; //post increment (will print 7)
        int result2 = ++num2; //pre increment (will print 8)

        System.out.println(result1);
        System.out.println(result2);
    }

}