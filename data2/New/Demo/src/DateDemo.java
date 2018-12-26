import java.time.LocalDate;
import java.time.Period;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate ld= LocalDate.now();
System.out.println(ld);


LocalDate dob=LocalDate.of(1996,10 ,15);
Period p=dob.until(ld);
System.out.println(p.getYears());



	}

}
