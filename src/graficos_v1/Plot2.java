package graficos_v1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Plot2 extends JFrame
{
	private JPanel contentPane=new JPanel();
	
	private void setear1()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        setBounds(0,0,800,600);
	}
	@Override
	public void paint(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paint(g);
		g.setColor (Color.blue);
	    g.drawString("Primer linea",10,200);
	    g.drawString("Segunda linea",10,300);
	}
	private void mostrar1()
	{
		setear1();
		(new Plot2()).setVisible(true);
	}
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					(new Plot2()).mostrar1();
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		});
	}

}

