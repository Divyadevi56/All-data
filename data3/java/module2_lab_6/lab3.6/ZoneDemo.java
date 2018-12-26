package assignment;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String zn=new String();
		System.out.println("Enter time zone(Europe/Paris)");
		zn=s.nextLine();
		ZonedDateTime pl=ZonedDateTime.now(ZoneId.of(zn));
		System.out.println(pl);

	}

}
