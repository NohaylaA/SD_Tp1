package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier
{
    @Autowired
    private IDao dao=null;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul()
    {
        double tmp=dao.getData();
        return tmp*540/Math.cos(tmp*Math.PI);
    }
    public void setDao(IDao dao)
    {
        this.dao = dao;
    }
}
