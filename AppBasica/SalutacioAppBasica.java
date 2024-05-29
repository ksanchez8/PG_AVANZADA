import javafx.application.Application;  
import javafx.scene.Scene;             
import javafx.scene.control.Alert;     
import javafx.scene.control.Button;    
import javafx.scene.layout.StackPane;   
import javafx.stage.Stage; 

public class SalutacioAppBasica extends Application {
    Button button = new Button("Clica aquí");

    button.setOnAction(event -> {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Salutació");  // Establece el título de la alerta
        alert.setHeaderText(null);    // No establece encabezado para la alerta
        alert.setContentText("Hola! Gràcies per clicar el botó.");  // Establece el texto del mensaje
        alert.showAndWait();  // Muestra la alerta y espera hasta que el usuario la cierre
    });

    StackPane root = new StackPane();
    root.getChildren().add(button);
    Scene scene = new Scene(root, 300, 200);

    primaryStage.setTitle("Aplicació de Salutació");
    primaryStage.setScene(scene);

    
}