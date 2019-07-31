import models.Bus;
import models.Driver;
import services.BusService;

public class MainHibernate {
    public static void main(String[] args) {
        BusService busService = new BusService();

        Bus bus1 = new Bus("Honda", "b432rg");
        Bus bus2 = new Bus("Isu", "a123rg");

        busService.saveUser(bus1);
        busService.saveUser(bus2);

        Driver driver1 = new Driver("kkkk gggg sssss");
        Driver driver2 = new Driver("bbbbb hhhh eeeee");

        driver1.setBus(bus1);
        driver2.setBus(bus2);

        bus1.addDriver(driver1);
        bus2.addDriver(driver2);

        busService.updateUser(bus1);
        busService.updateUser(bus2);
    }
}
