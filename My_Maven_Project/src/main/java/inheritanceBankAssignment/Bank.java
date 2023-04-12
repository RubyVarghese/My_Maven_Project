package inheritanceBankAssignment;

public class Bank extends BankUser {
	
	public void checkPinValidity()
	{
		if(getPin() ==1001||getPin()==1234)
		{
			System.out.println("Welcome to your account");
		}
		else if(getPin()==1212)
		{
			System.out.println("Welcome to your account");
		}
		else
		{
			System.out.println("Invalid pin");
		}
		
	}
	
}
