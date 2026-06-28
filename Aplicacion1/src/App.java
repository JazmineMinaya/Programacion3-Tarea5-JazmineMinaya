import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @ Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);

        GridPane formulario = new GridPane();
        formulario.setPadding(new Insets(15));
        formulario.setHgap(10);
        formulario.setVgap(10);

        Label titulo = new Label("Registro de Visitantes");
        titulo.setStyle("-fx-font-size:14px; -fx-fonx-weight:bold;");
        
        HBox contenedorTitulo = new HBox();
        contenedorTitulo.setAlignment(Pos.CENTER);
        contenedorTitulo.getChildren().add(titulo);

        Label labelNombre = new Label("Nombre:");
        TextField nombre = new TextField();
        nombre.setPromptText("Jazmine Minaya Peralta");

        Label labelCedula = new Label("Cédula:");
        TextField cedula = new TextField();
        cedula.setPromptText("001-1234567-8");

        Label labelTelefono = new Label("Teléfono:");
        TextField telefono = new TextField();
        telefono.setPromptText("809 000 0000");

        Label labelMotivoVisita = new Label("Motivo de la Visita:");
        TextField motivoVisita = new TextField();
        motivoVisita.setPromptText("Escriba el motivo de su visita");

        Label labelPersonaVisitar = new Label("Persona a Visitar:");
        TextField personaVisitar = new TextField();
        personaVisitar.setPromptText("Melody Santos Acevedo");

        Label labelFecha = new Label("Fecha:");
        TextField fecha = new TextField();
        fecha.setPromptText("DD/MM/AAAA");

        ComboBox<String> tipoVisita = new ComboBox<>();
        
        Label labelTipoVisitante = new Label("Tipo de Visitante:");
        tipoVisita.setPromptText("Seleccione el tipo de visitante");

        tipoVisita.getItems().add("Estudiante");
        tipoVisita.getItems().add("Padre / Madre");
        tipoVisita.getItems().add("Suplidor");
        tipoVisita.getItems().add("Invitado");

        Label labelDocumento = new Label("Documento entregado:");
        ToggleGroup documentos = new ToggleGroup();

        RadioButton radioButtonCedula = new RadioButton("Cédula");
        RadioButton radioButtonPasaporte = new RadioButton("Pasaporte");
        RadioButton radioButtonCarnet = new RadioButton("Carnet");

        radioButtonCedula.setToggleGroup(documentos);
        radioButtonPasaporte.setToggleGroup(documentos);
        radioButtonCarnet.setToggleGroup(documentos);

        HBox contenedorDocumentos = new HBox(10);
        contenedorDocumentos.getChildren().addAll(radioButtonCedula, radioButtonPasaporte, radioButtonCarnet);

        Button botonGuardar = new Button("Registrar");
        Button botonLimpiar = new Button("Limpiar");
        Button botonCancelar = new Button("Cancelar");

        HBox contenedorBotones = new HBox(10);
        contenedorBotones.setAlignment(Pos.CENTER);
        contenedorBotones.getChildren().addAll(botonGuardar, botonLimpiar, botonCancelar);

        formulario.add(labelNombre, 0, 0);
        formulario.add(nombre, 1, 0);

        formulario.add(labelCedula, 0, 1);
        formulario.add(cedula, 1, 1);

        formulario.add(labelTelefono, 0, 2);
        formulario.add(telefono, 1, 2);

        formulario.add(labelMotivoVisita, 0, 3);
        formulario.add(motivoVisita, 1, 3);

        formulario.add(labelPersonaVisitar, 0, 4);
        formulario.add(personaVisitar, 1, 4);

        formulario.add(labelFecha, 0, 5);
        formulario.add(fecha, 1, 5);

        formulario.add(labelTipoVisitante, 0, 6);
        formulario.add(tipoVisita, 1, 6);

        formulario.add(labelDocumento, 0, 7);
        formulario.add(contenedorDocumentos, 1, 7);

        formulario.add(contenedorBotones, 0, 8, 2, 1);

        root.setPadding(new Insets(10));

        TableView tablaVisitantes = new TableView();

        TableColumn columnaNombre = new TableColumn("Nombre");
        TableColumn columnaCedula = new TableColumn("Cédula");
        TableColumn columnaTelefono = new TableColumn("Teléfono");

        tablaVisitantes.getColumns().add(columnaNombre);
        tablaVisitantes.getColumns().add(columnaCedula);
        tablaVisitantes.getColumns().add(columnaTelefono);

        tablaVisitantes.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_ALL_COLUMNS);
        tablaVisitantes.setPrefHeight(180);

        root.getChildren().addAll(contenedorTitulo, formulario, tablaVisitantes);

        Scene scene = new Scene(root, 400, 550);

        primaryStage.setTitle("Registro de Visitantes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}