import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting List of data
 * Implemented Comparator for Students
 * Implemented Comparable for Employee
 */
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}

class Employee implements Comparable<Employee>{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee that) {
        return this.age > that.age ? 1 : -1;
    }
}

public class ComparableWithList {
    public static void main(String[] args) {
        Comparator<Student> comp = (o1, o2) ->  o1.age > o2.age ? 1 : -1;

        System.out.println("\n=======sort Students using Comparator==========\n");
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Dan", 26));
        studs.add(new Student("Adam", 17));
        studs.add(new Student("Zan", 42));
        studs.add(new Student("Kenny", 15));

        for(Student s : studs)
            System.out.println(s);
        System.out.println(studs);

        Collections.sort(studs, comp);
        System.out.println(studs);

        System.out.println("\n=======sort Employees using Comparable==========\n");

        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Dan", 26));
        emps.add(new Employee("Adam", 17));
        emps.add(new Employee("Zan", 42));
        emps.add(new Employee("Kenny", 15));

        for(Employee s : emps)
            System.out.println(s);
        System.out.println(emps);

        Collections.sort(emps);
        System.out.println(emps);
    }
}
