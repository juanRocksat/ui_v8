package listeners.formularios;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import graficos_v1.MostrarImagen;

public class FormularioMenuColor_v2 extends FormularioCambioDeColor
{
	public JMenu manu1=new JMenu("Opciones"),
			menu2=new JMenu("para ver otra solapa"),
			subMenu3=new JMenu("Tamano de la ventana"),
			subMenu4=new JMenu("Color de Fondo");
	public JMenuItem mi1=new JMenuItem("640*480"),
			mi2=new JMenuItem("1024*768"),
			mi3=new JMenuItem("Rojo"),
			mi4=new JMenuItem("Verde");
	public void setear(){
		setLayout(null);
		setJMenuBar(menuBar1);
		menuBar1.add(menu1);menuBar1.add(menu2);
		menu1.add(subMenu4);
		menu1.add(subMenu3);
		
		subMenu3.add(mi2);subMenu3.add(mi1);
		subMenu4.add(mi3);subMenu4.add(mi4);
		listenerDeBotones();
	}
	private void listenerDeBotones()
	{
		mi3.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		super.actionPerformed(e);
		if(e.getSource()==mi1){
			setSize(640,480);
		}
		if(e.getSource()==mi2)
		{
			setSize(1024,768);
		}
		if(e.getSource()==mi3)
		{
			getContentPane().setBackground(Color.RED);
		}
		if(e.getSource()==mi4)
		{
			getContentPane().setBackground(Color.GREEN);
		}
	}
	private void mostrar()
	{
		setear();
		setBounds(0,0,300,300);
		setVisible(true);
	}	
	public static void main(String[] args) throws InterruptedException
	{
		(new FormularioMenuColor_v2()).mostrar();
		Thread.sleep(10000);
		System.exit(ABORT);
	}

}
