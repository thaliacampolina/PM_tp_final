package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainPanel  extends JPanel implements ActionListener
{
   private JLabel welcome = new JLabel ("\n  Insira o tipo de pesquisa: \n");
   private JPanel radioPanel = new JPanel (new GridLayout (0,4));
   private FieldPanel name = new FieldPanel ("Nome do filme: " , 50);
   private FieldPanel year = new FieldPanel ("Ano: " , 3);
   private FieldPanel genre = new FieldPanel ("Gï¿½nero: " , 10);
   private FieldPanel rating = new FieldPanel ("Rating de usuï¿½rios (1-5): " , 2);
   private JButton search = new JButton ("Pesquisar");
   private JButton clear = new JButton ("Limpar");
   
   private JFormattedTextField textField;
   
   public MainPanel () 
   {
	   ButtonGroup RBGroup = new ButtonGroup ();
	   
	   // Cria radio buttons
	   JRadioButton nameRB 		= new JRadioButton ("Nome");
	   JRadioButton yearRB		= new JRadioButton ("Ano");
	   JRadioButton genreRB 	= new JRadioButton ("Gênero");
	   JRadioButton ratingRB	= new JRadioButton ("Rating");
	   
	   // Seta comandos para os radio buttons
	   nameRB.setActionCommand("nameOfMovie");
	   yearRB.setActionCommand("dataReleaseOfMovie");
	   genreRB.setActionCommand("genreOfMovie");
	   ratingRB.setActionCommand("noteOfMovie");
	   
	   // Seta o nome como padrao inicial
	   nameRB.setSelected(true);
	   
	   // Adicionar radio buttons em um grupo
	   RBGroup.add (nameRB);
	   RBGroup.add (yearRB);
	   RBGroup.add (genreRB);
	   RBGroup.add (ratingRB);
	   
	   // Adicionar action listeners ao radio buttons
	   nameRB.addActionListener(this);
	   yearRB.addActionListener(this);
	   genreRB.addActionListener(this);
	   ratingRB.addActionListener(this);
	   
	   radioPanel.add(nameRB);
	   radioPanel.add(yearRB);
	   radioPanel.add(genreRB);
	   radioPanel.add(ratingRB);
	   
	   // Adicionar coisinhas
       add (welcome);
       add (radioPanel);
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

