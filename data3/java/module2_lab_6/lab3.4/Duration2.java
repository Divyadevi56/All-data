import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Duration2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in=new String();
		String out=new String();
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter date");
          in=s.nextLine();
          System.out.println("enter another date");
          out=s.nextLine();
		
		LocalDate enteredDate=LocalDate.parse(in);
		LocalDate enteredDate1=LocalDate.parse(out);
		
		//System.out.println("Entered Date:"+enteredDate);
	
		//LocalDate ld=LocalDate.now();
		Period p=enteredDate.until(enteredDate1);
		
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
	}

}
