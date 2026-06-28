import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @ Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);

        TextField nombre = new TextField();
        nombre.setPromptText("Jazmine Minaya Peralta");
        nombre.setMaxWidth(375);

        TextField cedula = new TextField();
        cedula.setPromptText("001-1234567-8");
        cedula.setMaxWidth(375);

        TextField telefono = new TextField();
        telefono.setPromptText("809 000 0000");
        telefono.setMaxWidth(375);

        TextField motivoVisita = new TextField();
        motivoVisita.setPromptText("Escriba el motivo de su visita");
        motivoVisita.setMaxWidth(375);

        TextField personaVisitar = new TextField();
        personaVisitar.setPromptText("Melody Santos Acevedo");
        personaVisitar.setMaxWidth(375);

        TextField fecha = new TextField();
        fecha.setPromptText("DD/MM/AAAA");
        fecha.setMaxWidth(375);

        root.getChildren().add(nombre);
        root.getChildren().add(cedula);
        root.getChildren().add(telefono);
        root.getChildren().add(motivoVisita);
        root.getChildren().add(personaVisitar);
        root.getChildren().add(fecha);

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Registro de Visitantes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

