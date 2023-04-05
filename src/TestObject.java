class Test
{
	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}

public class TestObject {

	public static void main(String[] args) {
		//classname objectname=new classname();
		   Test xyz=new Test();  // allocate memory 
		   xyz.add();
		System.out.println("Hi from main");

	}

}
