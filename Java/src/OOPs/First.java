package OOPs;
public class First {
	public int a=10;
	public int b=20;
	public int add()
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		First first=new First();
		System.out.println(first.add());
	}
}
