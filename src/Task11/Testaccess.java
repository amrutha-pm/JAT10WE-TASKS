package Task11;

public class Testaccess extends AccessmodifiersTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class variables can be accessed through Inheritance by extending the class
		//private instances and static variables cannot be accessed

		//System.out.println(pubvar);
		System.out.println(defaultvar);
		//System.out.println(privvar);
		System.out.println(protvar);

		AccessmodifiersTest obja=new AccessmodifiersTest();

		//System.out.println(obja.publicvar);
		System.out.println(AccessmodifiersTest.defaultvari);
		//System.out.println(obja.privatevar);
		System.out.println(AccessmodifiersTest.protectedvari);
		Testaccess objt=new Testaccess();
	}

}
