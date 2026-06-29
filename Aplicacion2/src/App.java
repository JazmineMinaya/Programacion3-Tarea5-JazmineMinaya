import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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

        Label titulo = new Label("Sistema de Inventario");
        titulo.setStyle("-fx-font-size:14px; -fx-font-weight:bold;");
        
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

        Label labelEspecificacionesProducto = new Label("Especificaciones del Producto:");

        CheckBox cbProductoPerecedero = new CheckBox("Producto perecedero");
        CheckBox cbRequiereRefrigeracion = new CheckBox("Requiere refrigeración");
        CheckBox cbProductoImportado = new CheckBox("Producto importado");

        HBox contenedorEspecificacionesProducto = new HBox(10);
        contenedorEspecificacionesProducto.getChildren().addAll(cbProductoPerecedero, cbRequiereRefrigeracion, cbProductoImportado);

        Button botonGuardar = new Button("Guardar");
        Button botonEditar = new Button("Editar");
        Button botonEliminar = new Button("Eliminar");
        Button botonBuscar = new Button("Buscar");

        HBox contenedorBotones = new HBox(10);
        contenedorBotones.setAlignment(Pos.CENTER);
        contenedorBotones.getChildren().addAll(botonGuardar, botonEditar, botonEliminar, botonBuscar);

        formulario.add(labelCodigoProducto, 0, 0);
        formulario.add(codigo, 1, 0);

        formulario.add(labelNombreProducto, 0, 1);
        formulario.add(nombre, 1, 1);

        formulario.add(labelCategoria, 0, 2);
        formulario.add(categoria, 1, 2);

        formulario.add(labelPrecio, 0, 3);
        formulario.add(precio, 1, 3);

        formulario.add(labelCantidad, 0, 4);
        formulario.add(cantidad, 1, 4);

        formulario.add(labelProveedor, 0, 5);
        formulario.add(proveedor, 1, 5);

        formulario.add(labelEstado, 0, 6);
        formulario.add(estado, 1, 6);

        formulario.add(labelEspecificacionesProducto, 0, 7);
        formulario.add(contenedorEspecificacionesProducto, 1, 7);

        root.setPadding(new Insets(10));

        TableView tablaProducto = new TableView();

        TableColumn columnaCodigo = new TableColumn("Código");
        TableColumn columnaProducto = new TableColumn("Producto");
        TableColumn columnaCategoria = new TableColumn("Categoría");
        TableColumn columnaPrecio = new TableColumn("Precio");
        TableColumn columnaCantidad = new TableColumn("Cantidad");
        TableColumn columnaEstado = new TableColumn("Estado");

        tablaProducto.getColumns().add(columnaCodigo);
        tablaProducto.getColumns().add(columnaProducto);
        tablaProducto.getColumns().add(columnaCategoria);
        tablaProducto.getColumns().add(columnaPrecio);
        tablaProducto.getColumns().add(columnaCantidad);
        tablaProducto.getColumns().add(columnaEstado);

        tablaProducto.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY_ALL_COLUMNS);
        tablaProducto.setPrefHeight(180);

        root.getChildren().addAll(contenedorTitulo, formulario, tablaProducto, contenedorBotones);

        Scene scene = new Scene(root, 650, 580);

        primaryStage.setTitle("Sistema de Inventario");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}