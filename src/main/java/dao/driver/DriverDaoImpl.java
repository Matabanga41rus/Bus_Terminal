package dao.driver;

import models.Driver;
import org.hibernate.Session;
import utils.HibernateSessionFactoryUtil;

public class DriverDaoImpl extends DriverDao {
    public Driver findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Driver driver = session.get(Driver.class, id);
        session.close();
        return driver;
    }
}
