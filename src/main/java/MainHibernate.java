import models.Bus;
import services.BusService;
import services.TownService;

public class MainHibernate {
    public static void main(String[] args) {
        BusService busService = new BusService();
        TownService townService = new TownService();

        Bus bus1 = new Bus("fghdfgh", "fghg");
       /* Town town = new Town("hahaha");

        busService.saveBus(bus1);
        townService.saveTown(town);

        Driver driver1 = new Driver("adffghdfggsdf");
        driver1.setBus(bus1);
        bus1.addDriver(driver1);

        Route route = new Route("12:30", "13:40");
        route.setBus(bus1);
        route.setTown(town);

        bus1.addRoute(route);
        town.addRoute(route);

        busService.updateBus(bus1);
        townService.updateTown(town);
*/
        busService.deleteBus(bus1);
    }
}
