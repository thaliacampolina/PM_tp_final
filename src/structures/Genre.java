package structures;

public class Genre {
    //cada filme pode ter mais de um tipo de genero
	 private int unknown;
	 private int action;
	 private int adventure;
	 private int animation;
	 private int childrens;
	 private int comedy;
	 private int crime;
	 private int documentary;
	 private int drama;
	 private int fantasy;
	 private int filmNoir;
	 private int horror;
	 private int musical;
	 private int mystery;
	 private int romance;
	 private int sciFi;
	 private int thriller;
	 private int war;
	 private int western;
	 
	 public Genre(int vectorGeneres[])
	 {
		 this.unknown = vectorGeneres[0];
		 this.action = vectorGeneres[1];
		 this.adventure = vectorGeneres[2];
		 this.animation = vectorGeneres[3];
		 this.childrens = vectorGeneres[4];
		 this.comedy = vectorGeneres[5];
		 this.crime = vectorGeneres[6];
		 this.documentary = vectorGeneres[7];
		 this.drama = vectorGeneres[8];
		 this.fantasy = vectorGeneres[9];
		 this.filmNoir = vectorGeneres[10];
		 this.horror = vectorGeneres[11];
		 this.musical = vectorGeneres[12];
		 this.mystery = vectorGeneres[13];
		 this.romance = vectorGeneres[14];
		 this.sciFi = vectorGeneres[15];
		 this.thriller = vectorGeneres[16];
		 this.war = vectorGeneres[17];
		 this.western = vectorGeneres[18];
	 }
	 
	 public int getUnknown(){return unknown;}
	 public int getAction(){return action;}
	 public int getAdventure(){return adventure;}
	 public int getAnimation(){return animation;}
	 public int getChildrens(){return childrens;}
	 public int getComedy(){return comedy;}
	 public int getCrime(){return crime;}
	 public int getDocumentary(){return documentary;}
	 public int getDrama(){return drama;}
	 public int getFantasy(){return fantasy;}
	 public int getFilmNoir(){return filmNoir;}
	 public int getHorror(){return horror;}
	 public int getMusical(){return musical;}
	 public int getMystery(){return mystery;}
	 public int getRomance(){return romance;}
	 public int getSciFi(){return sciFi;}
	 public int getThriller(){return thriller;}
	 public int getWar(){return war;}
	 public int getWestern(){return western;}
	 
	 public int discoverGenre(String nameGenre)
	 {
		 if(nameGenre.equals("unknown"))
		 {
			 return this.unknown;
		 }
		 else if(nameGenre.equals("action"))
		 {
			 return this.action;
		 }
		 else if(nameGenre.equals("adventure"))
		 {
			 return this.adventure;
		 }
		 else if(nameGenre.equals("animation"))
		 {
			 return this.animation;
		 }
		 else if(nameGenre.equals("childrens"))
		 {
			 return this.childrens;
		 }
		 else if(nameGenre.equals("comedy"))
		 {
			 return this.comedy;
		 }
		 else if(nameGenre.equals("crime"))
		 {
			 return this.crime;
		 }
		 else if(nameGenre.equals("documentary"))
		 {
			 return this.documentary;
		 }
		 else if(nameGenre.equals("drama"))
		 {
			 return this.drama;
		 }
		 else if(nameGenre.equals("fantasy"))
		 {
			 return this.fantasy;
		 }
		 else if(nameGenre.equals("filmNoir"))
		 {
			 return this.filmNoir;
		 }
		 else if(nameGenre.equals("horror"))
		 {
			 return this.horror;
		 }
		 else if(nameGenre.equals("musical"))
		 {
			 return this.musical;
		 }
		 else if(nameGenre.equals("mystery"))
		 {
			 return this.mystery;
		 }
		 else if(nameGenre.equals("romance"))
		 {
			 return this.romance;
		 }
		 else if(nameGenre.equals("sciFi"))
		 {
			 return this.sciFi;
		 }
		 else if(nameGenre.equals("thriller"))
		 {
			 return this.thriller;
		 }
		 else if(nameGenre.equals("war"))
		 {
			 return this.war;
		 }
		 else if(nameGenre.equals("western"))
		 {
			 return this.western;
		 }
		 else
		 {
			 System.err.println("Genero inexistente!!!! :(");
			 return 0;
		 }
	 }
	}
