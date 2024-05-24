import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

        consoleOutput.setEditable(false);

        controlPanel.setLayout(new GridLayout(3, 2));

        controlPanel.add(moveForwardButton);
        controlPanel.add(moveBackwardButton);
        controlPanel.add(rotateLeftButton);
        controlPanel.add(rotateRightButton);
        controlPanel.add(saveStateButton);
        controlPanel.add(loadStateButton);

        frame.setLayout(new BorderLayout());

        frame.add(consoleOutput, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        moveForwardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consoleOutput.append("Mover hacia adelante\n");
                // Codigo a introducir en un futuro
            }
        });

        moveBackwardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consoleOutput.append("Mover hacia atrás\n");
                // Codigo a introducir en un futuro
            }
        });

        rotateLeftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consoleOutput.append("Girar a la izquierda\n");
                // Codigo a introducir en un futuro
            }
        });

        rotateRightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consoleOutput.append("Girar a la derecha\n");
                // Codigo a introducir en un futuro
            }
        });

        saveStateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarEstadoEnArchivo("estado.txt", consoleOutput.getText());
                consoleOutput.append("Estado guardado en estado.txt\n");
            }
        });
        
        loadStateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String estado = cargarEstadoDesdeArchivo("estado.txt");
                consoleOutput.setText(estado);
                consoleOutput.append("Estado cargado desde estado.txt\n");
        });
    }

    private static void guardarEstadoEnArchivo(String nombreArchivo, String contenido) {
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
           writer.write(contenido);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }


}