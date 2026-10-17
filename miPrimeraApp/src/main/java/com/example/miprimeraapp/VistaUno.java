package com.example.miprimeraapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaUno extends Application {
    @Override
    public void start(Stage stage) {

        Alert informacion = new Alert(Alert.AlertType.INFORMATION);


        Label lblTitulo = new Label("Registro de usuario");

        Button btnGuardar =  new Button("Guardar");

        TextArea txtaDireccion = new TextArea();

        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese su nombre");

        CheckBox chbCasado = new CheckBox("Casado");

        ToggleGroup tgCasado = new ToggleGroup();
        RadioButton rdbCasadoSi = new RadioButton("Si");
        RadioButton rdbCasadoNo = new RadioButton("No");

        rdbCasadoSi.setToggleGroup(tgCasado);
        rdbCasadoNo.setToggleGroup(tgCasado);

        rdbCasadoSi.setSelected(true);

        DatePicker dpDate = new DatePicker();

        ComboBox cbxColores = new ComboBox();
        cbxColores.getItems().addAll("Rojo","Azul", "Blanco");

        cbxColores.getSelectionModel().selectFirst();


        MenuItem miUno = new MenuItem("Uno");
        MenuItem miDos = new MenuItem("Dos");

        Menu menu = new Menu("Archivo");
        menu.getItems().addAll(miUno, miDos);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);


        btnGuardar.setOnAction(e -> {
            if(txtNombre.getText().isBlank() == true){
                informacion.setTitle("INFORMACION");
                informacion.setHeaderText("Validacion de formulario");
                informacion.setContentText("El nombre no puede estar vacio");
                informacion.showAndWait();
            }
        });

        //filas
        //HBox fila = new HBox(10,lblTitulo,btnGuardar);

        //Columnas
        VBox columna =  new VBox(10,lblTitulo,btnGuardar,txtaDireccion,txtNombre,chbCasado,rdbCasadoSi,rdbCasadoNo,dpDate,cbxColores);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setCenter(columna);



        Scene  scene = new Scene(layout,800,600);
        stage.setScene(scene);
        stage.show();
    }
}
