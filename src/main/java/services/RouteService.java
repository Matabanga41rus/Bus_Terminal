package services;

import dao.driver.DriverDaoImpl;
import dao.route.RouteDaoImpl;
import models.Driver;
import models.Route;

public class RouteService {
    private RouteDaoImpl dao = new RouteDaoImpl();

    public Route findUser(int id) {
        return dao.findById(id);
    }

    public void saveUser(Route route) {
        dao.save(route);
    }

    public void deleteUser(Route route) {
        dao.delete(route);
    }

    public void updateUser(Route route) {
        dao.update(route);
    }
}
