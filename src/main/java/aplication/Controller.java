package aplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import models.Bus;
import models.Driver;
import models.Route;
import models.Town;
import services.BusService;
import services.DriverService;
import services.RouteService;
import services.TownService;

public class Controller {
    @FXML
    private TabPane mainTabPane;



    private ObservableList<Bus> listBus;
    private BusService busService = new BusService();

    @FXML
    private Tab Buses;
    @FXML
    private TableView<Bus> busTable;
    @FXML
    private TableColumn<Bus, Integer> busIdCol;
    @FXML
    private TableColumn<Bus, String> busNameCol;
    @FXML
    private TableColumn<Bus, String> gosNumberCol;

    @FXML
    private TextField busNameField;
    @FXML
    private TextField gosNumberField;
    @FXML
    private Button addBusButton;




    private ObservableList<Driver> listDriver;
    private DriverService driverService = new DriverService();

    @FXML
    private Tab Drivers;
    @FXML
    private TableView<Driver> driverTable;
    @FXML
    private TableColumn<Driver, Integer> driverIdCol;
    @FXML
    private TableColumn<Driver, String> driverNameCol;
    @FXML
    private TableColumn<Driver, Integer> driverBusIdCol;

    @FXML
    private TextField driverNameField;
    @FXML
    private TextField driverBusIdField;
    @FXML
    private Button addDriverButton;




    private ObservableList<Town> listTown;
    private TownService townService = new TownService();

    @FXML
    private Tab Towns;
    @FXML
    private TableView<Town> townTable;
    @FXML
    private TableColumn<Town, Integer> town_idCol;
    @FXML
    private TableColumn<Town, String> townNameCol;

    @FXML
    private TextField townNameField;
    @FXML
    private Button addTownButton;




    private ObservableList<Route> listRoute;
    private RouteService routeService = new RouteService();

    @FXML
    private Tab Routes;
    @FXML
    private TableView<Route> routeTable;
    @FXML
    private TableColumn<Route, Integer> routeIdCol;
    @FXML
    private TableColumn<Route, String> timeInCol;
    @FXML
    private TableColumn<Route, String> timeOutCol;
    @FXML
    private TableColumn<Route, Integer> routeBusIdCol;
    @FXML
    private TableColumn<Route, Integer> routeTownIdCol;

    @FXML
    private TextField timeInField;
    @FXML
    private TextField timeOutField;
    @FXML
    private TextField routeBusIdField;
    @FXML
    private TextField routeTownIdField;
    @FXML
    private Button addRouteButton;

    @FXML
    public void initialize(){

        // ЗАЕБАЛО НАХУЙ БЕСИТ БЛЯТЬ

        listBus = getListBus();
        listDriver = getListDriver();
        listTown = getListTown();
        listRoute = getListRoute();

        busTable.setItems(listBus);
        driverTable.setItems(listDriver);
        townTable.setItems(listTown);
        routeTable.setItems(listRoute);


        addBusButton.setOnAction(event -> {
            if( busNameField.getText().length() > 0 && gosNumberField.getText().length() > 0){
                Bus bus = new Bus(busNameField.getText(), gosNumberCol.getText());
                busService.updateBus(bus);

                listBus.add(bus);
            }
        });


        addDriverButton.setOnAction(event -> {

        });


        addTownButton.setOnAction(event -> {

        });


        addRouteButton.setOnAction(event -> {

        });


    }







    public ObservableList<Bus> getListBus() {
        return FXCollections.observableArrayList(busService.findAllBus());
    }

    public ObservableList<Driver> getListDriver() {
        return FXCollections.observableArrayList(driverService.findAllDriver());
    }

    public ObservableList<Town> getListTown() {
        return FXCollections.observableArrayList(townService.findAllTown());
    }

    public ObservableList<Route> getListRoute() {
        return FXCollections.observableArrayList(routeService.findAllRoute());
    }


}
