module com.example.zipzip {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zipzip to javafx.fxml;
    exports com.example.zipzip;
}