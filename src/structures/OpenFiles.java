package structures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

//essa classe abre os arquivos do database,
//baixados pelo MovieLens,um por um, para ler
public class OpenFiles {
	private String nameFileUser;
	private String nameFileData;
	private String nameFileMovie;
	private String nameFileGenere;
		
	public OpenFiles(String nameFileUser, String nameFileData,
			String nameFileMovie, String nameFileGenere)
	{
		this.nameFileUser = nameFileUser;
		this.nameFileData = nameFileData;
		this.nameFileMovie = nameFileMovie;
		this.nameFileGenere = nameFileGenere;
	}
	
	public void readUsers(Collection<User> users)
	{
		String filePath = new File("").getAbsolutePath();
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(filePath + nameFileUser));
			String linha;
			while (in.ready()) 
			{
				linha = in.readLine();
				String id = linha.substring(0, linha.indexOf('|'));
				linha = linha.substring(linha.indexOf('|') + 1);
				String age = linha.substring(0, linha.indexOf('|'));
				linha = linha.substring(linha.indexOf('|') + 1);
				String gender =  linha.substring(0, linha.indexOf('|'));
				linha = linha.substring(linha.indexOf('|') + 1);
				String occupation = linha.substring(0, linha.indexOf('|'));
				String zipCode = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					
					
				User user = new User(Integer.parseInt(id), Integer.parseInt(age), gender,
							occupation, zipCode);
				users.add(user); 
			
			}
			in.close();
		} catch (IOException e)
		{
			
		}
	}
	
	public void readMovie(Collection<Movie> movies, Collection<Data> data)
	{
		String filePath = new File("").getAbsolutePath();
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(filePath + nameFileMovie));
			String linha;
			while (in.ready()) 
			{
				
				int []gen = new int[19];
							
				linha = in.readLine();
				String movieId = linha.substring(0, linha.indexOf('|'));
				linha = linha.substring(linha.indexOf('|') + 1);
				String movieTitleTemp = linha.substring(0, linha.indexOf('('));
				String movieTitle = movieTitleTemp.substring(0, movieTitleTemp.length() -1);
				linha = linha.substring(linha.indexOf('(') + 1);
				String releaseDate =  linha.substring(0, linha.indexOf(')'));
				linha = linha.substring(linha.indexOf('|') + 1);
				String videoReleaseDate = linha.substring(0, linha.indexOf('|'));
				linha = linha.substring(linha.indexOf('|') + 1);
				String no = linha.substring(0, linha.indexOf('|'));
				linha = linha.substring(linha.indexOf('|') + 1);
				String imdbUrl = linha.substring(0, linha.indexOf('|'));
					
										
				for(int i = 0; i < 18; i++)
				{
					linha = linha.substring(linha.indexOf('|') + 1);
					String genere = linha.substring(0, linha.indexOf('|'));
					gen[i] = Integer.parseInt(genere);
				}
				String g = linha.substring(linha.indexOf('|') + 1);
				gen[18] = Integer.parseInt(g);
				Genre genere = new Genre(gen);
				Movie movie = new Movie(movieId, movieTitle,releaseDate,
						videoReleaseDate, imdbUrl, genere, data);
				movies.add(movie);
			}
			in.close();
		} catch (IOException e)
		{
			
		}
	}
	
	public void readData(Collection<Data> datas)
	{
		String filePath = new File("").getAbsolutePath();
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(filePath + nameFileData));
			String linha;
			while (in.ready()) 
			{		
				linha = in.readLine();
				String[] line = linha.split("	");  
				
				String userId = line[0];
				String itemId = line[1];
				String rating = line[2];
				String timesTamp = line[3];
				
				Data data = new Data(userId, itemId, rating, timesTamp);
				datas.add(data);
			}
			in.close();
		} catch (IOException e)
		{
			
		}
	}
	
}
