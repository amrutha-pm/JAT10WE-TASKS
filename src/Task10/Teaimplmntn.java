package Task10;

  class Teaimplmntn {
	
		 public String Prepairtea(){
		        return "prepairing the basictea"; 
		    }
		    
		}
	 class Blacktea3 extends Teaimplmntn {
		   // @Override
		    public String Prepairtea() {
		        return"Prepairing the blacktea";
		    }
		    
		}
	 class Greentea3 extends Teaimplmntn {
		  //  @Override
		    public String Prepairtea() {
		        return "prepairing the greentea";
		    }
		    
		}
	 class Herbaltea3 extends Teaimplmntn {
		  //  @Override
		    public String Prepairtea() {
		        return "prepairing the herbaltea";
		    }}
	 public class Teaimplmntn{
		 public static void main(String[] args) {
		        

		Teaimplmntn [] teaarray=new Teaimplmntn[4];
		teaarray[0]=new Teaimplmntn();
		System.out.println(teaarray[0].Prepairtea());
		//System.out.println("prepairing the basictea");
		
		//teaarray[1]=new Blacktea3();
		//System.out.println(teaarray[1].Prepairtea());

		//teaarray[2]=new Greentea3();
		//System.out.println(teaarray[2].Prepairtea());

		//teaarray[3]=new Herbaltea3();
		//System.out.println(teaarray[3].Prepairtea());
		    }
		}
		

