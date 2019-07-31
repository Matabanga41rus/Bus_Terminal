package dao.route;

import dao.BasicDao;
import models.Route;

public abstract class RouteDao extends BasicDao<Route> {
    public abstract Route findById(int id);

}
