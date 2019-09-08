package services;

import dao.town.TownDaoImpl;
import models.Town;

import java.util.List;

public class TownService {
    private TownDaoImpl dao = new TownDaoImpl();

    public Town findTown(int id) {
        return dao.findById(id);
    }

    public void saveTown(Town town) {
        dao.save(town);
    }

    public void deleteTown(Town town) {
        dao.delete(town);
    }

    public void updateTown(Town town) {
        dao.update(town);
    }

    public List<Town> findAllTown(){
        return dao.findAll("town");
    }
}
