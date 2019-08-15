package services;

import dao.bus.BusDaoImpl;
import dao.driver.DriverDaoImpl;
import models.Bus;
import models.Driver;

public class BusService {
    private BusDaoImpl dao;

    public BusService(){
        dao = new BusDaoImpl();
    }

    public Bus findBus(int id) {
        return dao.findById(id);
    }

    public void saveBus(Bus bus) {
        dao.save(bus);
    }

    public void deleteBus(Bus bus) {
        dao.delete(bus);
    }

    public void updateBus(Bus bus) {
        dao.update(bus);
    }
}
