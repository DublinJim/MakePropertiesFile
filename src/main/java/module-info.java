module com.example.makepropertiesfile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.makepropertiesfile to javafx.fxml;
    exports com.example.makepropertiesfile;
}