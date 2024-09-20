package Task10;

public class TeaClass {
	String Tea;
	String Hotwater;
	String TeaLeaves;
	String Milk;
	String sugar;
	public void prepareTea()
	{
		Tea=Hotwater+TeaLeaves;
		System.out.println("A method that preapres a basic tea with hot water and tea leaves");
	}
	public void addMilk()
	{
		Tea=Tea+Milk;
		System.out.println("A method that adds milk to the basic Tea");
	}
	public void addSugar()
	{
		Tea=Tea+sugar;
		System.out.println("A method that adds sugar to the basic Tea");
	}
	public static void main(String[] args) {


		// TODO Auto-generated method stub
		TeaClass objT=new TeaClass();
		objT.prepareTea();
		objT.addMilk();
		objT.addSugar();
	}

}
