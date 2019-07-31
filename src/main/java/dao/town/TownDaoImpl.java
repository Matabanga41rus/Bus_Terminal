package dao.town;

import models.Town;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class TownDaoImpl extends TownDao {
    public Town findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Town town = session.get(Town.class, id);
        session.close();
        return town;
    }
}
