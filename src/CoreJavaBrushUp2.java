import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {10,15,20,25,30,35,40,45,50};
		for (int i=0;i<arr2.length;i++)
		{
			if (arr2[i]%3==0)
				System.out.println(arr2[i]);
			else
				System.out.println(arr2[i] + " is not a multiple of 3"); 
			
		}
		
		ArrayList<String> family = new ArrayList<String>();
		family.add("Ketaki");
		family.add("Kedar");
		family.add("Aarohee");
		family.add("Pumpy");
		//System.out.println(family);
		//System.out.println(family.get(3));
		//for (int i=0;i<family.size();i++)
		//{
			//System.out.println(family.get(i));
		//}
		for (String s:family)
		{
			System.out.println(s);
		}
		System.out.println(family.contains("Aarohee"));
		
		//List<Dimensions> arr2List = Arrays.asList(arr2);
		List<int[]> arr2ArrayList=Arrays.asList(arr2);
		
	}
	

}
