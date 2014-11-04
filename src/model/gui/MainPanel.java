package model.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainPanel  extends JPanel implements ActionListener
{
	private JLabel welcome = new JLabel ("\n  Bem vindo à busca de filmes!\n");
	private FieldPanel name = new FieldPanel ("Nome do filme: " , 50);
	private FieldPanel year = new FieldPanel ("Ano: " , 3);
	private FieldPanel genre = new FieldPanel ("Gênero: " , 10);
	private FieldPanel rating = new FieldPanel ("Rating de usuários (1-5): " , 2);
	private JButton search = new JButton ("Pesquisar");
	private JButton clear = new JButton ("Limpar");
	
	private JFormattedTextField textField;
	
	public MainPanel () 
	{
		add (welcome);
		add (name);
		add (year);
		add (genre);
		add (rating);
		add (search);
		add (clear);
		
		search.addActionListener(this);
		clear.addActionListener(this);
		
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
	}
	
	public void actionPerformed (ActionEvent e)
	{
		Object obj = e.getSource ();
		
		if (obj == search)
		{
			// Pegar as coisas dos edit text pra salvar
		}
		else if (obj == clear)
		{
			name.setTextField ("");
			year.setTextField ("");
			genre.setTextField ("");
			rating.setTextField ("");
		}
	}
}