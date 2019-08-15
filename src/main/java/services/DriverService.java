package services;

import dao.driver.DriverDaoImpl;
import models.Driver;

public class DriverService {
    private DriverDaoImpl dao = new DriverDaoImpl();

    public Driver finDriver(int id) {
        return dao.findById(id);
    }

    public void saveDriver(Driver driver) {
        dao.save(driver);
    }

    public void deleteDriver(Driver driver) {
        dao.delete(driver);
    }

    public void updateDriver(Driver driver) {
        dao.update(driver);
    }
}
