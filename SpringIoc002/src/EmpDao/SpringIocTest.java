package EmpDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;


/**
 * Created by Administrator on 2014/12/23.
 */
public class SpringIocTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("app.xml");
        EmpService service= (EmpService)ctx.getBean("empService");
        System.out.println(service.getDempDao());
        System.out.println(service.getEmpDao());
        //
        //DataSource ds = (DataSource) ctx.getBean("ds");
        //Connection con =ds.getConnection();
        //System.out.println(con);
    }
}
