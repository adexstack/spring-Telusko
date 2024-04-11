class AbstractUse {
    public static void main(String[] args) {
        Car obj = new UpdatedWagon();
        obj.drive();
        obj.flyNumber();
        obj.playMusic();
    }
}

abstract class Car{
    public abstract void drive();
    public abstract int flyNumber();

    public void playMusic(){
        System.out.println("Playing music...");
    }
}

abstract class WagonR extends Car{

    @Override
    public void drive() {
        System.out.println("Driving...");
    }

}

class UpdatedWagon extends WagonR{

    @Override
    public int flyNumber() {
        System.out.println("Flying...");
        return 0;
    }

}