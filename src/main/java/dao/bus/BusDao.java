package dao.bus;

import dao.BasicDao;
import models.Bus;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public abstract class BusDao extends BasicDao<Bus>{
    public abstract Bus findById(int id);

}
