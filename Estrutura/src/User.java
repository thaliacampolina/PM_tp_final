
public class User {
	private int id;
	private int age;
	private String gender;
	private String occupation;
	private String zipCode;
	
	public int teste;
	
	public User(int id, int age, String gender, String occupation, String zipCode)
	{
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.occupation = occupation;
		this.zipCode = zipCode;
	}
	
	public int getId(){return this.id;}
	public int getAge(){return this.age;}
	public String getGender(){return this.gender;}
	public String getOccupation(){return this.occupation;}
	public String getZipCode(){return this.zipCode;}
}