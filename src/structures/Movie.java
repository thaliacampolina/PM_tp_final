package structures;

import java.util.Collection;


public class Movie {
	 private String movieId;
	 private String movieTitle;
	 private String releaseDate;
	 private String videoReleaseDate;
	 private String imdbUrl;
	 private Genre genre;
	 private String averengeNote;
	
	 
	 public Movie(String movieId, String movieTitle, String releaseDate, String videoReleaseDate,
	  String imdbUrl, Genre genre, Collection<Data> data)
	 {
		 this.movieId = movieId;
		 this.movieTitle = movieTitle;
		 this.releaseDate = releaseDate;
		 this.videoReleaseDate = videoReleaseDate;
		 this.imdbUrl = imdbUrl;
		 this.genre = genre;	
		 averageNoteUser(data);
	 }
	 
	 public String getMovieId(){return this.movieId;}
	 public String getMovieTitle(){return this.movieTitle;}
	 public String getReleaseDate(){return this.releaseDate;}
	 public String getVideoReleaseDate(){return this.videoReleaseDate;}
	 public String getImdbUrl(){return this.imdbUrl;}
	 public Genre getGenre(){return this.genre;}
	 public String getAverengeNote(){return this.averengeNote;}
	 
	public void averageNoteUser(Collection<Data> data)
	{
		 int note = 0, numRating = 0;
		for(Data d : data)
		{
			if(d.getItemId().equals(this.movieId))
			{
				numRating++;
				note = note + Integer.parseInt(d.getRating());
			}
		}
		this.averengeNote = String.valueOf(note/numRating);
	}
}