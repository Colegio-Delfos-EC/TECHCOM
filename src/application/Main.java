package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override 
    public void start(Stage primaryStage) throws Exception {
        try {
            /*
            * Configuracion De ventana
            * */
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            primaryStage.getIcons().add(icono);
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu_principal.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 800, 600);
            scene.getStylesheets().add(getClass().getResource("resources/interfaz_principal.css").toExternalForm());
            primaryStage.setMaximized(true);
            primaryStage.setTitle("TECHCON");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            // ALERTA`
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Error en la Aplicación");
            errorAlert.setHeaderText("Error en la ejecución");
            errorAlert.setContentText("error: " + e); 
            
            Stage errores = (Stage) errorAlert.getDialogPane().getScene().getWindow();
            errores.getIcons().add(new Image(getClass().getResourceAsStream("resources/error_icon.png")));
            errorAlert.showAndWait(); 
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
