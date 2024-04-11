import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("navin", "lasmi", "john", "kishor");

        List<StudentAcc> sNames = new ArrayList<>();

        for (String name : names){ // Using foreach
            sNames.add(new StudentAcc(name));
        }
        System.out.println(sNames);

        List<StudentAcc> sNames1 = names.stream()
                .map(name -> new StudentAcc(name))// Lambda Expression
                .toList();
        System.out.println(sNames1);


        List<StudentAcc> sNames2 = names.stream()
                .map(StudentAcc::new)// Constructor/Method Reference
                .toList();
        System.out.println(sNames2);



    }
}

class StudentAcc{
    private String name;
    private int age;
    public StudentAcc() {
    }

    public StudentAcc(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentAcc{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
