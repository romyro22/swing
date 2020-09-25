package main.java.texto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Texto {

    /* JTextField y JTextArea heredan de la clase JTextComponent */
    /* JTextField construye cuadro de texto de una sola linea */
    /* JTextArea construye un area de texto, permite varias lineas */

    public static void main( String [] args) {
        /* Construimos el marco */
        MarcoTexto mimarco = new MarcoTexto();
        /* Instanciamos el marco */
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoTexto extends JFrame{
    /* Constructor*/
    public MarcoTexto(){

        /* Posicion y tamaño */
        setBounds(600,300,600,350);
        LaminaTexto milamina = new LaminaTexto();
        add(milamina);
        setVisible(true);
    }

}

class LaminaTexto extends JPanel {
    /* En esta clase se agregaran los componentes swing */
    public LaminaTexto(){
        campo1 = new JTextField(20);
        /* Se agrega el campo en la lamina */
        add(campo1);
        JButton miboton = new JButton("OK");
        /* DameTexto es la clase que va a gestionar el evento correspondiente */
        /* Creamos la instancia */
        DameTexto mievento = new DameTexto();
        /* miboton debe estar a la escucha del evento */
        miboton.addActionListener(mievento);
        /* Agremos el boton en la lamina */
        add(miboton);
    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(campo1.getText().trim());
        }
    }
    private JTextField campo1;
}