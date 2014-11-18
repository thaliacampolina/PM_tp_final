package structures;

import java.util.ArrayList;
import java.util.Collection;


public class Search {

	
	private static final Movie NULL = null;
	private String typeOfSearch;
	public Search(String typeOfSearch)
	{
		this.typeOfSearch = typeOfSearch;
	}
	
	//metodo responsavel por fazer uma busca dependendo do tipo desta
	// nameOfMovie : busca por nome de filme  v
	// idOfMovie: busca por id do filme		v
	// genreOfMovie: busca por genero de filme	v
	// urlOfMovie : busca por URL do filme		v
	// rateOfMovie : busca por nota de usuário sobre o filme v
	// dataReleaseOfMovie : busca por ano do filme		v
	// dataVideoreleaseOfMovie			v
	
	public Collection<Movie> firstsearch(Collection<Movie> movies, String data)
	{
		Collection<Movie> selection = new ArrayList<Movie>();
		for(Movie m : movies)
		{
			boolean decisao = discoversMethod(m, data);
			if(decisao)
			{
				selection.add(m);				
			}
		}
		return selection;
	}	
	
	public boolean discoversMethod(Movie m, String data)
	{
		if(this.typeOfSearch.equals("nameOfMovie"))
		{
			return m.getMovieTitle().toLowerCase().contains(data.toLowerCase());
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
			return m.getVideoReleaseDate().equals(data);
		}
		else if(this.typeOfSearch.equals("rateOfMovie"))
		{
			return m.getAverageRate().equals(data);
		}
		else if(this.typeOfSearch.equals("genreOfMovie"))
		{
			int value = m.getGenre().discoverGenre(data);
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
