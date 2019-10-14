class A
{
	int	x=2;
	{
		System.out.println("value of class A of x is "+x);
	}

	
}
class B extends A
{
	int y;
	int x=1;
	{
		System.out.println("value of class B of x is "+x);
	}
	B(int p,int q,int r)
	{
		int y;
		System.out.println("value of class B of x is "+x);
		super.x=10;
		System.out.println("value of class B of x is "+super.x);
		System.out.println("value of class B of x is "+x);
		r=p+q; 
		System.out.println("value of class B of x is "+r);
	}
	int m1()
	{
		return y;
	}

}
class C extends B
{
	C(int p,int q)
	{

	}

};

class Const
{
	public static void main(String[] args)
	{
		A a =new A();
		B b=null;
		b=new B(5,6,0);
		System.out.println("value of class yis"+b.m1() );
		b.m1();
		//C c=new C(5,5);
		
	}
}