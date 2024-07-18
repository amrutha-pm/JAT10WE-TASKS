package Task11;

public class StackoverflowError {

	//i is calling recursively ,calItself methods stack overflow error occurs
	public static int calItself(int i) {
		if(i==2) {
			return i;
		}
		else
		{
			calItself(++i);
			return i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		calItself(i=3);
	
	}

}
