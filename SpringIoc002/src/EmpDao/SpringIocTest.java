package EmpDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2014/12/23.
 */
public class SpringIocTest {
    public static void main(String[] args) {
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("app.xml");
          EmpService service= (EmpService)ctx.getBean("empService");
        System.out.println(service.getDempDao());
        System.out.println(service.getEmpDao());
    }
}
