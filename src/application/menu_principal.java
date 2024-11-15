package application;

import javafx.animation.Animation.Status;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.util.Duration;
import utils.Utils;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class menu_principal {
    @FXML
    private WebView webView;
    @FXML
    private WebEngine webEngine;
    @FXML
    private ButtonBar contenedor;

    @FXML
    private VBox contenedor_vertical,Contenedor_vertical_dos,Contenedor_vertical_tres;

    @FXML
    private HBox contenedor_horizontal,Contenedor_horizontal_dos,Contenedor_horizontal_tres;

    @FXML
    private ImageView Techcom;
    
    @SuppressWarnings("unused")
    private ScaleTransition animacionTechcom;
	private ScaleTransition animacion_dos,animacion_uno,animacion_tres,animacion_cuatro,animacion_cinco,animacion_seis;
    private ScaleTransition animacion_click1,animacion_click2,animacion_click3,animacion_click4,animacion_click5;
    @FXML 
    private Button creditos;
    /*@FXML
    private Button salir;*/
    @FXML
    private Button exit;
    @FXML 
    private Button jugar;

    @FXML
    private Button deepfake;

    @FXML
    private Button clonacion_de_voz;
    @FXML
    private Button juegoButton,video_dos;
    @FXML 
    private Button video_uno;
    @FXML
    private Text puntos;
    @FXML
    private Hyperlink proyecto,proyectodos;
    private boolean juego_iniciado;
    private boolean inicia_ventana;
    @FXML
    public void initialize() {
    	 webEngine = webView.getEngine();
    	 cargar_video("https://www.youtube.com/embed/MxD7hDUjS_8");
    	    inicializarAnimacion();
    	    inicializarAnimacion_boton_video1();
    	    inicializarAnimacion_boton_video2();
    	    inicializarAnimacion_boton_deepfake();
    	    inicializarAnimacion_boton_creditos();
    	    inicializarAnimacion_boton_clonacion_de_voz();
    	    inicializarAnimacion_click_video1();
    	    inicializarAnimacion_click_video2();
    	    //inicializarAnimacion_click_jugar();
    	    //inicializarAnimacion_click_salir();
    	    //int puntosIniciales = 0;
            //puntos.setText("Puntos: " + puntosIniciales);
    }
    
    
    private void inicializarAnimacion_boton_video1() {
        
        animacion_uno = new ScaleTransition(Duration.millis(150), video_uno);
        animacion_uno.setByX(0.15);  
        animacion_uno.setByY(0.10);  
        animacion_uno.setAutoReverse(true);
        animacion_uno.setCycleCount(2);
    }
    void animacion_soft_boton1(ScaleTransition animacion_uno) {
        if (animacion_uno.getStatus() != Status.RUNNING) {
            animacion_uno.playFromStart(); 
        }
    }
    void animacion_soft_clonacion_de_voz(ScaleTransition animacion_uno) {
        if (animacion_seis.getStatus() != Status.RUNNING) {
            animacion_seis.playFromStart();
        }
    }
    
 private void inicializarAnimacion_boton_video2() {
        
        animacion_dos = new ScaleTransition(Duration.millis(150), video_dos);
        animacion_dos.setByX(0.15);  
        animacion_dos.setByY(0.10);  
        animacion_dos.setAutoReverse(true);
        animacion_dos.setCycleCount(2);
    }

 void animacion_soft_boton2(ScaleTransition animacion_dos) {
     if (animacion_dos.getStatus() != Status.RUNNING) {
     	animacion_dos.playFromStart(); 
     }
 }


    
private void inicializarAnimacion_boton_deepfake() {
        
	animacion_tres = new ScaleTransition(Duration.millis(150), deepfake);
	animacion_tres.setByX(0.02);
	animacion_tres.setByY(0.02);
	animacion_tres.setAutoReverse(true);
	animacion_tres.setCycleCount(2);
    }
    private void inicializarAnimacion_boton_clonacion_de_voz() {

        animacion_seis = new ScaleTransition(Duration.millis(150), clonacion_de_voz);
        animacion_seis.setByX(0.02);
        animacion_seis.setByY(0.02);
        animacion_seis.setAutoReverse(true);
        animacion_seis.setCycleCount(2);
    }
    
    void animacion_soft_jugar(ScaleTransition animacion_tres) {
        if (animacion_tres.getStatus() != Status.RUNNING) {
            animacion_tres.playFromStart(); 
        }}
    
    private void inicializarAnimacion_boton_creditos() {
        
    	animacion_cuatro = new ScaleTransition(Duration.millis(150), creditos);
    	animacion_cuatro.setByX(0.02);
    	animacion_cuatro.setByY(0.02);
    	animacion_cuatro.setAutoReverse(true);
    	animacion_cuatro.setCycleCount(2);
        }
        
    void animacion_soft_creditos(ScaleTransition animacion_cuatro) {
        if (animacion_cuatro.getStatus() != Status.RUNNING) {
        	animacion_cuatro.playFromStart(); 
        }}
        
        /*private void inicializarAnimacion_boton_salir() {

        	animacion_cinco = new ScaleTransition(Duration.millis(150), salir);
        	animacion_cinco.setByX(0.15);
        	animacion_cinco.setByY(0.10);
        	animacion_cinco.setAutoReverse(true);
        	animacion_cinco.setCycleCount(2);
            }*/
            
       /*
       *void animacion_soft_salir(ScaleTransition animacion_cinco) {
            if (animacion_cinco.getStatus() != Status.RUNNING) {
            	animacion_cinco.playFromStart();
            }}
            *  */
        
        private void inicializarAnimacion_click_video1() {
            
        	animacion_click1 = new ScaleTransition(Duration.millis(150), video_uno);
        	animacion_click1.setByX(0.15);  
        	animacion_click1.setByY(0.10);  
        	animacion_click1.setAutoReverse(true);
        	animacion_click1.setCycleCount(2);
            }
            
            void animacion_click_boton1(ScaleTransition animacion_click1) {
                if (animacion_click1.getStatus() != Status.RUNNING) {
                	animacion_click1.playFromStart(); 
                }}
    
 private void inicializarAnimacion_click_video2() {
        
	 animacion_click2 = new ScaleTransition(Duration.millis(200), video_dos);
	 animacion_click2.setByX(0.20);  
	 animacion_click2.setByY(0.20);  
	 animacion_click2.setAutoReverse(true);
	 animacion_click2.setCycleCount(2);
    }
 void animacion_click_boton2(ScaleTransition animacion_click2) {
     if (animacion_click2.getStatus() != Status.RUNNING) {
    	 animacion_click2.playFromStart(); 
     }}
    
 private void inicializarAnimacion_click_jugar() {
     
	 animacion_click3 = new ScaleTransition(Duration.millis(200), jugar);
	 animacion_click3.setByX(0.20);  
	 animacion_click3.setByY(0.20);  
	 animacion_click3.setAutoReverse(true);
	 animacion_click3.setCycleCount(2);
    }
 void animacion_click_boton3(ScaleTransition animacion_click3) {
     if (animacion_click3.getStatus() != Status.RUNNING) {
    	 animacion_click3.playFromStart(); 
     }}
// falta el click de los creditos y el valor de salir a 5 (4 pertenece a creditos)
 
/*
*private void inicializarAnimacion_click_salir() {

	 animacion_click4 = new ScaleTransition(Duration.millis(200), salir);
	 animacion_click4.setByX(0.20);
	 animacion_click4.setByY(0.20);
	 animacion_click4.setAutoReverse(true);
	 animacion_click4.setCycleCount(2);
    } */
 void animacion_click_boton4(ScaleTransition animacion_click4) {
     if (animacion_click4.getStatus() != Status.RUNNING) {
    	 animacion_click4.playFromStart(); 
     }}
    
    @FXML
    void  softcursor1() {
    	animacion_soft_boton1(animacion_uno);
    }
    
    @FXML
    void softcursor2() {
    	animacion_soft_boton2(animacion_dos);
    }
    
    @FXML
    void softcursor3() {
    	animacion_soft_jugar(animacion_tres);
    }
    
    @FXML
    void softcursor4() {
    	animacion_soft_creditos(animacion_cuatro);
    }

    @FXML
    void softcursor6() {
        animacion_soft_clonacion_de_voz(animacion_seis);
    }
    
    /*     @FXML
    void softcursor5() {
    	animacion_soft_salir(animacion_cinco);
    }*/
    
    @FXML
    void set_video1() {
    	animacion_click_boton1(animacion_click1);

    	cargar_video("https://www.youtube.com/embed/MxD7hDUjS_8");
    }
    
    @FXML
    void set_video2() {
    	animacion_click_boton2(animacion_click2);
    	cargar_video("https://www.youtube.com/embed/7kcF9v4oo7M");
    }
    
    @FXML
    private void iniciarJuego() {
    	animacion_click_boton3(animacion_click3);
    	try { Utils.juego_laberinto(); puntos(); /*Stage stage = (Stage) salir.getScene().getWindow();  stage.show();*/ }
    	catch(Exception e) { alerta_de_error(e);  }
    }
    
    //imagen
    private void inicializarAnimacion() {
        
        animacionTechcom = new ScaleTransition(Duration.millis(150), Techcom);
        animacionTechcom.setByX(0.03);
        animacionTechcom.setByY(0.03);
        animacionTechcom.setAutoReverse(true);
        animacionTechcom.setCycleCount(2);
    }
    
    void animacion_image(ScaleTransition animacion) {
        if (animacion.getStatus() != Status.RUNNING) {
            animacion.playFromStart(); 
        }
    }
    
    @FXML
    void softimage1() {
        animacion_image(animacionTechcom);
    }

    @FXML
    void proyecto_web(ActionEvent event) throws URISyntaxException,IOException{
    	Desktop.getDesktop().browse(new URI("https://colab.research.google.com/drive/1dygH6NjFvrz2Slhufk2ilNR_kD5C48as"));
    }
    
    @FXML
    void proyecto_web_2(ActionEvent event)throws URISyntaxException,IOException {
    	Desktop.getDesktop().browse(new URI("https://elevenlabs.io/"));
    }
    
    public void cargar_video(String url) {
    	webEngine.load(url);
    	
    }
        
    public boolean getinicia_ventana() {
    	return inicia_ventana;
    }    
    
    public void alerta_de_error(Exception e) {
		Alert errorAlert = new Alert(AlertType.ERROR);
	    errorAlert.setTitle("Error en la Aplicación");
	    errorAlert.setHeaderText("Error en la ejecución");
	    errorAlert.setContentText("error: "+e); 
	    Stage errores = (Stage) errorAlert.getDialogPane().getScene().getWindow();
	    errores.getIcons().add(new Image(getClass().getResourceAsStream("resources/error_icon.png")));
	    errorAlert.showAndWait(); 
    }

    @FXML
    private void ventana_deepfake() {
        try {
            animacion_image(animacionTechcom);
            Stage stage = (Stage) deepfake.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("deepfake.fxml"));
            Stage preguntas = new Stage();
            preguntas.setTitle("Deepfake");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            preguntas.getIcons().add(icono);
            Scene Deepfake = new Scene(root,800,600);
            preguntas.setMaximized(true);
            preguntas.setScene(Deepfake);
            Deepfake.getStylesheets().add(getClass().getResource("resources/menu_principal.css").toExternalForm());
            preguntas.show();
        }catch(Exception e){  alerta_de_error(e);  }
    }

    @FXML
    private void ventana_clonacion_de_voz() {
        try {
            animacion_image(animacionTechcom);
            Stage stage = (Stage) clonacion_de_voz.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("clonacion_de_voz.fxml"));
            Stage preguntas = new Stage();
            preguntas.setTitle("Clonacion de voz");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            preguntas.getIcons().add(icono);
            Scene Deepfake = new Scene(root,800,600);
            preguntas.setMaximized(true);
            preguntas.setScene(Deepfake);
            Deepfake.getStylesheets().add(getClass().getResource("resources/menu_principal.css").toExternalForm());
            preguntas.show();
        }catch(Exception e){  alerta_de_error(e);  }
    }

    @FXML
    private void exit(){
        System.exit(0);
    }

    @FXML
    private void ventana_creditos() {
        try {
            animacion_image(animacionTechcom);
            Stage stage = (Stage) creditos.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("creditos.fxml"));
            Stage preguntas = new Stage();
            preguntas.setTitle("Creditos");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            preguntas.getIcons().add(icono);
            Scene Deepfake = new Scene(root,800,600);
            preguntas.setMaximized(true);
            preguntas.setScene(Deepfake);
            Deepfake.getStylesheets().add(getClass().getResource("resources/menu_principal.css").toExternalForm());
            preguntas.show();
        }catch(Exception e){  alerta_de_error(e);  }
    }

    @FXML
    private void nueva_ventana() {
        try {
            //animacion_image(animacionTechcom);
            Stage stage = (Stage) Techcom.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("juegos.fxml"));
            Stage preguntas = new Stage();
            preguntas.setTitle("Juegos locos franklin");
            Image icono = new Image(getClass().getResourceAsStream("resources/TECHCOM.png"));
            preguntas.getIcons().add(icono);
            Scene juegos_locos_franklin = new Scene(root, 800, 600);
            preguntas.setMaximized(true);
            preguntas.setScene(juegos_locos_franklin);
            juegos_locos_franklin.getStylesheets().add(getClass().getResource("resources/menu_principal.css").toExternalForm());
            preguntas.show();
        } catch (Exception e) {
            alerta_de_error(e);
        }
    }
    
    // TODO: Franklin's games/methods for the project
    public boolean getjuegoiniciado() {
    	return juego_iniciado;
    }
    
    @FXML
    private void puntos() {
    	int Puntos_totales = Utils.puntos;
    	String Texto_P = String.valueOf(Puntos_totales);
    	puntos.setText("Puntos: "+Texto_P);
    }
    
}