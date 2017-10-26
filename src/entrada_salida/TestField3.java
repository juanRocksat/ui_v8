package entrada_salida;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import interfaces.DeConversion;

public class TestField3 extends JFrame implements DeConversion, ActionListener
{
	private JTextField user=new JTextField();
	private JTextField pass = new JTextField();
	private JButton bLogin = new JButton("Ingresar");
	
	private void seteoDeEspacios()
	{
		setLayout(null);
		setSize(300,300);
		user.setBounds(centimetroAPixel(1),centimetroAPixel(1),100,100);
		pass.setBounds(centimetroAPixel(1),centimetroAPixel(2),100,100);
		add(user);add(pass);
		bLogin.setBounds(centimetroAPixel(1),centimetroAPixel(3),100,100);
		add(bLogin);
		bLogin.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bLogin)
		{
			mostrarLoginCorrecto();
		}
	}
	private void mostrar()
	{
		seteoDeEspacios();
		setBounds(centimetroAPixel(1),centimetroAPixel(5),140,150);
		setVisible(true);
	}
	private void mostrarLoginCorrecto()
	{
		if(pass.getText()=="1234")
		{
			mostrarEmergente("Correcto !!");
		}
		else{
			mostrarEmergente("!Error  !");
		}
	}
	private void mostrarEmergente(String s)
	{
		JOptionPane.showMessageDialog(null,s,"UnTitulo..", getDefaultCloseOperation());
	}
//	private void mostrarEmergente(String s,String titulo)
//	{
//		JOptionPane.showMessageDialog(null,s,titulo);
//	}
	public static void main(String[] args) throws InterruptedException
	{
//		(new TestField3()).mostrar();
//		disponiblePorSegundos(20);
		System.out.println(	(new TestField3()).entradaDeDialogo("Holaa"));
	}
	public static   void disponiblePorSegundos(long  segundos) throws InterruptedException
	{
		Thread.sleep(segundos*1000);
		System.exit(0);
	}
	private String entradaDeDialogo(String mensajeDeTextField)
	{
		return JOptionPane.showInputDialog(mensajeDeTextField);
	}

}
