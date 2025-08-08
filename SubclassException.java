import java.io.*;
class Parent
{
 	void msg() throws Exception
	{
 		System.out.println("parent method");
 	}
}
 public class SubclassException extends Parent
{
 	void msg()throws Exception
	{
 		System.out.println("child method");
 	}
	public static void main(String args[])
	{
 		Parent p = new SubclassException();
 		try
		{
			p.msg();
		}
		catch(Exception e)
		{
		}
 	}
}