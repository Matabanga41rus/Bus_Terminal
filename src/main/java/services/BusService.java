package services;

import dao.bus.BusDaoImpl;
import models.Bus;

import java.util.List;

public class BusService {
    private BusDaoImpl dao;

    public BusService(){
        dao = new BusDaoImpl();
    }

    public Bus findBus(int id) {
        return dao.findById(id);
    }

    public void saveBus(Bus bus) {
        dao.save(bus);
    }

    public void deleteBus(Bus bus) {
        dao.delete(bus);
    }

    public void updateBus(Bus bus) {
        dao.update(bus);
    }

    public List<Bus> findAllBus(){
        return dao.findAll("bus");
    }
}
