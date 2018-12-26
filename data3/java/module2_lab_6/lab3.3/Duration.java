
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

	public class Duration {

		public static void main(String[] args) {
			
			
			String in=new String();
			Scanner s=new Scanner(System.in);
			
			System.out.println("enter date");
	          in=s.nextLine();
			
			LocalDate enteredDate=LocalDate.parse(in);
			
			
		
			LocalDate ld=LocalDate.now();
			Period p=enteredDate.until(ld);
			System.out.println(p.getDays());
			System.out.println(p.getMonths());
			System.out.println(p.getYears());
			
			s.close();
		}

	}


