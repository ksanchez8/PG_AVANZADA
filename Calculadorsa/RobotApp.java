import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RobotApp {


   public static void main(String[] args) {

       JFrame frame = new JFrame("Control de Robot");
       JPanel controlPanel = new JPanel();
       JButton moveForwardButton = new JButton("Moure Endavant");
       JButton moveBackwardButton = new JButton("Moure Enrere");
       JButton rotateLeftButton = new JButton("Girar Esquerra");
       JButton rotateRightButton = new JButton("Girar Dreta");
       JButton saveStateButton = new JButton("Guardar Estat");
       JButton loadStateButton = new JButton("Carregar Estat");
       JTextArea consoleOutput = new JTextArea(10, 20);

       // Configurar la consola para que sea solo de lectura
       consoleOutput.setEditable(false);
       
       // Configurar el diseño del panel de control
       controlPanel.setLayout(new GridLayout(3, 2));
       
       // Añadir los botones al panel de control
       controlPanel.add(moveForwardButton);
       controlPanel.add(moveBackwardButton);
       controlPanel.add(rotateLeftButton);
       controlPanel.add(rotateRightButton);
       controlPanel.add(saveStateButton);
       controlPanel.add(loadStateButton);

       // Configurar el diseño general del frame
       frame.setLayout(new BorderLayout());
       
       // Añadir la consola y el panel de control al frame
       frame.add(consoleOutput, BorderLayout.CENTER);
       frame.add(controlPanel, BorderLayout.SOUTH);

       // Configurar el tamaño y cierre del frame
       frame.setSize(300, 200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
       
       // Agregar acciones a los botones
       moveForwardButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               consoleOutput.append("Mover hacia adelante\n");
               // Lógica para mover el robot hacia adelante
           }
       });
       
       moveBackwardButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               consoleOutput.append("Mover hacia atrás\n");
               // Lógica para mover el robot hacia atrás
           }
       });
       
       rotateLeftButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               consoleOutput.append("Girar a la izquierda\n");
               // Lógica para girar el robot a la izquierda
           }
       });
       
       rotateRightButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               consoleOutput.append("Girar a la derecha\n");
               // Lógica para girar el robot a la derecha
           }
       });
       
       saveStateButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               consoleOutput.append("Guardar estado\n");
               // Lógica para guardar el estado del robot
           }
       });
       
       loadStateButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               consoleOutput.append("Cargar estado\n");
               // Lógica para cargar el estado del robot
           }
       });
   }
}
