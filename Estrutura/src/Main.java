import java.util.ArrayList;
import java.util.Collection;


public class Main {
	public static String NAME_FILE_USERS = "u.user";
	public static String NAME_FILE_GENRE = "u.genre";
	public static String NAME_FILE_MOVIE = "u.item";
	public static String NAME_FILE_DATA = "u.data";
		
	public static void main (String[] args)
	{
		OpenFiles op = new OpenFiles(NAME_FILE_USERS, NAME_FILE_DATA,
				NAME_FILE_MOVIE, NAME_FILE_GENRE);
		
		//collection para as entidades
		Collection<User> users = new ArrayList<User>();
		Collection<Movie> movie = new ArrayList<Movie>();
		Collection<Data> data = new ArrayList<Data>();
	
		//ler e instanciar usuarios
		op.readUsers(users);
		
		//ler e instanciar movies
        op.readMovie(movie);

        //ler e instanciar data
		op.readData(data);
				
		System.out.println("saiu");		
	}
}