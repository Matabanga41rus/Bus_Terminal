package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "town")
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int town_id;

    @Column(name = "town_name")
    private String town_name;

    @OneToMany(mappedBy = "bus", cascade = CascadeType.REFRESH)
    private List<Route> routes;

    public Town(){}

    public Town(String town_name) {
        this.town_name = town_name;
        routes = new ArrayList<Route>();
    }

    public int getTown_id() {
        return town_id;
    }

    public void setTown_id(int town_id) {
        this.town_id = town_id;
    }

    public String getTown_name() {
        return town_name;
    }

    public void setTown_name(String town_name) {
        this.town_name = town_name;
    }

    public void addRoute(Route route){
        route.setTown(this);
        routes.add(route);
    }

    public void removeRoute(Route route){
        routes.remove(route);
    }
}
