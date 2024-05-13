package OOPs;

public class Third {
	public int a;
	public int b;
	public double c;
//	public byte d;
	public boolean e;
	public String str;
	public Third(int a,int b,double c,boolean e,String str)
	{
		this.a=a;
		this.b=b;
		this.c=c;
//		this.d=d;
		this.e=e;
		this.str=str;
	}
	public void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(d);
		System.out.println(e);
		System.out.println(str);
	}
	public static void main(String[] args)
	{
		Third third=new Third(10,20,30.2,true,"Hello cuties");
		third.print();
//		third.a=10;
//		third.print();
	}
}
