
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mynum=5;
		String truth="Ketaki is great!";
		System.out.println(mynum + " is the value stored in mynum variable. ");
		System.out.println(truth);
		//Arrays
		int[] arr = {10,20,30,40,50};
		System.out.println(arr[0]);
		//for loop
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String[] quote = {" I"," love"," my"," family."};
		for (int i=0;i<quote.length;i++)
		
		{
			System.out.println(quote[i]);
		}
		
		for (String word :quote)
		{
			System.out.println(word);
			
		}
	}
}
	


