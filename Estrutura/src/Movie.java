
public class Movie {
	 private int movieId;
	 private String movieTitle;
	 private int releaseDate;
	 private int videoReleaseDate;
	 private int imdbUrl;
	 private Genre genre;
	
	 
	 public Movie(int movieId, String movieTitle, int releaseDate, int videoReleaseDate,
	  int imdbUrl, Genre genere)
	 {
		 this.movieId = movieId;
		 this.movieTitle = movieTitle;
		 this.releaseDate = releaseDate;
		 this.videoReleaseDate = videoReleaseDate;
		 this.imdbUrl = imdbUrl;
		 this.genre = genere;		 
	 }
}