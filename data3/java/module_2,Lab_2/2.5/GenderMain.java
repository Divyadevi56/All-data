
public class GenderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender p=new Gender();
		p.demo("Divya","Bharathi",'f',22,996441345);
		
		
		Phone me = new Phone("Divya","Bharathi","f",20,1254578862);
	    System.out.println("Person Details");
		System.out.println("----------------------");
	    System.out.println("FirstName:" + me.getFirstName()); 
	    System.out.println("LastName:" + me.getSecondName());
	   // System.out.println("Gender:" + me.getGender());
	    System.out.println("Age:" + me.getAge());
	    System.out.println("phno:"+me.getPhno());
	    System.out.println("Gender is"+Gen.F);
	}

}
