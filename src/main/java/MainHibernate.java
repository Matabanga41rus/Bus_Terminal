import models.Bus;
import models.Driver;
import models.Route;
import models.Town;
import services.BusService;
import services.DriverService;
import services.RouteService;
import services.TownService;

public class MainHibernate {
    public static void main(String[] args) {
        BusService busService = new BusService();
        TownService townService = new TownService();
        DriverService driverService = new DriverService();
        RouteService routeService = new RouteService();

        Bus bus1 = new Bus("sdfasdfa", "SDFASDF");
        Town town1 = new Town("adsfs");
        Driver driver1 = new Driver("adfgsdf");
        Route route1 = new Route("12:30", "12:50");

        driver1.setBus(bus1);
        bus1.addDriver(driver1);

        route1.setTown(town1);
        route1.setBus(bus1);

        bus1.addRoute(route1);
        town1.addRoute(route1);

        busService.saveBus(bus1);
        townService.saveTown(town1);

        busService.updateBus(bus1);
        townService.updateTown(town1);
        routeService.updateRoute(route1);
        driverService.updateDriver(driver1);
    }
}
