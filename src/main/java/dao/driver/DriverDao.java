package dao.driver;

import dao.BasicDao;
import models.Driver;

public abstract class DriverDao extends BasicDao<Driver> {
    public abstract Driver findById(int id);

}
