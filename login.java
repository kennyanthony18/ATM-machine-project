package raghul;
import java.util.*;

public class login{
static SBI s1;

public static void accno()
{
	System.out.println("choose the Bank which you belong to");
	System.out.println("enter 1 to choose HDFC");
	System.out.println("enter 2 to choose AXIS");
	Scanner sc=new Scanner(System.in);
	int no1=sc.nextInt();
	
	switch(no1)
	{
	case 1:jen1();
	break;
	case 2: jen2();
	break;
	default:System.out.println("Enter the Correct number");
	login.accno();
	}
}
static void jen1()
{
	Scanner sc=new Scanner(System.in);
	s1=new HDFC();
	s1.data();
	System.out.println("enter the password");
	String gg=sc.nextLine();
	if(gg.equals(HDFC.password))
	{
		System.out.println("Welcome "+HDFC.name);
		System.out.println("Current balance-"+HDFC.balance);
	}
	else
	{
		throw new NullPointerException("Wrong password");
	}
	
	int kkk=Integer.parseInt(HDFC.balance);
	while(kkk >0)
	{
	System.out.println("Enter the amount to be withdrawed");
	int kk=sc.nextInt();
	if(kk < kkk)
	{
		kkk=kkk-kk;
		System.out.println("the amount withdrawed is "+kk);
		System.out.println("the balance is "+kkk);
		System.out.println("enter 1 to withdraw more");
		System.out.println("enter any thing else to end");
		int jj=sc.nextInt();
		if(jj!=1)
		{
			try {
		Thread.sleep(3000);
		login.accno();
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	}
}



static void jen2()
{
	Scanner sc=new Scanner(System.in);
	 s1=new AXIS();
		s1.data();
		System.out.println("enter the password");
		String gg=sc.nextLine();
		if(gg.equals(AXIS.password))
		{
			System.out.println("Welcome "+AXIS.name);
			System.out.println("Current balance-"+AXIS.balance);
		}
		else
		{
			throw new NullPointerException("Wrong password");
		}
		
		int kkk=Integer.parseInt(AXIS.balance);
		while(kkk >0)
		{
		System.out.println("Enter the amount to be withdrawed");
		int kk=sc.nextInt();
		if(kk < kkk)
		{
			kkk=kkk-kk;
			System.out.println("the amount withdrawed is "+kk);
			System.out.println("the balance is "+kkk);
			System.out.println("enter 1 to withdraw more");
			System.out.println("enter any thing else to end");
			int jj=sc.nextInt();
			if(jj!=1)
			{
				try {
			Thread.sleep(3000);
			login.accno();
			    	}
				catch(InterruptedException e)
				{
				}
			}
		}
		}
		throw new NullPointerException("Insufficient Balance");
}
}
