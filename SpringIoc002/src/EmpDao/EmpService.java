package EmpDao;

/**
 * Created by Administrator on 2014/12/23.
 */
public class EmpService {
    private EmpDao empDao;
    private DempDao dempDao;

    public DempDao getDempDao() {
        return dempDao;
    }

    public void setDempDao(DempDao dempDao) {
        this.dempDao = dempDao;
    }

    public EmpDao getEmpDao() {

        return empDao;
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }
}
