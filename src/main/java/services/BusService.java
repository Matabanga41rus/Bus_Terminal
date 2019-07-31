package services;

import dao.bus.BusDaoImpl;
import dao.driver.DriverDaoImpl;
import models.Bus;
import models.Driver;

public class BusService {
    private BusDaoImpl dao = new BusDaoImpl();

    public Bus findUser(int id) {
        return dao.findById(id);
    }

    public void saveUser(Bus bus) {
        dao.save(bus);
    }

    public void deleteUser(Bus bus) {
        dao.delete(bus);
    }

    public void updateUser(Bus bus) {
        dao.update(bus);
    }
}
