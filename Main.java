import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
                Methods M = new Methods();
				Scanner sc=new Scanner(System.in);
				int f=0,i=0,ch=0;
				while(ch!=999)
				{
			    System.out.println("\n********EMPLOYEE MENU********");
			    System.out.println("1.Register New Employee");
				System.out.println("2.Login for Existing Employee");
			    System.out.println("3.Exit");
			    System.out.println("\nEnter your choice(1-3):");                       
				ch=sc.nextInt();
				switch(ch)                                                        
					{	case 1:M.regNewEmp();
							   break;
						case 2:M.loginEmp();
							   break;
						case 3:ch = 999;
							return;
						default:System.out.println("Invalid CHOICE!!!");
								break;
					}
			}				
				
			}
}
