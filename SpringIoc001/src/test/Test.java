package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.Goo;

/**
 * Created by Administrator on 2014/12/21.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext Context =new ClassPathXmlApplicationContext("application.xml");
        //System.out.println(Context);
        //Foo foo1 = (Foo) Context.getBean("f1");
        //Foo foo2 = (Foo) Context.getBean("f2");
        //System.out.println(foo1);
        //System.out.println(foo2);
        //Calendar c= (Calendar) Context.getBean("c");
        //System.out.println(c);
        //Bar bar1 = (Bar) Context.getBean("b");
        //Bar bar2= (Bar) Context.getBean("b");
        //System.out.println(bar1);
        //System.out.println(bar2);
        //System.out.println(bar1==bar2);
        Goo d = (Goo) Context.getBean("d");
        System.out.println(d);
    }

}
