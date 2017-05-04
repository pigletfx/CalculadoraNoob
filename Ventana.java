/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author carlos
 */
public class Ventana extends JFrame {

    //Aqui teneis las variables que estareis ocupando 
    JTextField tx = new JTextField("", 20);
    JTextField tx2 = new JTextField("", 20);
    JButton b1 = new JButton("+");
    JButton b2 = new JButton("-");
    JTextField rs = new JTextField("", 20);
    JButton b3 = new JButton("x");
    JButton b4 = new JButton("/");

    public Ventana() {
        init();
    }

    private void init() {
        setTitle("Calculadora NOCientifica100%RealNoFeik");
        setLayout(new FlowLayout());
        
        //Aqui se pusieron las etiquetas y el cuadro de Texto
        add(new JLabel(" Primer numero "));
        add(tx);

        add(new JLabel(" Segundo numero "));
        add(tx2);

        add(new JLabel(" Resultado total "));
        add(rs);
        
        //Asignacion de eventos a cada Boton
        b1.addActionListener(new Suma());
        b2.addActionListener(new Resta());
        b3.addActionListener(new Multi());
        b4.addActionListener(new Division());

        //Agregar los botones al Freim :D
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        
        //Nota Importante No borrar :)
        add(new JLabel("Favor de no poner letras... No seas nuv"));

        //Lo que le da vida y tamaño(Pa que se vea y el ancho y largo del freim)
        setSize(370, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /** Este el codigo donde se realiza la operacion de Extraer el primer numero 
    del cuadro de texto y Extraer El segundo numero para despues 
    sumaarlos y colocarlos */
    private class Suma implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double pr = Double.parseDouble(tx.getText());
            double sc = Double.parseDouble(tx2.getText());
            double suma = pr + sc;
            rs.setText("" + suma);
        }

    }
    
    /** Este el codigo donde se realiza la operacion de Extraer el primer numero 
    del cuadro de texto y Extraer El segundo numero para despues 
    restarlos y colocarlos */
    private class Resta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double pr = Double.parseDouble(tx.getText());
            double sc = Double.parseDouble(tx2.getText());
            double resta = pr - sc;
            rs.setText("" + resta);
        }

    }

    /** Este el codigo donde se realiza la operacion de Extraer el primer numero 
    del cuadro de texto y Extraer El segundo numero para despues 
    multiplicarlos y colocarlos */
    private class Multi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double pr = Double.parseDouble(tx.getText());
            double sc = Double.parseDouble(tx2.getText());
            double mul = pr * sc;
            rs.setText(String.format("%.5f", mul));
        }

    }
    
    /** Este el codigo donde se realiza la operacion de Extraer el primer numero 
    del cuadro de texto y Extraer El segundo numero para despues 
    dividirlos y colocarlos */
    private class Division implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double pr = Double.parseDouble(tx.getText());
            double sc = Double.parseDouble(tx2.getText());
            double div = pr / sc;
            rs.setText(String.format("%.5f", div));
        }

    }
}
