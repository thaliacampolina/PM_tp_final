package structures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

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
		//System.out.println("entrou rearusers");
		try
		{
			//System.out.println("this.nameFileUser = "+this.nameFileUser);
			//System.out.println("antes buffer read");
			//BufferedReader in = new BufferedReader(new FileReader("u.user"));
			BufferedReader in = new BufferedReader(new FileReader(filePath + nameFileUser));
			//System.out.println("depois buffer read");
			String linha;
			//System.out.println("oi");
			while (in.ready()) 
			{
				linha = in.readLine();
				//System.out.println("linha = "+linha);
				String id = linha.substring(0, linha.indexOf('|'));
				//System.out.println("id = "+id);
				linha = linha.substring(linha.indexOf('|') + 1);
				//System.out.println("linha = "+linha);
				String age = linha.substring(0, linha.indexOf('|'));
				//System.out.println("age = "+age);
				linha = linha.substring(linha.indexOf('|') + 1);
				//System.out.println("linha = "+linha);
				//linha = linha.substring(linha.indexOf('|') + 1, linha.lastIndexOf('|'));
				String gender =  linha.substring(0, linha.indexOf('|'));
				//System.out.println("gender = "+gender);
				linha = linha.substring(linha.indexOf('|') + 1);
				//System.out.println("linha = "+linha);
				String occupation = linha.substring(0, linha.indexOf('|'));
				//System.out.println("occupation = "+occupation);
				String zipCode = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
					
				//System.out.println("zipCode = "+zipCode);
					
				User user = new User(Integer.parseInt(id), Integer.parseInt(age), gender,
							occupation, zipCode);
				//System.out.println("declarou");
				users.add(user); 
				//System.out.println("adicionou");
			
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
			//BufferedReader in = new BufferedReader(new FileReader(this.nameFileMovie));
			BufferedReader in = new BufferedReader(new FileReader(filePath + nameFileMovie));
			String linha;
			while (in.ready()) 
			{
				//linha = in.readLine();
				
				int []gen = new int[19];
							
				linha = in.readLine();
				//System.out.println("linha = "+linha);
				String movieId = linha.substring(0, linha.indexOf('|'));
				//System.out.print("movieId = "+movieId);
				linha = linha.substring(linha.indexOf('|') + 1);
				//System.out.println("linha = "+linha);
				String movieTitleTemp = linha.substring(0, linha.indexOf('('));
				String movieTitle = movieTitleTemp.substring(0, movieTitleTemp.length() -1);
				//System.out.print("   movieTitle = "+movieTitle);
				linha = linha.substring(linha.indexOf('(') + 1);
				//System.out.println("linha = "+linha);
				//linha = linha.substring(linha.indexOf('|') + 1, linha.lastIndexOf('|'));
				String releaseDate =  linha.substring(0, linha.indexOf(')'));
				//System.out.print("   releaseDate = "+releaseDate);
				linha = linha.substring(linha.indexOf('|') + 1);
				//System.out.println("linha = "+linha);
				String videoReleaseDate = linha.substring(0, linha.indexOf('|'));
				//System.out.println("   videoReleaseDate = "+videoReleaseDate);
				linha = linha.substring(linha.indexOf('|') + 1);
				//System.out.println("linha = "+linha);
				String no = linha.substring(0, linha.indexOf('|'));
				//System.out.println("no = "+no);
				linha = linha.substring(linha.indexOf('|') + 1);
				//System.out.println("linha = "+linha);
				String imdbUrl = linha.substring(0, linha.indexOf('|'));
					
				//System.out.println("imdbUrl = "+imdbUrl);
										
				for(int i = 0; i < 18; i++)
				{
					//System.out.println("i = "+i);
					linha = linha.substring(linha.indexOf('|') + 1);
					//System.out.println("linha = "+linha);
					String genere = linha.substring(0, linha.indexOf('|'));
					//System.out.println("genere = "+genere);
					gen[i] = Integer.parseInt(genere);
				}
				String g = linha.substring(linha.indexOf('|') + 1);
				gen[18] = Integer.parseInt(g);
				//System.out.println("saiu for");
				Genre genere = new Genre(gen);
				//System.out.println("declarou");
				Movie movie = new Movie(movieId, movieTitle,releaseDate,
						videoReleaseDate, imdbUrl, genere, data);
				//System.out.println("instanciou");
				movies.add(movie);
				//System.out.println("adicionou");
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
			//BufferedReader in = new BufferedReader(new FileReader(this.nameFileData));
			String linha;
			while (in.ready()) 
			{		
				//debug
				linha = in.readLine();
				String[] line = linha.split("	");  
				//System.out.print("line[0] = "+line[0]);
				//System.out.print("	line[1] = "+line[1]);
				//System.out.print("	line[2] = "+line[2]);
				//System.out.println("	line[3] = "+line[3]);
				//fim debug
				
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
