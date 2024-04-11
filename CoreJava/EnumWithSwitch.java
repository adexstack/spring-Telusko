package CoreJava;
public enum EnumWithSwitch{ //Better to name this class Day for real use case, named as this for now for learning purpose
    MONDAY, TUESDAY, WEDNESDAY, SUNDAY
}

class EnumTest{
    EnumWithSwitch day;

    public EnumTest(EnumWithSwitch day) {
        this.day = day;
    }

    public void selectDayUsingSwitch(){
        switch (day) {
            case MONDAY:
            System.out.println("It is Monday");
            break;
            case TUESDAY:
            System.out.println("It is Tuesday");
            break;
            case WEDNESDAY:
            System.out.println("It is Wednesdayday");
            break;
            default:
            System.out.println("It is default day!!!");
        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(EnumWithSwitch.MONDAY);
        firstDay.selectDayUsingSwitch();
        EnumTest secondDay = new EnumTest(EnumWithSwitch.TUESDAY);
        secondDay.selectDayUsingSwitch();
        EnumTest thirdDay = new EnumTest(EnumWithSwitch.WEDNESDAY);
        thirdDay.selectDayUsingSwitch();
        EnumTest defaultDay = new EnumTest(EnumWithSwitch.SUNDAY);
        defaultDay.selectDayUsingSwitch();
    }
}
