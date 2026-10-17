module com.example.miprimeraapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.miprimeraapp to javafx.fxml;
    exports com.example.miprimeraapp;
}