package oops;

interface tvremote
{
	public void samsung();
}
interface smarttv
{
	public void falcon();
}
class SMARTTVa implements smarttv
{

	@Override
	public void falcon() {
	System.out.println("");
		
	}

	
	
}
public class interfacepgms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
smarttv ob=new SMARTTVa();
ob.falcon();





	}

}
