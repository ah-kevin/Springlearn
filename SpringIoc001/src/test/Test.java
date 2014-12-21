package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.Foo;

/**
 * Created by Administrator on 2014/12/21.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext Context =new ClassPathXmlApplicationContext("application.xml");
        System.out.println(Context);
        Foo foo1 = (Foo) Context.getBean("f1");
        System.out.println(foo1);
    }

}
