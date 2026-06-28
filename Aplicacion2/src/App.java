import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ComboBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @ Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);

        Label titulo = new Label("Sistema de Inventario");
        titulo.setStyle("-fx-font-size:14px; -fx-fonx-weight:bold;");
        
        HBox contenedorTitulo = new HBox();
        contenedorTitulo.setAlignment(Pos.CENTER);
        contenedorTitulo.getChildren().add(titulo);

        Label labelCodigoProducto = new Label("Código:");
        TextField codigo = new TextField();
        codigo.setPromptText("00001");

        Label labelNombreProducto = new Label("Nombre:");
        TextField nombre = new TextField();
        nombre.setPromptText("Van Gogh Pasteles al Óleo");

        Label labelCategoria = new Label("Categoría:");
        TextField categoria = new TextField();
        categoria.setPromptText("Pintura");

        Label labelPrecio = new Label("Precio:");
        TextField precio = new TextField();
        precio.setPromptText("2499.99");

        Label labelCantidad = new Label("Cantidad:");
        TextField cantidad = new TextField();
        cantidad.setPromptText("7");

        Label labelProveedor = new Label("Proveedor:");
        TextField proveedor = new TextField();
        proveedor.setPromptText("Royal Talens");

        ComboBox<String> estado = new ComboBox<>();

        Label labelEstado = new Label("Estado:");
        estado.setPromptText("Seleccione el estado");

        estado.getItems().add("Disponible");
        estado.getItems().add("Agotado");
        estado.getItems().add("Bajo inventario");

        Label labelProducto = new Label("Especificaciones del Producto:");
        ToggleGroup especificacionProducto = new ToggleGroup();

        RadioButton rbProductoPerecedero = new RadioButton("Producto perecedero");
        RadioButton rbProductoRefrigeracion = new RadioButton("Requiere refrigeración");
        RadioButton rbProductoImportado = new RadioButton("Producto importado");

        rbProductoPerecedero.setToggleGroup(especificacionProducto);
        rbProductoRefrigeracion.setToggleGroup(especificacionProducto);
        rbProductoImportado.setToggleGroup(especificacionProducto);

        HBox contenedorEspecificacionProducto = new HBox(10);
        contenedorEspecificacionProducto.getChildren().addAll(rbProductoPerecedero, rbProductoRefrigeracion, rbProductoImportado);

        Button botonGuardar = new Button("Guardar");
        Button botonEditar = new Button("Editar");
        Button botonEliminar = new Button("Eliminar");
        Button botonBuscar = new Button("Buscar");

        HBox contenedorBotones = new HBox(10);
        contenedorBotones.setAlignment(Pos.CENTER);
        contenedorBotones.getChildren().addAll(botonGuardar, botonEditar, botonEliminar, botonBuscar);

        Scene scene = new Scene(root, 400, 550);

        primaryStage.setTitle("Sistema de Inventario");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}