import java.util.Scanner;

public class StrMain {
	public static void main(String args[])
	{
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add String to itself");
		System.out.println("2.Replace odd positions");
		System.out.println("3.Remove duplicates");
		System.out.println("4.Change odd characters to upper case");
		System.out.println("enter choice");
	    int ch=sc.nextInt();
	    Strop obj=new Strop();
		
		switch(ch)
		{
		case 1: obj.conc();
		        
		        break;
		case 2: obj.replace();
			    break;
		case 3: obj.duplicate();
			    break;
		case 4: obj.odd();
		        break;
			
		
	}

	}
}


