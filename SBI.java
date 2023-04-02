package raghul;
import java.util.*;

public interface SBI {
	void data();
}

 class HDFC extends login implements SBI {
	 static String password;
	  static String name;
	  static String balance;
	 
	 public void m1()
	 {	
		 HashMap<Integer,String[]> list1= new HashMap<Integer,String[]>();
			list1.put(101,new String[]{"Raghul123","Raghul Sir","175671"});
			list1.put(102,new String[]{"Sheeraz123","Sheeraz Sir","155971"});
			list1.put(103,new String[]{"Pradeep123","Pradeep Sir","70561"});
			list1.put(104,new String[]{"Salman123","Salman Sir","205671"});
			list1.put(105,new String[]{"Kenny123","Kenny Anthony","30"});
			System.out.println("enter account number");
			Scanner sc=new Scanner(System.in);
			int acc=sc.nextInt();
			int count=0;
			for(Map.Entry m: list1.entrySet())
			{
				Integer num=(Integer)m.getKey();
				if(acc==num)
				{
					count++;
					int count2=0;
				for(String s:list1.get(num))
				{
					count2++;
					if(count2==1)
					{
						this.password=s;	
					}
					else if(count2==2)
					{
						this.name=s;
					}
					else
					{
						this.balance=s;
					}
					
				}
				}
			}
			if(count>0)
			{
				System.out.println("The account found");
			}
			else
			{
			throw new NullPointerException("Invalid account");	
			}
	 }
	 @Override
	public void data(){
		System.out.println("Welcome to HDFC");
		 m1();
	}
 }
	
  class AXIS extends login implements SBI {
	  static String password;
	  static String name;
	  static String balance;
	  
	  public void m1()
		 {
			HashMap<Integer,String[]> list1=new HashMap<Integer,String[]>();
			list1.put(6,new String[] {"tiger123","tiger","175671"});
			list1.put(7,new String[] {"lion123","lion","155971"});
			list1.put(8,new String[] {"cheetha123","cheetha","70561"});
			list1.put(9,new String[] {"panther123","panther","205671"});
			list1.put(10,new String[] {"liger123","liger","30"});
			System.out.println("enter account number");
			Scanner sc=new Scanner(System.in);
			int acc=sc.nextInt();
			int count=0;
			for(Map.Entry m: list1.entrySet())
			{
				Integer num=(Integer)m.getKey();
				if(acc==num)
				{
					count++;
					int count2=0;
				for(String s:list1.get(num))
				{
					count2++;
					if(count2==1)
					{
					this.password=s;	
					}
					else if(count2==2)
					{
						this.name=s;
					}
					else
					{
						this.balance=s;
					}
					
				}
				}
			}
			if(count>0)
			{
				System.out.println("The account found");
			}
			else
			{
			throw new NullPointerException("Invalid account");	
			}
		 }
	  @Override
	public void data() {
		System.out.println("Welcome to AXIS");
		m1();
			}
}
