
public class Movie {
	 private int movieId;
	 private String movieTitle;
	 private int releaseDate;
	 private int videoReleaseDate;
	 private int imdbUrl;
	 private Genere genere;
	
	 
	 public Movie(int movieId, String movieTitle, int releaseDate, int videoReleaseDate,
	  int imdbUrl, Genere genere)
	 {
		 this.movieId = movieId;
		 this.movieTitle = movieTitle;
		 this.releaseDate = releaseDate;
		 this.videoReleaseDate = videoReleaseDate;
		 this.imdbUrl = imdbUrl;
		 this.genere = genere;		 
	 }
}
