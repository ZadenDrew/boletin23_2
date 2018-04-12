package com.ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author acabezaslopez
 */
public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;

    public Ventana() {
        marco = new JFrame("CURSO DAM");
        panel = new JPanel();
        boton1 = new JButton("programación");
        boton2 = new JButton("bases");
        // Se dan las características a los objetos:
        marco.setSize(300, 200);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);

        // Se añade al botón el ActionListener
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        //visibilidad
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object boton = e.getSource();
        if (boton == boton1) {
            marco.setTitle("programacion");
        } else {
            marco.setTitle("bases de datos");
        }

    }
}
