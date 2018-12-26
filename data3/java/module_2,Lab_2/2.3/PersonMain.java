
public class PersonMain {

	public static void main(String[] args)              
	{
	    Person me = new Person("Divya","Bharathi","f",20);
	    System.out.println("Person Details");
		System.out.println("----------------------");
	    System.out.println("FirstName:" + me.getFirstName()); 
	    System.out.println("LastName:" + me.getSecondName());
	    System.out.println("Gender:" + me.getGender());
	    System.out.println("Age:" + me.getAge());
	}

}
