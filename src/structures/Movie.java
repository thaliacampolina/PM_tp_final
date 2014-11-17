package structures;

import java.util.ArrayList;
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

     public ArrayList<String> getAllGenres() {
         ArrayList<String> arr = new ArrayList<String>();
         if (this.genre.getUnknown() == 1) { arr.add("unknown"); }
         if (this.genre.getAction() == 1) { arr.add("action"); }
         if (this.genre.getAdventure() == 1) { arr.add("adventure"); }
         if (this.genre.getAnimation() == 1) { arr.add("animation"); }
         if (this.genre.getChildrens() == 1) { arr.add("children\'s"); }
         if (this.genre.getComedy() == 1) { arr.add("comedy"); }
         if (this.genre.getCrime() == 1) { arr.add("crime"); }
         if (this.genre.getDocumentary() == 1) { arr.add("documentary"); }
         if (this.genre.getDrama() == 1) { arr.add("drama"); }
         if (this.genre.getFantasy() == 1) { arr.add("fatasy"); }
         if (this.genre.getFilmNoir() == 1) { arr.add("film noir"); }
         if (this.genre.getHorror() == 1) { arr.add("horror"); }
         if (this.genre.getMusical() == 1) { arr.add("musical"); }
         if (this.genre.getMystery() == 1) { arr.add("mistery"); }
         if (this.genre.getRomance() == 1) { arr.add("romance"); }
         if (this.genre.getSciFi() == 1) { arr.add("sci fi"); }
         if (this.genre.getThriller() == 1) { arr.add("thriller"); }
         if (this.genre.getWar() == 1) { arr.add("war"); }
         if (this.genre.getWestern() == 1) { arr.add("western"); }
         return arr;

     }

	 
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
