package crashcourse;

public class Returns {
	public Integer CollectAmount =1000;
	public Integer collectamountandgivemeto() {
		System.out.println("i have collected rupees"+ CollectAmount);
		return CollectAmount;
	}
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Returns myson=new Returns();
		Integer amount=myson.collectamountandgivemeto();
	    System.out.println("got it"+" "+amount);
		
	}	
 
}
