package dao.bus;

import dao.BasicDao;
import models.Bus;

public abstract class BusDao extends BasicDao<Bus> {
    public abstract Bus findById(int id);

}
