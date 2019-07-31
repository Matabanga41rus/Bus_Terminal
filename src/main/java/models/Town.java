package models;

import javax.persistence.*;

@Entity
@Table (name = "town")
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int town_id;

    @Column(name = "town_name")
    private String town_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id")
    private Route route;

    public Town(){}

    public Town(String town_name) {
        this.town_name = town_name;
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

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
