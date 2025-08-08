public class NegArraySize
{
 	public static void main(String[] args)
	{
 		try
		{
 			int[] array = new int[-5];
 		}
		catch (NegativeArraySizeException nase)
		{
 			System.out.println(nase);
			System.out.println("Array size should be positive");
 		}
 	}
}