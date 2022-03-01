package week1;

public class Mobile {
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendMessage();
		obj.makeCall();
		obj.saveContact();		
	}
	
	public void sendMessage() {
		String msg="Assignment completed";
		System.out.println(msg);
	}
	private void makeCall() 
	{
		int mobileno=1234567891;
		System.out.println(mobileno);
	}
	void saveContact() {
		String name="Aruna";
		int mobileno=1234567891;
		System.out.println(name);
		System.out.println(mobileno);
		
	}
	
	}
	
