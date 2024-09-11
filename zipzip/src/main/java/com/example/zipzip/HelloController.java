package com.example.zipzip;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Label text;

    @FXML
    void exit(ActionEvent event) {
        text.setText("не выйдешь");
    }

    @FXML
    void hah(ActionEvent event) {
        text.setText("ахахаха 2+2=4");
    }

}
