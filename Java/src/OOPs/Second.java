package OOPs;

public class Second {
	public int a=10;
	public int b=20;
	public int c=30;
	public int add(String str)
	{
		System.out.println(str);
		return a+b;
	}
	public int add()
	{
		return a+c;
	}
	public static void main(String[] args)
	{
		Second second=new Second();
		System.out.println(second.add());
		System.out.println(second.add("Method Overloading or Complie time polymorphism"));
	}
}
