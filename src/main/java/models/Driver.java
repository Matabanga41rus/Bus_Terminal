package models;

import javax.persistence.*;

@Entity
@Table(name = "bus")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driver_id;

    @Column(name = "driver_fio")
    private String driver_fio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id")
    private Route route;

    public Driver(){

    }

    public Driver(String driver_fio) {
        this.driver_fio = driver_fio;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_fio() {
        return driver_fio;
    }

    public void setDriver_fio(String driver_fio) {
        this.driver_fio = driver_fio;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
