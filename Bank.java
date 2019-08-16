package maccess;
import java.util.Scanner;
import p1.PinCheck;
import p4.*;
public class Bank //main class
{
public static void main(String[] args)
  {
	Scanner s=new Scanner(System.in); 
	int count=0;
	xyz:
		while(true)
		{
			System.out.println("Enter the pinNo:");
			String pinNo=s.nextLine();
			if(pinNo.length()==4)
			{
				PinCheck pc=new PinCheck();
				boolean k=pc.Verify(Integer.parseInt(pinNo));
				if(k)
				{
					System.out.println("CHOICE:");
					System.out.println("1.WithDraw\n2.Payment\n3.Deposit");
					int choice=Integer.parseInt(s.nextLine());
					switch(choice)
					{
					case 1: //WithDraw
						WithDraw wd=new WithDraw();
						System.out.println("Enter the amount");
						int a1=Integer.parseInt(s.nextLine());
						if(a1>0&&a1%100==0)
						{
							wd.process(a1);
						}//end of if
						else
						{
							System.out.println("Invalid amount");
						}
						break xyz;
					case 2: //Payment
						Payment p1=new Payment();
						System.out.println("Enter the amount");
						float a2=Float.parseFloat(s.nextLine());
						if(a2>0)
						{
							p1.process(a2);
						}//end of if
						else
						{
							System.out.println("Invalid amount");
						}
						break xyz;
					case 3: //Deposit
						Deposit d1=new Deposit();
						System.out.println("Enter the amount");
						int a3=Integer.parseInt(s.nextLine());
						if(a3>0&&a3%100==0)
						{
							d1.process(a3);
						}//end of if
						else
						{
							System.out.println("Invalid amount");
						}
						break xyz;
					default: System.out.println("Invalid amount");
					break xyz;
					}// end of switch
				}//end of if
				else
				{
					System.out.println("pinNo doesn't exist");
				}
				count++;
			}
			if(count==3)//simple if
			{
				System.out.println("Transaction Blocked");
				break xyz;
			}
		}//end of while
	s.close();
  }

}
