
public class Movie {
	 private String movieId;
	 private String movieTitle;
	 private String releaseDate;
	 private String videoReleaseDate;
	 private String imdbUrl;
	 private Genre genre;
	
	 
	 public Movie(String movieId, String movieTitle, String releaseDate, String videoReleaseDate,
	  String imdbUrl, Genre genre)
	 {
		 this.movieId = movieId;
		 this.movieTitle = movieTitle;
		 this.releaseDate = releaseDate;
		 this.videoReleaseDate = videoReleaseDate;
		 this.imdbUrl = imdbUrl;
		 this.genre = genre;		 
	 }
	 
	 public String getMovieId(){return this.movieId;}
	 public String getMovieTitle(){return this.movieTitle;}
	 public String getReleaseDate(){return this.releaseDate;}
	 public String getVideoReleaseDate(){return this.videoReleaseDate;}
	 public String getImdbUrl(){return this.imdbUrl;}
	 public Genre getGenre(){return this.genre;}
}