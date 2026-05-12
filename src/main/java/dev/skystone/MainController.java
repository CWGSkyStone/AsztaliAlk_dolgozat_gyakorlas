package dev.skystone;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickCarButton(ActionEvent event) {
        App.setRoot("carScene");
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        System.exit(0);
    }

}
