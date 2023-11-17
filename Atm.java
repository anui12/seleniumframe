import java.util.Scanner;
class Atm 
{
	public static void main(String[] args) 
	{
		
		
		
		System.out.println("hello world");
		System.out.println("Pull from github to eclipse")
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
        String name=sc.nextLine();
		System.out.println("enter account number");
		int accountNumber=sc.nextInt();//100
		System.out.println("enter amount which u should deposit while opening bank");
		double balance=sc.nextDouble();//500
		System.out.println("enter pswd");
		int pswd=sc.nextInt();
		for(;;)
		{
			System.out.println("1.withdraw");
			System.out.println("2.deposit");
			System.out.println("3.check balance");
			System.out.println("4.pin change");
			System.out.println("5.exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("enter accountNUmber");
				
					if(sc.nextInt()==accountNumber)
					{
						System.out.println("enter pswd");
						
						if(sc.nextInt()==pswd)
						{
							System.out.println("enter money");
							double amount=sc.nextDouble();//1000
							if(amount<=balance)
							{
							    balance=balance-amount;
								System.out.println("collect cash");
							}
							else
							{
								System.out.println("insufficient balance");
							}

						}
						else
						{
							System.out.println("invalid pswd");
						}

					}
					else
					{
						System.out.println("account number is invalid");
					}

					break;
				}
				case 2:
				{
					System.out.println("enter account number");
					if(sc.nextInt()== accountNumber)
					{
						System.out.println("enter money");
						 balance+=sc.nextDouble();
						 System.out.println("money credited");
					}
					else
					{
						System.out.println("invalid account number");
					}
					

					break;
				}
				case 3:
				{
					System.out.println("enter account number");
					if(sc.nextInt()==accountNumber)
					{
						if(sc.nextInt()==pswd)
						{
							System.out.println(balance);
						}
						else
						{
							System.out.println("invalid pswd");
						}
					}
					else
					{
						System.out.println("account number invalid");
					}
					break;
				}
				case 4:
				{
					System.out.println("enter account number");
					if(sc.nextInt()==accountNumber)
					{
						System.out.println("enter current pswd");
						if(sc.nextInt()==pswd)
						{
							System.out.println("etner new password");
							int newPswd=sc.nextInt();
							System.out.println("re enter pswd");
							int reEnter=sc.nextInt();
							if(newPswd==reEnter)
							{
								pswd=newPswd;
								System.out.println("password is updated");
							}
							else
							{
								System.out.println("please enter valid password");
							}
						}
						else
						{
							System.out.println("invalid password");
						}
					}
					else
					{
						System.out.println("invalid account number");
					}
					break;
				}
				case 5:
				{
					System.exit(10);
				}

			}
		}
		
	}
}
