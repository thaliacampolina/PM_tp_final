package structures;

import java.util.ArrayList;
import java.util.Collection;


public class Search {

	
	private static final Movie NULL = null;
	private String typeOfSearch;
	//trabalhos futuros: busca de nome
	// busca de ano
	//busca de genero
	//busca de id
	//busca de URL
	//busca de notas de usuarios
	public Search(String typeOfSearch)
	{
		this.typeOfSearch = typeOfSearch;
	}
	
	//metodo responsavel por fazer uma busca dependendo do tipo desta
	// nameOfMovie : busca por nome de filme  v
	// idOfMovie: busca por id do filme		v
	// genreOfMovie: busca por genero de filme	v
	// urlOfMovie : busca por URL do filme		v
	// noteOfMovie : busca por nota de usuário sobre o filme v
	// dataReleaseOfMovie : busca por ano do filme		v
	// dataVideoreleaseOfMovie			v
	
	public Collection<Movie> firstsearch(Collection<Movie> movies, String data)
	{
		Collection<Movie> selection = new ArrayList<Movie>();
		for(Movie m : movies)
		{
			//System.out.println("entrou foooooor");
			boolean decisao = discoversMethod(m, data);
			//System.out.println("decisao = "+decisao);
			if(decisao)
			{
				//System.out.println("entrou iffffff");
				selection.add(m);				
			}
		}
		System.err.println("Filme nao encontrado!!!");
		return selection;
	}	
	
	public boolean discoversMethod(Movie m, String data)
	{
		//System.out.println("fora   this.typeOfSearch = "+this.typeOfSearch);
		if(this.typeOfSearch.equals("nameOfMovie"))
		{
			//System.out.println("m.getMovieTitle() = "+m.getMovieTitle());
			//System.out.println("data = "+data);
			return m.getMovieTitle().equals(data);
		}
		else if(this.typeOfSearch.equals("idOfMovie"))
		{
			return m.getMovieId().equals(data);
		}
		else if(this.typeOfSearch.equals("urlOfMovie"))
		{
			return m.getImdbUrl().equals(data);
		}
		else if(this.typeOfSearch.equals("dataReleaseOfMovie"))
		{
			return m.getReleaseDate().equals(data);
		}
		else if(this.typeOfSearch.equals("dataVideoreleaseOfMovie"))
		{
			//System.out.println("entrou");
			return m.getVideoReleaseDate().equals(data);
		}
		else if(this.typeOfSearch.equals("noteOfMovie"))
		{
			//System.out.println("noteOfMovie");
			//System.out.print("m.getAverengeNote() = "+m.getAverengeNote());
			//System.out.println("data = "+data);
			//System.out.println();
			return m.getAverengeNote().equals(data);
		}
		else if(this.typeOfSearch.equals("genreOfMovie"))
		{
			int value = m.getGenre().discoveryGenre(data);
			if(value == 1)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			System.err.println("Tipo de busca nao reconhecido!!!");
		}
		return false;
	}
	
}