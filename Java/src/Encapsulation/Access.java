package Encapsulation;

public class Access {
//	public String name;
//	public int id;
//	public String gender;
	private String name;
	private int id;
	private String gender;
	public Access(String name,int id,String gender)
	{
		this.name=name;
		this.id=id;
		this.gender=gender;
	}
	public void print()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(gender);
	}
	
	//Public 
	//Private
	//Protected
}
