import java.util.Scanner;

public class StrPositive {
	static boolean res=true;

	public static void main(String[] args) {
		
StrPositive st=new StrPositive();
st.sample();
if(res==false)
{
	System.out.println("negative");
}
else
{
	System.out.println("positive");
}

	}
	public boolean sample()
	{
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		for(int i=0;i<s.length()-1;i++)
		{
		char c=s.charAt(i);
		int ascii=(int)c;
		char ch=s.charAt(i+1);
		int asc=(int)ch;
		if(ascii>=asc)
		{
		res= false;
		}
		}
		return res;
	}
}
