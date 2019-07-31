package dao.route;

import models.Route;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class RouteDaoImpl extends RouteDao {
    public Route findById(int id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Route route = session.get(Route.class, id);
        session.close();
        return route;
    }

}
