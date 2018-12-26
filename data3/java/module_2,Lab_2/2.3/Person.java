
public class Person {
	private String firstName;
	private String secondName;
	private  String gender;
	int age;

Person(String firstName,String secondName, String gender, int age){
    this.firstName = firstName;
    this.secondName =secondName;
    this.gender = gender;
    this.age = age;
}
Person()
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

}
