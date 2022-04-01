package crashcourse;

public class BankAccount {
	
	Long accountNumber= 1234567890l;
	String name = "karthick";
	Integer accountBalance=250;
	public void MyAccountBalance() {
		System.out.println("my account balance"+accountBalance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount();
		account.MyAccountBalance();
	}
}
