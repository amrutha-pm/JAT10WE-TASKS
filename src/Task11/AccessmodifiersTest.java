package Task11;

public class AccessmodifiersTest {

	/*Four types of access modifiers in java
	 *
	 * Default access modifier - no keyword required
	 * private                 - private is the keyword,case sensitive
	 * public                  - public is the keyword
	 * protected               - protected is the keyword
	 */

    /* Defining class variables
     * Defining four types here
     */

	public static String pubvar="This is public static string,Which will be implemented in method Testmethod";
	static String defaultvar="This is default static string,for static variable or method no need to create object ,we can directly call the method";
	private static String privvar="This is private static String,which is accesible only in that class,which cant be modified in other class";
	protected static String protvar="This is protected static string";


	/*Instance variable
	 * defining object variable
	 */

	public static String publicvar="This is public variable";
	static String defaultvari="This is default string";
	private static String privatevar="This is private string";
	protected static String protectedvari="This is protected string";


	public void testMethod()
	{
		System.out.println(pubvar);
		System.out.println(defaultvar);
		System.out.println(privvar);
		System.out.println(protvar);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pubvar);
		System.out.println(defaultvari);
		System.out.println(privvar);
		System.out.println(protvar);

		AccessmodifiersTest obja=new AccessmodifiersTest();


		System.out.println(AccessmodifiersTest.publicvar);
		System.out.println(AccessmodifiersTest.defaultvari);
		System.out.println(AccessmodifiersTest.privatevar);
		System.out.println(AccessmodifiersTest.protectedvari);

		obja.testMethod();

	}

}
