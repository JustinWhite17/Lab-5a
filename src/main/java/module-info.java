module com.mycompany.fxmlexample4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.fxmlexample4 to javafx.fxml;
    exports com.mycompany.fxmlexample4;
}
