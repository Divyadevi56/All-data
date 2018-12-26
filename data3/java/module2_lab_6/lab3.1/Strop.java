import java.util.Scanner;

public class Strop {

	
	void conc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String s2=s.concat(s);
        System.out.println(s2);
	}
	
	
	void replace()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		  {
				char c=s.charAt(i);
			if(i%2!=0)
			{
				System.out.print("#");
			}
			else 
			{
		System.out.print(c);
			}
		}
	}
	
	
	void duplicate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		String s3=new String();
		for(int i=0;i<s.length();i++)
		  {
			  for(int j=1;j<s.length();j++)
			  {
				  if(s.charAt(i)!=s.charAt(j))
				  {
					  char ch1=s.charAt(i);
					  if(ch1!=' ')
			                s3 = s3 + ch1;
					  s=s.replace(ch1,' ');
				  }
			  }
		  }
		  System.out.println(s3);
	}
	
	
	void odd()
	{
		String st="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(i%2!=0)
			{
				
				char c1=Character.toUpperCase(c);
				 st=st+c1;
			}
			else {
				st=st+c;
			}
			                       
		}
		System.out.println(st);
	}
	
}
