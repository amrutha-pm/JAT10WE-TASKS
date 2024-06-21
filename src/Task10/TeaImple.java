package Task10;

 public class TeaImple {
	
		 public String Prepairtea(){
		        return "prepairing the basictea"; 
		    }
		    
		}
	public class Blacktea3 extends TeaImple {
		   // @Override
		    public String Prepairtea() {
		        return"Prepairing the blacktea";
		    }
		    
		}
		public class Greentea3 extends TeaImple {
		  //  @Override
		    public String Prepairtea() {
		        return "prepairing the greentea";
		    }
		    
		}
		public class Herbaltea3 extends TeaImple {
		  //  @Override
		    public String Prepairtea() {
		        return "prepairing the herbaltea";
		    }
		 public static void main(String[] args) {
		        

		TeaImple [] teaarray=new TeaImple[4];
		teaarray[0]=new TeaImple();
		System.out.println(teaarray[0].Prepairtea());
		
		teaarray[1]=new Blacktea3();
		System.out.println(teaarray[1].Prepairtea());

		teaarray[2]=new Greentea3();
		System.out.println(teaarray[2].Prepairtea());

		teaarray[3]=new Herbaltea3();
		System.out.println(teaarray[3].Prepairtea());
		    }
		}
		

