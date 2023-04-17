import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Main extends javax.swing.JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Layout
        frame.setPreferredSize(new Dimension(700,600));

        //Color
        JPanel panel = new JPanel();
        panel.setBackground(new java.awt.Color(167,199,231));
        frame.add(panel);

        //Button km to mi
        JButton mitoKm = new JButton("Miles to Kilometers");
        mitoKm.setPreferredSize(new Dimension(200,50));
        mitoKm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value in miles:"));
                MileConverter i = new MileConverter();
                double finalValue = i.convertMtoKm(value);
                DecimalFormat df = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, value + " mi = " + df.format(finalValue) + "km");
            }
        });
        panel.add(mitoKm);

        //Button mi to km
        JButton kmtoMi = new JButton("Kilometers to Miles");
        kmtoMi.setPreferredSize(new Dimension(200,50));
        kmtoMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter value in kilometers:"));
                MileConverter i = new MileConverter();
                double finalValue = i.convertKmtoM(value);
                DecimalFormat df = new DecimalFormat("#.#");
                JOptionPane.showMessageDialog(frame, value + " km = " + df.format(finalValue) + "mi");
            }
        });
        panel.add(kmtoMi);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}