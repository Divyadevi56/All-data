package assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		String in=new String();
		String out=new String();
		Scanner s=new Scanner(System.in);
		System.out.println("enter product purchase date");
        in=s.nextLine();
		
		//DateTimeFormatter formatter=DateTimeFormatter.ofPattern("DD/MM/yyyy");
		LocalDate pd=LocalDate.parse(in);
		
		
          System.out.println("enter months of warrantee date");
         int month=s.nextInt();
          System.out.println("enter year of warrantee date");
          int year=s.nextInt();
          
  		//LocalDate dd=LocalDate.parse(out, formatter1);
  		LocalDate expiredate=pd.plusYears(year).plusMonths(month);
  		System.out.println(expiredate);
  		
          

	}

}

