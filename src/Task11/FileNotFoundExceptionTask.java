package Task11;
import java.io.FileReader;
public class FileNotFoundExceptionTask {

		    public static void main(String[] args) throws Exception {

		       try {
		        FileReader ask= new FileReader("D:\\MY doc certificate");
		    }
		       catch (java.io.FileNotFoundException e)
		       {
		        e.printStackTrace();
		        System.out.println("handling file not found exception");
		        System.out.println(e.getMessage());
		        System.out.println(e.getClass());

		    }

		    }
		}

