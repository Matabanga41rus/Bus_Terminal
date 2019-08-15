package services;

import dao.driver.DriverDaoImpl;
import dao.route.RouteDaoImpl;
import models.Driver;
import models.Route;

public class RouteService {
    private RouteDaoImpl dao = new RouteDaoImpl();

    public Route findRoute(int id) {
        return dao.findById(id);
    }

    public void saveRoute(Route route) {
        dao.save(route);
    }

    public void deleteRoute(Route route) {
        dao.delete(route);
    }

    public void updateRoute(Route route) {
        dao.update(route);
    }
}
