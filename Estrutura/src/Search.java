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
	// genreOfMovie: busca por genero		
	// urlOfMovie : busca por URL do filme		v
	// noteOfMovie : busca por nota de usuário sobre o filme
	// dataReleaseOfMovie : busca por ano do filme		v
	// dataVideoreleaseOfMovie			v
	
	public Movie firstsearch(Collection<Movie> movies, String data)
	{
		for(Movie m : movies)
		{
			//System.out.println("entrou foooooor");
			boolean decisao = discoversMethod(m, data);
			//System.out.println("decisao = "+decisao);
			if(decisao)
			{
				//System.out.println("entrou iffffff");
				return m;				
			}
		}
		System.err.println("Filme nao encontrado!!!");
		return NULL;
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
			System.out.println("entrou");
			m.getVideoReleaseDate().equals(data);
		}
		else if(this.typeOfSearch.equals("noteOfMovie"))
		{
			
		}
		else if(this.typeOfSearch.equals("genreOfMovie"))
		{
			
		}
		else
		{
			System.err.println("Tipo de busca nao reconhecido!!!");
		}
		return false;
	}
	
}