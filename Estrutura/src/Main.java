import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;


public class Main {
	public static String NAME_FILE_USERS = "/../filmes100k/u.user";
	public static String NAME_FILE_GENRE = "/../filmes100k/u.genre";
	public static String NAME_FILE_MOVIE = "/../filmes100k/u.item";
	public static String NAME_FILE_DATA = "/../filmes100k/u.data";
		
	public static void main (String[] args)
	{
		OpenFiles op = new OpenFiles(NAME_FILE_USERS, NAME_FILE_DATA,
				NAME_FILE_MOVIE, NAME_FILE_GENRE);
		
		//collection para as entidades
		Collection<User> users = new ArrayList<User>();
		//List users = new ArrayList();
		Collection<Movie> movie = new ArrayList<Movie>();
		Collection<Data> data = new ArrayList<Data>();
	
		//ler e instanciar usuarios
		op.readUsers(users);
		
		//ler e instanciar movies
        op.readMovie(movie);

        //ler e instanciar data
		op.readData(data);
		//collection de filme, dado a pesquisar
		Search search = new Search("idOfMovie");
		System.out.println("FILME ENCONTRADO!!!");	
		Movie m = search.firstsearch(movie, "5");
		System.out.println(""+m.getMovieTitle());	
		System.out.println("URL = "+m.getImdbUrl());	
		System.out.println("ID = "+m.getMovieId());	
		System.out.println("Date release = "+m.getReleaseDate());	
		System.out.println("video data release = "+m.getVideoReleaseDate());	
		//System.out.println("genre"+m.getGenre());		
	}
}