module com.example.mirari {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mirari to javafx.fxml;
    exports com.example.mirari;
}