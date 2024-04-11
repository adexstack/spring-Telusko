public class EnumClassAdvUsage {
    public static void main(String[] args) {
        Laptopp lap = Laptopp.Macbook;
        // showing Enum is actually an inherited Superclass
        System.out.println(lap.getClass().getSuperclass());

        System.out.println(lap);
        System.out.println(lap.getPrice());
        System.out.println("---------------------");

        for (Laptopp lapVal : Laptopp.values()) {
            System.out.println(lapVal + " : " + lapVal.getPrice());
        }
    }

}

enum Laptopp {
    // Using default and parameterised constructors here
    Macbook(2000), XPS(2200), Surface, Thinkpad(3500);

    private int price;

    Laptopp() {
        this.price = 500;
        System.out.println("in Laptopp " + this.name());
    }

    Laptopp(int price) {
        this.price = price;
        System.out.println("in Laptopp " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
