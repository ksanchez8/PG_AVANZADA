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

        consoleOutput.setEditable(false);

        controlPanel.setLayout(new GridLayout(3, 2));






}