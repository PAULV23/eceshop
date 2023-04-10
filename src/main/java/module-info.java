module com.example.eceshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eceshop to javafx.fxml;
    exports com.example.eceshop;
}