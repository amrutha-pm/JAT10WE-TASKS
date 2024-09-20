package Task10;

public class CircleQuest3 {

	float radius;
	float result;   //declaring variables

	// default constructor

	public CircleQuest3()
	{

	}
	//Parameterized constructor
	public CircleQuest3(float radius)
	{
		this.radius=radius;
	}
	public void CercumferenceOfCircle()
	{
		result=(float) (2*3.14*(radius));
		System.out.println("Circumference of the circle is :" + result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CircleQuest3 objC=new CircleQuest3(10);
      objC.CercumferenceOfCircle();
      //System.out.println("Circumference of the circle is :" + objC.result);

	}

}
