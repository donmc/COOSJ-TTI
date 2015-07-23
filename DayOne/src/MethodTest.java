
public class MethodTest {
	

	public static double otherMethod(double y,int z)
	{
		System.out.println("Foo");
		System.out.println(y);
		return y * z;
	}
	
	public static void main(String[] args)
	{
		int x = 900;
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		double product = otherMethod(x,500);
		System.out.println("D");
		System.out.println("E");		
	}//end main
	

}//end class
