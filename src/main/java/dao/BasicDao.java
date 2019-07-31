package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public abstract class BasicDao<E> {
    public void save(E e){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(e);
        tx1.commit();
        session.close();
    }

    public void update(E e){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(e);
        tx1.commit();
        session.close();
    }

    public void delete(E e){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(e);
        tx1.commit();
        session.close();
    }
}
