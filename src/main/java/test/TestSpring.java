package test;

import core.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
//        Student stu=new Student();
//        stu.setStuNo(1);
//        stu.setStuName("zs");
//        stu.setStuAge(18);
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu1=(Student) context.getBean("student");
        stu1.setHobby(null);
/*        Student stu2=(Student) context.getBean("student");
        System.out.println(stu1);
        System.out.println(stu2);*/
        stu1.showHobby("ballHobby");
    }
}
