package entrada_salida;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TestField2 extends TestField1
{
	public JTextField textField2=new JTextField();
	public Button boton2=new Button(" + ");
	private static JTextField textField1= new JTextField();

	@Override
	public void setear()
	{
		setLayout(null);
		textField2.setBounds(10,10,100,30);
		add(textField1);add(textField2);
		textField1.setBounds(10,50,100,30);
		boton2.setBounds(10,90,100,30);
		add(boton2);
		boton2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==boton2)
		{
			titularSuma();
		}
	}
	public double stringToInt(String s)
	{
		return Double.parseDouble(s);
	}
	public String doubleToString(double dx )
	{
		return String.valueOf(dx);
	}
	private void titularSuma()
	{
		double x =stringToInt(textField1.getText());
		double y= stringToInt(textField2.getText()); ;
		double total=x+y;
		setTitle(doubleToString(total));
	}
	private void mostrar()
	{
		setear();
		setBounds(10,150,140,150);
		setVisible(true);
	}
	public static void main(String[] args) throws InterruptedException
	{
		(new TestField2()).mostrar();
		disponiblePorSegundos(15);
	}
	public int centimetroAPixel(int centimetro){
		double x = (double) centimetro;
		return (int) (x * 39.938109286035136);
	}
}
