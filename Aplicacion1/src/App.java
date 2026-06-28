import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @ Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);

        Label labelNombre = new Label("Nombre:");
        TextField nombre = new TextField();
        nombre.setPromptText("Jazmine Minaya Peralta");
        nombre.setMaxWidth(375);

        Label labelCedula = new Label("Cédula:");
        TextField cedula = new TextField();
        cedula.setPromptText("001-1234567-8");
        cedula.setMaxWidth(375);

        Label labelTelefono = new Label("Teléfono:");
        TextField telefono = new TextField();
        telefono.setPromptText("809 000 0000");
        telefono.setMaxWidth(375);

        Label labelMotivoVisita = new Label("Motivo de la Visita:");
        TextField motivoVisita = new TextField();
        motivoVisita.setPromptText("Escriba el motivo de su visita");
        motivoVisita.setMaxWidth(375);

        Label labelPersonaVisitar = new Label("Persona a Visitar:");
        TextField personaVisitar = new TextField();
        personaVisitar.setPromptText("Melody Santos Acevedo");
        personaVisitar.setMaxWidth(375);

        Label labelFecha = new Label("Fecha:");
        TextField fecha = new TextField();
        fecha.setPromptText("DD/MM/AAAA");
        fecha.setMaxWidth(375);

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

        root.getChildren().addAll(labelNombre, nombre);
        root.getChildren().addAll(labelCedula, cedula);
        root.getChildren().addAll(labelTelefono, telefono);
        root.getChildren().addAll(labelMotivoVisita, motivoVisita);
        root.getChildren().addAll(labelPersonaVisitar, personaVisitar);
        root.getChildren().addAll(labelFecha, fecha);
        root.getChildren().addAll(labelTipoVisitante, tipoVisita);
        root.getChildren().addAll(labelDocumento, radioButtonCedula, radioButtonPasaporte, radioButtonCarnet);

        Scene scene = new Scene(root, 400, 600);

        primaryStage.setTitle("Registro de Visitantes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

