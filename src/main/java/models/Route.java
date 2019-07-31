package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int route_id;

    @Column(name = "time_in")
    private String time_in;

    @Column(name = "time_out")
    private String time_out;

    @OneToMany(mappedBy = "route", cascade = CascadeType.REFRESH)
    private List buses;

    @OneToMany(mappedBy = "route", cascade = CascadeType.REFRESH)
    private List towns;

    public Route(){

    }

    public Route(String time_in, String time_out) {
        this.time_in = time_in;
        this.time_out = time_out;
        buses = new ArrayList();
        towns = new ArrayList();
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public String getTime_in() {
        return time_in;
    }

    public void setTime_in(String time_in) {
        this.time_in = time_in;
    }

    public String getTime_out() {
        return time_out;
    }

    public void setTime_out(String time_out) {
        this.time_out = time_out;
    }

    public List getBuses() {
        return buses;
    }

    public void setBuses(List buses) {
        this.buses = buses;
    }

    public List getTowns() {
        return towns;
    }

    public void setTowns(List towns) {
        this.towns = towns;
    }
}
