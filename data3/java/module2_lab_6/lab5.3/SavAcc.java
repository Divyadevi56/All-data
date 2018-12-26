package assignment;


	

	public class SavAcc extends Account
	{
		final static long minBalance=500;
	    
	    public SavAcc(double balance,Person accHolder){
	        super(minBalance, balance,accHolder);
	    }
	    
	    public void withdraw(double money)
	    {
	     if((super.getBalance()-money)>minBalance)   
	         super.withdraw(money);
	     else
	         System.out.println("enter lesser amount");
	    }
	    
	}

