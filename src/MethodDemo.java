
public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum());
		MethodDemo g = new MethodDemo();
		g.getGreetings();

	}
	
	public static int getSum() 
	{
		int i=100;
		int j=200;
		int sum;
		sum = i+j;
		return sum;
		
	}
	
	public void getGreetings()
	{
		System.out.println("Ketaki, you are a strong woman!");
	}

}
