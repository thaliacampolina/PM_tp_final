package gui;
import structures.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;


public class MainLoad {
	public static String NAME_FILE_USERS = "//../filmes100k/u.user";
	public static String NAME_FILE_GENRE = "//../filmes100k/u.genre";
	public static String NAME_FILE_MOVIE = "//../filmes100k/u.item";
	public static String NAME_FILE_DATA = "//../filmes100k/u.data";
		
	public MainLoad() {
		//AQUI VOCE DIZ QUAL TIPO DE BUSCA QUER E A COLOCA ABAIXO
        String typeOfSearch = "";
        //OS TIPOS POSSIVEIS SAO:
        //nameOfMovie : busca por nome de filme  
    	// idOfMovie: busca por id do filme		
    	// genreOfMovie: busca por genero de filme	
    	// urlOfMovie : busca por URL do filme		
    	// noteOfMovie : busca por nota de usuário sobre o filme 
    	// dataReleaseOfMovie : busca por ano do filme		
    	// dataVideoreleaseOfMovie
		
		//AQUI VOCE COLOCA O DADO QUE O USUARIO DIGITOU REFERENTE A BUSCA
        //String dataOfSearch = "";
		
		OpenFiles op = new OpenFiles(NAME_FILE_USERS, NAME_FILE_DATA,
				NAME_FILE_MOVIE, NAME_FILE_GENRE);
		
		//collection para as entidades
		Collection<User> users = new ArrayList<User>();
		//List users = new ArrayList();
		Collection<Movie> movie = new ArrayList<Movie>();
		Collection<Data> data = new ArrayList<Data>();
	
		//ler e instanciar usuarios
		op.readUsers(users);
		
		 //ler e instanciar data
		op.readData(data);
		
		//ler e instanciar movies
        op.readMovie(movie, data);

       
		
		//collection de filme, dado a pesquisar
        Collection<Movie> selection = new ArrayList<Movie>();
        
        
        
		Search search = new Search(typeOfSearch);
		selection = search.firstsearch(movie, typeOfSearch);
		
		//POR FIM TE RETORNO TODOS OS OBJETOS QUE POSSUEM OS DADOS SOLICITADOS
		
		for(Movie m : selection)
		{
			System.out.println(""+m.getMovieTitle());	
			System.out.println("URL = "+m.getImdbUrl());	
			System.out.println("ID = "+m.getMovieId());	
			System.out.println("Date release = "+m.getReleaseDate());	
			System.out.println("video data release = "+m.getVideoReleaseDate());
		}
		//System.out.println("genre"+m.getGenre());		
	}
}
