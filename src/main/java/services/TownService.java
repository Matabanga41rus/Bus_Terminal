package services;

import dao.driver.DriverDaoImpl;
import dao.town.TownDaoImpl;
import models.Driver;
import models.Town;

public class TownService {
    private TownDaoImpl dao = new TownDaoImpl();

    public Town findUser(int id) {
        return dao.findById(id);
    }

    public void saveUser(Town town) {
        dao.save(town);
    }

    public void deleteUser(Town town) {
        dao.delete(town);
    }

    public void updateUser(Town town) {
        dao.update(town);
    }
}
