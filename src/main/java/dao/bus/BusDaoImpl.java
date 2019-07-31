package dao.bus;

import dao.bus.BusDao;
import models.Bus;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class BusDaoImpl extends BusDao {
    public Bus findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Bus bus = session.get(Bus.class, id);
        session.close();
        return bus;
    }

}
