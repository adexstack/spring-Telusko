public class AnnotationUse {
    public static void main(String[] args) {
        AnnotationUseB obj = new AnnotationUseB();
        obj.showTheDataWhichBelongsToThisClass();
    }
}

class AnnotationUseA{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show");
    }

}
class AnnotationUseB extends AnnotationUseA{
    @Override //This annotation will ensure the method name exists in super class. Will error if mismatch
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("In B show");
    }

}
