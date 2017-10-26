package entrada_salida;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner.ListEditor;
import javax.swing.JTextField;

import graficos_v1.MostrarImagen;

public class TestField1 extends JFrame implements ActionListener
{
	private JTextField textField1=new JTextField();
	public JLabel label1=new JLabel("Usuario: ");
	private JButton boton1=new JButton("Aceptar->");
	
	public void setear()
	{
		setLayout(null);
		label1.setBounds(10,10,100,30);
		textField1.setBounds(120,20,150,20);
		boton1.setBounds(10,80,100,30);
		add(boton1);add(textField1);add(label1);
		boton1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==boton1)
		{
			setTitle(textField1.getText());
		}	
	}
	private void mostrar()
	{
		setear();
		setBounds(0,0,300,150);
		setVisible(true);
	}
	public static  void disponiblePorSegundos(long  segundos) throws InterruptedException
	{
		Thread.sleep(segundos*1000);
		System.exit(ABORT);
		System.exit(0);
	}
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("puts");
		(new TestField1()).mostrar();
		disponiblePorSegundos(8);
	}
}
