package Task10;
//Q1)create a class called "person" with attributes "name",and "age"

public class PersonQuest1   //1)create a class with "person" name
{
 
	String name;            //2)Defining attributed for the class "person"
	int age;
	            
	                        //3)create constructor with parameters
PersonQuest1(String name,int age)   //constructor must have the same name as the class name within which it is defined
{
	this.name=name;        //4)this keyword is used to mention the class attribute name and age
	this.age=age;
		
}
	                       
//5)Now create getter methods for the attributes,to return string and int
	
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub

	PersonQuest1 objP = new PersonQuest1("Amrutha",29);
	 objP.getName();
	 objP.getAge();
	 System.out.println(objP.getName());
	 System.out.println(objP.getAge());
	}

}
