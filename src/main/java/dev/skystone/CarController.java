package dev.skystone;

import java.time.LocalDate;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CarController {

    @FXML
    private TableColumn<Car, Boolean> airConditioningCol;

    @FXML
    private TableColumn<Car, String> brandCol;

    @FXML
    private TableColumn<Car, String> fuelTypeCol;

    @FXML
    private TableView<Car> carTable;

    @FXML
    private TableColumn<Car, String> licensePlateCol;

    @FXML
    private TableColumn<Car, LocalDate> permitDateCol;

    @FXML
    private TableColumn<Car, Integer> priceCol;

    @FXML
    private TableColumn<Car, Integer> yearCol;

    @FXML
    void initialize() {
        List<Car> carList = FileHandler.readFile();
        licensePlateCol.setCellValueFactory(new PropertyValueFactory<>("licensePlate"));
        brandCol.setCellValueFactory(new PropertyValueFactory<>("brand"));
        yearCol.setCellValueFactory(new PropertyValueFactory<>("year"));
        fuelTypeCol.setCellValueFactory(new PropertyValueFactory<>("fuelType"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        airConditioningCol.setCellValueFactory(new PropertyValueFactory<>("airConditioning"));
        permitDateCol.setCellValueFactory(new PropertyValueFactory<>("permitDate"));
        carTable.getItems().addAll(carList);
    }

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

}
