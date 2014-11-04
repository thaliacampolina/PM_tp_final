import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

public class Open {
	private String nameFileUser;
	private String nameFileData;
	private String nameFileMovie;
	private String nameFileGenere;
	
	
	
	public Open(String nameFileUser, String nameFileData,
			String nameFileMovie, String nameFileGenere)
	{
		this.nameFileUser = nameFileUser;
		this.nameFileData = nameFileData;
		this.nameFileMovie = nameFileMovie;
		this.nameFileGenere = nameFileGenere;
	}
	
	public void readUsers(Collection<User> users)
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(this.nameFileUser));
			String linha;
			while (in.ready()) 
			{
				linha = in.readLine();
				while(linha != null)
				{
					String id = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					String age = linha.substring(0, linha.indexOf('|'));
					String gender = linha.substring(linha.indexOf('|') + 1, linha.lastIndexOf('|'));
					String occupation = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					String zipCode = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					
					User user = new User(Integer.parseInt(id), Integer.parseInt(age),Integer.parseInt(gender),
							Integer.parseInt(occupation), Integer.parseInt(zipCode));
					users.add(user);
				}
			}
			in.close();
		} catch (IOException e)
		{
			
		}
	}
	
	public void readMovie(Collection<Movie> movies)
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(this.nameFileMovie));
			String linha;
			while (in.ready()) 
			{
				linha = in.readLine();
				while(linha != null)
				{
					int []gen = new int[19];
					String movieId = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					String movieTitle = linha.substring(0, linha.indexOf('|'));
					String releaseDate = linha.substring(linha.indexOf('|') + 1, linha.lastIndexOf('|'));
					String videoReleaseDate = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					String imdbUrl = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					for(int i = 0; i < 19; i++)
					{
						String genere = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
						gen[i] = Integer.parseInt(genere);
					}
					
					Genere genere = new Genere(gen);
					
					Movie movie = new Movie(Integer.parseInt(movieId), movieTitle,
							Integer.parseInt(releaseDate), Integer.parseInt(videoReleaseDate),
							Integer.parseInt(imdbUrl), genere);
					
					movies.add(movie);
				}
			}
			in.close();
		} catch (IOException e)
		{
			
		}
	}
	
	public void readData(Collection<Data> datas)
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader(this.nameFileData));
			String linha;
			while (in.ready()) 
			{
				linha = in.readLine();
				while(linha != null)
				{
					String userId = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					String itemId = linha.substring(0, linha.indexOf('|'));
					String rating = linha.substring(linha.indexOf('|') + 1, linha.lastIndexOf('|'));
					String timesTamp = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					
					Data data = new Data(Integer.parseInt(userId), Integer.parseInt(itemId),
							Integer.parseInt(rating), Integer.parseInt(timesTamp));
					datas.add(data);
				}
			}
			in.close();
		} catch (IOException e)
		{
			
		}
	}
	
}
