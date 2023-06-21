package oops;
abstract class car{
	abstract public void speedlimit();
	public void careengine()
	{
		System.out.println("car engine");
	}
	}
	class Maruti extends car
	{

		@Override
		public void speedlimit() {
		
			
		}

		@Override
		public void careengine() {
			// TODO Auto-generated method stub
			super.careengine();
		}
		
	}
class BMW extends car
{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		
	}
	



}


public class Abstraction {

	public static void main(String[] args) {
Maruti ob=new Maruti();
ob.careengine();

	}
}
