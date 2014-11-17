package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import structures.FinalSearch;
import structures.Genre;
import structures.Movie;

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
   private JScrollPane scroll;
   
   // Subs
   private JPanel informations		= new JPanel ();
   private JRadioButton nameRB 		= new JRadioButton ("Name");
   private JRadioButton yearRB		= new JRadioButton ("Year");
   private JRadioButton genreRB 	= new JRadioButton ("Genre");
   private JRadioButton ratingRB	= new JRadioButton ("Rating");
   private String typeOfSearch		= "nameOfMovie";
   private String whatToSearch		= "";
   private ArrayList<Movie> movieList = new ArrayList<Movie> ();
   
   private JFormattedTextField textField;
   
   public MainPanel () 
   {
       super();
	   ButtonGroup RBGroup = new ButtonGroup ();
	   
	   // Seta comandos para os radio buttons
	   nameRB.setActionCommand("nameOfMovie");
	   yearRB.setActionCommand("dataReleaseOfMovie");
	   genreRB.setActionCommand("genreOfMovie");
	   ratingRB.setActionCommand("noteOfMovie");
	   
	   // Seta o nome como padrao inicial
	   nameRB.setSelected(true);
	   updateEditable ();
	   
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
       informations.setLayout (new BoxLayout(informations, BoxLayout.Y_AXIS));
       scroll = new JScrollPane(informations);
       scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
       scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scroll.getViewport().setPreferredSize(new Dimension(767,461));
       
       add (scroll);
       
       setLayout (new FlowLayout (FlowLayout.LEFT));
       
   }
   
   public void actionPerformed (ActionEvent e)
   {
       Object obj = e.getSource ();
       
       if (obj instanceof JRadioButton)
       {
    	   typeOfSearch = e.getActionCommand();
    	   updateEditable ();
    	   informations.validate();
    	   informations.repaint();
       }
       else if (obj == search)
       {
    	   clear ();
    	   getTextView ();
    	   showMovies ();
       }
       else if (obj == clear)
       {
           name.setTextField ("");
           year.setTextField ("");
           genre.setTextField ("");
           rating.setTextField ("");
           clear();
       }
   }
   
   private void clear ()
   {
	   Component[] cs = informations.getComponents();
	   
	   for (Component c : cs)
		   informations.remove(c);
	   
	   informations.validate();
	   informations.repaint();
   }
   
   private void updateEditable ()
   {
	   if (typeOfSearch.equals("nameOfMovie"))
	   {
		   name.enable();
		   year.disable();
		   genre.disable();
		   rating.disable();
	   }
	   else if (typeOfSearch.equals("dataReleaseOfMovie"))
	   {
		   name.disable();
		   year.enable();
		   genre.disable();
		   rating.disable();
	   }
	   else if (typeOfSearch.equals("genreOfMovie"))
	   {
		   name.disable();
		   year.disable();
		   genre.enable();
		   rating.disable();
	   }
	   else if (typeOfSearch.equals("noteOfMovie"))
	   {
		   name.disable();
		   year.disable();
		   genre.disable();
		   rating.enable();
	   }
   }
   
   private boolean getTextView ()
   {
	   if (typeOfSearch.equals("nameOfMovie"))
		   whatToSearch = name.getText();

	   else if (typeOfSearch.equals("dataReleaseOfMovie"))
		   whatToSearch = year.getText();

	   else if (typeOfSearch.equals("genreOfMovie"))
		   whatToSearch = genre.getText();
	   
	   else if (typeOfSearch.equals("noteOfMovie"))
		   whatToSearch = rating.getText();
	   
	   if (whatToSearch.length() == 0)
	   {
		   informations.add(new JLabel ("Invalid information."));
    	   informations.validate();
    	   informations.repaint();
    	   return false;
	   }
	   return true;
   }
   
   private boolean movieListIsEmpty ()
   {
	   if (movieList.size() == 0)
	   {
		   informations.add(new JLabel ("No movie was found."));
    	   informations.validate();
    	   informations.repaint();
    	   return true;
	   }
	   
	   return false;
   }
   
   private void showMovies ()
   {
	   FinalSearch fs = new FinalSearch ();
       fs.readDatas();
	   movieList = new ArrayList (fs.search(typeOfSearch, whatToSearch));
	   
	   if (!movieListIsEmpty())
	   {
		   String s = "<html>";
		   for (int i = 0 ; i < movieList.size() ; i++)
		   {
			   s += "Name: "+movieList.get(i).getMovieTitle()+"<br>";
			   s += "Year: "+movieList.get(i).getReleaseDate()+"<br>";
			   s += "Release date: "+movieList.get(i).getVideoReleaseDate()+"<br>";
			   ArrayList<String> movieGenres = movieList.get(i).getAllGenres();
			   s += "Genre(s): ";
			   for (int y = 0 ; y < movieGenres.size() ; y++)
			   {
				   if (y == movieGenres.size()-1)
					   s += movieGenres.get(y) + "<br>";
				   else
					   s += movieGenres.get(y) + ", ";
			   } 
			   s += "Rating: "+movieList.get(i).getAverengeNote()+"<br>";
			   s += "<br><br>";
		   }
		   informations.add(new JLabel (s));
    	   informations.validate();
    	   informations.repaint();
	   }
   }
}

