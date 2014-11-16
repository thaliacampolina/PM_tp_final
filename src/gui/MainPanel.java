package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainPanel  extends JPanel implements ActionListener
{
   private JLabel welcome = new JLabel ("\n  Insert your search type: \n");
   private JPanel radioPanel = new JPanel (new GridLayout (0,4));
   private FieldPanel name = new FieldPanel ("Name: " , 50);
   private FieldPanel year = new FieldPanel ("Year: " , 3);
   private FieldPanel genre = new FieldPanel ("Genre: " , 10);
   private FieldPanel rating = new FieldPanel ("Users' rating (1-5): " , 2);
   private JButton search = new JButton ("Search");
   private JButton clear = new JButton ("Clear");
   private JScrollPane scroll = new JScrollPane();
   
   private JFormattedTextField textField;
   
   public MainPanel () 
   {
	   ButtonGroup RBGroup = new ButtonGroup ();
	   
	   // Cria radio buttons
	   JRadioButton nameRB 		= new JRadioButton ("Name");
	   JRadioButton yearRB		= new JRadioButton ("Year");
	   JRadioButton genreRB 	= new JRadioButton ("Genre");
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
       
       // Adicionar action listeners nos botoes
       search.addActionListener(this);
       clear.addActionListener(this);
      
       // Criar e adicionar painel para exibir informacoes do filme
       JPanel informations = new JPanel ();
       informations.setLayout (new BoxLayout(informations, BoxLayout.Y_AXIS));
       informations.setPreferredSize(new Dimension(767,461));
       scroll.setViewportView (informations);
       scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
       scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       
       add (scroll);
       informations.add(new JLabel ("oi oi oi oi oi oio i\noioioioioi"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("uhuuul"));
       informations.add(new JLabel ("fim"));
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

