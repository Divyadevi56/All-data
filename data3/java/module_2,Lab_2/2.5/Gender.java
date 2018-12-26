

public class Gender {
	private String firstName;
	private String secondName;
	private  String gender;
	int age;
	int phno;

Gender(String firstName,String secondName, String gender, int age,int phno){
    this.firstName = firstName;
    this.secondName =secondName;
    this.gender = gender;
    this.age = age;
    this.phno= phno;
}
Gender()
{
	
}

public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getSecondName() {
	return secondName;
}


public void setSecondName(String secondName) {
	this.secondName = secondName;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}

public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
void demo(String a,String b,char c,int age,int phno)
{
	System.out.println("Person Details");
	System.out.println("----------------------");
	System.out.println("First Name :"+" "+a);
	System.out.println("Last Name :"+" "+b);
	System.out.println("Gender is"+Gen.F);
	System.out.println("Age:\t"+age);
	System.out.println("Phno is\t"+phno);
}

}

