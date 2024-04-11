package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Configuring spring container and declaring the classes in bean. Object creation happens here
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//get from spring context mvn dependency
        Alien obj1 = (Alien) context.getBean("alien1"); // getting object from the container
        //obj1.age = 21;
        System.out.println(obj1.getAge());
        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien1"); // getting object for the container
//        System.out.println(obj2.age);
    }
}
