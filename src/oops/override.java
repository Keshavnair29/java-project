package oops;

class car
{
	public void accelarator()
	{
		System.out.println("accelerator");
	}
}
class BMW extends car
{

	@Override
	public void accelarator() {
	
		super.accelarator();
		System.out.println("bmw accelerator");
	}
	
}

public class override {

	public static void main(String[] args) {
		BMW ob=new BMW();
		ob.accelarator();
		
	

	}

}
