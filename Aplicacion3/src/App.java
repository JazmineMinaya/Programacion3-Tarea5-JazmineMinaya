import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @ Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);

        Label titulo = new Label("Perfil de Estudiante");
        titulo.setStyle("-fx-font-size:14px; -fx-fonx-weight:bold;");

        HBox contenedorTitulo = new HBox();
        contenedorTitulo.setAlignment(Pos.CENTER);
        contenedorTitulo.getChildren().add(titulo);

        Label labelMatricula = new Label("Matrícula:");
        TextField matricula = new TextField();
        matricula.setPromptText("1000-2020");

        Label labelNombre = new Label("Nombre:");
        TextField nombre = new TextField();
        nombre.setPromptText("Jazmine Minaya Peralta");

        Label labelCarrera = new Label("Carrera:");
        TextField carrera = new TextField();
        carrera.setPromptText("Ingeniería en Sistemas");

        Label labelCorreo = new Label("Correo:");
        TextField correo = new TextField();
        correo.setPromptText("jazmine_minaya@ucne.edu.do");

        Label labelTelefono = new Label("Teléfono:");
        TextField telefono = new TextField();
        telefono.setPromptText("809 588 0000");

        Label labelDireccion = new Label("Dirección:");
        TextField direccion = new TextField();
        direccion.setPromptText("Urbanización Caperuza, Calle 3 #15, San Francisco de Macorís");

        ComboBox<String> semestre = new ComboBox<>();

        Label labelSemestre = new Label("Semestre:");
        semestre.setPromptText("Seleccione el semestre");

        semestre.getItems().addAll("1er semestre", "2do semestre", "3er semestre", "4to semestre", "5to semestre", "6to semestre", "7mo semestre", "8vo semestre", 
                                    "9no semestre", "10mo semestre", "11vo semestre", "12vo semestre");

        Button botonGuardar = new Button("Guardar");
        Button botonActualizar = new Button("Actualizar");
        Button botonImprimir = new Button("Imprimir");

        HBox contenedorBotones = new HBox(10);
        contenedorBotones.setAlignment(Pos.CENTER);
        contenedorBotones.getChildren().addAll(botonGuardar, botonActualizar, botonImprimir);
    }
}
