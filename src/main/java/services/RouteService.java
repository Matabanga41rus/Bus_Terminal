package services;

import dao.route.RouteDaoImpl;
import models.Route;

import java.util.List;

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

    public List<Route> findAllRoute(){
        return dao.findAll("route");
    }

}
