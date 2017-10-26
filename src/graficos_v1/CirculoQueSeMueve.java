package graficos_v1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CirculoQueSeMueve extends LineasDeColor
{
	private int columna;
	@Override
	public void setear()
	{
		// TODO Auto-generated method stub
		super.setear();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton bi = new JButton("Izquierda");
        bi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                columna=columna-10;
                repaint();
            }
        });
        bi.setBounds(105, 482, 89, 23);
        contentPane.add(bi);
        
        JButton bd = new JButton("Derecha");
        bd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                columna=columna+10;
                repaint();
            }
        });
        bd.setBounds(556, 482, 89, 23);
        contentPane.add(bd);
        setBounds(0,0,800,600);
        columna=400;		
	}
	@Override
	public void paint(Graphics g)
	{
		// TODO Auto-generated method stub
		super.paint(g);
		  g.setColor (Color.red);
	        g.fillOval (columna, 300, 100, 100);	
	}
	public static void main(String[] args)
	{
		(new CirculoQueSeMueve()).mostrar();
	}

}
