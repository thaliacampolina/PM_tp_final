package structures;
import structures.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class FinalSearch {
	public  String NAME_FILE_USERS = "//../filmes100k/u.user";
	public  String NAME_FILE_GENRE = "//../filmes100k/u.genre";
	public  String NAME_FILE_MOVIE = "//../filmes100k/u.item";
	public  String NAME_FILE_DATA = "//../filmes100k/u.data";
	
	public Collection<Movie> m;
	
	public FinalSearch(){}
		
	public void readDatas ()
	{
		//AQUI VOCE DIZ QUAL TIPO DE BUSCA QUER E A COLOCA ABAIXO
        //OS TIPOS POSSIVEIS SAO:
        //nameOfMovie : busca por nome de filme  
    	// idOfMovie: busca por id do filme		
    	// genreOfMovie: busca por genero de filme	
    	// urlOfMovie : busca por URL do filme		
    	// noteOfMovie : busca por nota de usuário sobre o filme 
    	// dataReleaseOfMovie : busca por ano do filme		
    	// dataVideoreleaseOfMovie
		
		//AQUI VOCE COLOCA O DADO QUE O USUARIO DIGITOU REFERENTE A BUSCA
		
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
        
        this.m = movie;
	}
	
	public Collection<Movie> search (String typeOfSearch, String dataOfSearch)
	{
		
		//collection de filme, dado a pesquisar
        Collection<Movie> selection = new ArrayList<Movie>();
        
        
        
		Search search = new Search(typeOfSearch);
		selection = search.firstsearch(this.m, dataOfSearch);
		
		//POR FIM TE RETORNO TODOS OS OBJETOS QUE POSSUEM OS DADOS SOLICITADOS
		//System.out.println("genre"+m.getGenre());	
		return selection;
	}
}
