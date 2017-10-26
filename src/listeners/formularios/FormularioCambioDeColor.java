package listeners.formularios;
import javax.swing.*;
import javax.swing.plaf.SliderUI;

import graficos_v1.MostrarImagen;

import java.awt.*;
import java.awt.event.*;
public class FormularioCambioDeColor extends JFrame implements ActionListener{
    public JMenuBar menuBar1=new JMenuBar();
    public JMenu menu1=new JMenu("Opciones");
    public JMenuItem  miRojo=new JMenuItem("Rojo"),
    		miVerde=new JMenuItem("Verde"),
    		miAzul=new JMenuItem("Azul");
    private void setear()
	{
    	setLayout(new FlowLayout());
    	setJMenuBar(this.menuBar1);
    	menuBar1.add(menu1);
        miRojo.addActionListener(this);
        miVerde.addActionListener(this);
        miAzul.addActionListener(this);
        menu1.add(this.miRojo);
        menu1.add(this.miVerde);        
        menu1.add(this.miAzul);
	}
    private void mostrar()
	{
    	setear();
    	this.setBounds(30,20,400,500);
    	setVisible(true);
	}
    public void actionPerformed(ActionEvent e) {
    	Container f=this.getContentPane();
        if (e.getSource()==miRojo) {
            f.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==miVerde) {
            f.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==miAzul) {
            f.setBackground(new Color(0,0,255));
        }        
    }
    public static void main(String[] ar) throws InterruptedException {
       (new FormularioCambioDeColor()).mostrar();
       System.out.println("puts");
       Thread.sleep(7000);
       System.exit(0);
    }    
}