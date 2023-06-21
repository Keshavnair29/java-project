package oops;
interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();
}
interface creditcard
{
	public void creditcarddetails();
}
class SBI implements Bank,creditcard
{

	@Override
	public void creditcarddetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
	
		
	
	}
	
}

public class interfacepgms {

	public static void main(String[] args) {



	}
Bank ob =new SBI();



}
