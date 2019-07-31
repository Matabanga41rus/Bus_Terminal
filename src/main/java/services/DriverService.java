package services;

import dao.driver.DriverDaoImpl;
import models.Driver;

public class DriverService {
    private DriverDaoImpl dao = new DriverDaoImpl();

    public Driver findUser(int id) {
        return dao.findById(id);
    }

    public void saveUser(Driver driver) {
        dao.save(driver);
    }

    public void deleteUser(Driver driver) {
        dao.delete(driver);
    }

    public void updateUser(Driver driver) {
        dao.update(driver);
    }
}
