module org.example.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;

    opens org.example.proyectojavafx to javafx.fxml, com.google.gson;
    exports org.example.proyectojavafx;
}