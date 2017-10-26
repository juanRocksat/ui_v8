package graficos_v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner.ListEditor;
import javax.swing.border.EmptyBorder;

import demo.Evento_cerrar_ventana;

public class LineasDeColor extends JFrame
{
	public  JPanel contentPane=new JPanel();
	public void setear()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 450, 300);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        contentPane.setLayout(new BorderLayout(0, 0));
	        setContentPane(contentPane);
	        setBounds(0,0,800,255);	
	        addWindowListener(new Evento_cerrar_ventana());
	        
	}
	public void mostrar()
	{
		this.setear();
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		 super.paint(g);
	        int fila = 0;
	        for (int rojo = 0 ; rojo <= 255 ; rojo++)
	        {
	            Color col = new Color (rojo, 0, 0);
	            g.setColor (col);
	            g.drawLine (0, fila, 900, fila);
	            fila++;
	        }	
	}
	public static void main(String[] args)
	{
		(new LineasDeColor()).mostrar();

	}

}
