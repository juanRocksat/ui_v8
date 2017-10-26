package menus;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Formulario extends JFrame implements ItemListener
{
	private JComboBox combo1=new JComboBox();
	private void setear()
	{
		setLayout(null);
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("rojo");
        combo1.addItem("vede");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getSource()==combo1) {
            String seleccionado=(String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
	}
	public static void main(String[] args)
	{
		Formulario formulario1=new Formulario();
		formulario1.setear();
        formulario1.setBounds(0,0,200,150);
        formulario1.setVisible(true);	
	}
}


//https://www.tutorialesprogramacionya.com/javaya/detalleconcepto.php?punto=37&codigo=110&inicio=20
