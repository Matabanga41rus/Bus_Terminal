package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "bus")
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bus_id;

    @Column(name = "bus_name")
    private String bus_name;

    @Column(name = "gos_number")
    private String gos_number;

    @OneToMany(mappedBy = "bus", cascade = CascadeType.REFRESH)
    private List<Driver> drivers;

    @OneToMany(mappedBy = "bus", cascade = CascadeType.REFRESH)
    private List<Route> routes;

    public Bus(){

    }

    public Bus(String bus_name, String gos_number) {
        this.bus_name = bus_name;
        this.gos_number = gos_number;
        drivers = new ArrayList<Driver>();
        routes = new ArrayList<Route>();
    }

    public void addDriver(Driver driver){
        driver.setBus(this);
        drivers.add(driver);
    }

    public void removeDriver(Driver driver){
        drivers.remove(driver);
    }

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public String getGos_number() {
        return gos_number;
    }

    public void setGos_number(String gos_number) {
        this.gos_number = gos_number;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public void addRoute(Route route){
        route.setBus(this);
        routes.add(route);
    }

    public void removeRoute(Route route){
        routes.remove(route);
    }


}
