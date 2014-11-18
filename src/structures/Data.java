package structures;

public class Data {
    //dados do filme cruzados com os usuarios, e os ratings
	private String userId;
	private String itemId;
	private String rating;
	private String timesTamp;
	
	public Data(String userId, String itemId, String rating, String timesTamp)
	{
		this.userId = userId;
		this.itemId = itemId;
		this.rating = rating;
		this.timesTamp = timesTamp;
	}
	
	public String getUserId(){return this.userId;}
	public String getItemId(){return this.itemId;}
	public String getRating(){return this.rating;}
	public String getTimesTamp(){return this.timesTamp;}
}
