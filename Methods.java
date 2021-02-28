import java.util.Scanner;
public class Methods extends Emp{
	String lid[]=new String[99];
	String pass[]=new String[99];
	int emid[]=new int[99];
	String name[]=new String[99];
	String dept[]=new String[99];
	String desig[]=new String[99];
	String sal[]=new String[99];
	String dob[]=new String[99];
	int age[]=new int[99];
	int n=0,j=0;
	Scanner sc=new Scanner(System.in);
	void regNewEmp()
	{	int i,flag=0;
		int idt;
		System.out.print("Enter Employee ID: ");
		idt=sc.nextInt();
		for(i=0;i<n;i++)
		{  
			if(idt == emid[i]) 
			{
				flag=1;
		   	}
			else 
			{ 
				flag = 0;
			}	
		}
		if(flag==1)
			{	
				System.out.print("Employee with ID "+idt+" already registered. Cannot register Again!!\n");
			}
			else
			{	System.out.println("****Enter details of New Employee****\n");
				System.out.println("Enter Login ID:");
				lid[n]=sc.next();
				System.out.println("Enter Password:");
				pass[n]=sc.next();
				emid[n]=idt;
				System.out.println("Enter Name:");
				name[n]=sc.next();
				System.out.println("Enter Department:");
				dept[n]=sc.next();
				System.out.println("Enter Designation:");
				desig[n]=sc.next();
				System.out.println("Enter Salary:");
				sal[n]=sc.next();
				System.out.println("Enter DOB:");
				dob[n]=sc.next();
				System.out.println("Enter Age:");
				age[n]=sc.nextInt();
				System.out.println("\nEmployee Registered Successfully!!!\n");
				System.out.println("********NEW EMPLOYEE DETAILS********");
	        		System.out.println("\n....EMPLOYEE #"+(n+1)+"....");
	            		System.out.println("ID:"+emid[n]+"\nName:"+name[n]+"\nDepartment:"+dept[n]+"\nDesignation:"+desig[i]);
            			System.out.println("Salary:"+sal[n]+"\nDOB:"+dob[n]+"\nAge:"+age[n]+"\n");
            			n++;
			}	
	}
	void modEmp()
	{	int ch,i=0,j=0,k=0;
		int idt;
		System.out.println("\n********MODIFY EMPLOYEE BY EMP NO.********");
		System.out.println("Enter Employee ID to be modified:");
		idt=sc.nextInt();
		while(i<n)
		{	if(emid[i] == idt)
			{	j=i;
				k=1;
				break;
			}
			i++;
		}
		if(k==1)
		{	System.out.print("\nEnter option what you want to modify:\n1. Name\n2. Department\n3. Designation\n4. Salary\n5. DOB\n6. Age\nYour choice:");	
			ch = sc.nextInt();
			switch(ch)
			{	case 1:	System.out.print("\nEnter the Name: ");
						String name_i = sc.next();
						name[j] = name_i;
						break;
				case 2: System.out.print("\nEnter the Department: ");
						String dep_i = sc.next();
						dept[j] = dep_i;
						break;
				case 3:	System.out.print("\nEnter the Designation: ");
						String des_i = sc.next();
						desig[j] = des_i;
						break;
				case 4:	System.out.print("\nEnter the Salary: ");
						String sal_i = sc.next();
						sal[j] = sal_i;
						break;
				case 5:System.out.println("\nEnter DOB:");
						String db=sc.next();
						dob[j]=db;
						break;
				case 6:System.out.println("\nEnter Age:");
						int ag=sc.nextInt();
						age[j]=ag;
						break;
				default:System.out.print("Enter a valid option");
						break;
			}
		}
		else
			System.out.println("\nEmployee NOT Found, TRY AGAIN!!!");

	}
	void loginEmp()										//Employee Login
	{	String id,ps;
		Scanner sc=new Scanner(System.in);
		int i=0,f=0;
		System.out.println("********EMPLOYEE LOGIN********");
		System.out.println("Enter Login ID:");
		id=sc.next();
		System.out.println("Enter Password:");
		ps=sc.next();
		while(i<n)
		{	
			if(id.equals(lid[i]))
			{	
				if(ps.equals(pass[i]))
				{	
					f=1;
					break;
				}
			}
				i++;
		}
		if(f==1) {
			int ch=0;
				System.out.println("\nLogin Successful");
				while(ch!=999)
				{
				System.out.println("1.Modify Employee Details");
				System.out.println("2.Delete Employee Details");
				System.out.println("3.View Employee Details");
				System.out.println("4.View Employee Details Horizontally");
				System.out.println("5.Search Employee by Employee No.");
				System.out.println("6.Search Employee by Employee Name");
				System.out.println("7.Exit");
				System.out.println("\nEnter your choice(1-7)");
				ch=sc.nextInt();
				switch(ch)
				{  
					case 1:modEmp();
			          		break;
	           		case 2:delEmp();
			          		return;
	           		case 3:viewEmp();
			          		break;
	         	 	case 4:viewEmpHori();
			          		break;
	                case 5:searchEmpById();
			          		break;
	            	case 6:searchEmpByName();
			                break;
	            	case 7:ch = 999;
					return;
	            			default:System.out.println("Invalid CHOICE!!!");
			           		break;
             	}
		}				
		}
		else
			System.out.println("\nLogin Failed, Invalid Username/Password!!!");
			
	}
	void searchEmpById()								//Search by ID
	{	int id;
		int i=0,j=0,k=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("********SEARCH EMPLOYEE BY EMP NO.********");
		System.out.println("Enter Employee ID to be searched:");
		id=sc.nextInt();
		while(i<n)
		{	if(emid[i] == id)
			{	j=i;
				k=1;
				break;
			}
			i++;
		}
		if(k==1)
		{	System.out.println("\nEmployee Found!!!");
			System.out.println("\nEmployee ID:"+emid[j]+"\tEmployee Name:"+name[j]+"\tEmployee Dept:"+dept[j]+"\tEmployee Designation:"+desig[j]);
			System.out.println("\nEmployee Salary:"+sal[j]+"\tEmployee DOB:"+dob[j]+"\tEmployee Age:"+age[j]);
		}
		else
			System.out.println("\nEmployee NOT Found, TRY AGAIN!!!");
	}
	void searchEmpByName()								//Search by Name
	{	String nm;
		int i=0,j=0,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("********SEARCH EMPLOYEE BY EMP NAME********");
		System.out.println("Enter Employee Name to be searched:");
		nm=sc.nextLine();
		while(i<n)
		{	if(name[i].equals(nm))
			{	j=i;
				k=1;
				break;
			}
			i++;
		}
		if(k==1)
		{	System.out.println("\nEmployee Found!!!");
			System.out.println("\nEmployee ID:"+emid[j]+"\tEmployee Name:"+name[j]+"\tEmployee Dept:"+dept[j]+"\tEmployee Designation:"+desig[j]);
			System.out.println("\nEmployee Salary:"+sal[j]+"\tEmployee DOB:"+dob[j]+"\tEmployee Age:"+age[j]+"\n");
		}
		else
			System.out.println("\nEmployee NOT Found, TRY AGAIN!!!");
	}
	void delEmp()										//Delete Employee
	{	int i=0,j=0,k=0;
		int id;
		System.out.println("********DELETE EMPLOYEE********");
		System.out.println("Enter Employee ID to be deleted:");
		id=sc.nextInt();
		while(i<n)
		{	if(id == emid[i])
			{	j=i;
				k=1;
				break;
			}
			i++;
		}
		if(k==1)
		{	System.out.println("\nEmployee FOUND!!!");
			n--;
			System.out.println("Employee with ID "+id+" successfully deleted.");
			return;
		}
		else
			System.out.println("\nEmployee NOT Found!!!");
		
	}
	void viewEmp()										//View Employee Details
	{	
	int i=0;
        System.out.println("********COMPLETE EMPLOYEE DETAILS********");
        while(i<n)
        {   System.out.println("\n....EMPLOYEE #"+(i+1)+"....");
            System.out.println("ID:"+emid[i]+"\nName:"+name[i]+"\nDepartment:"+dept[i]+"\nDesignation:"+desig[i]);
            System.out.println("Salary:"+sal[i]+"\nDOB:"+dob[i]+"\nAge:"+age[i]+"\n");
            i++;
        }
	}
	void viewEmpHori()									//View Employee Details Horizontally
	{	
		int i=0;
        System.out.println("********COMPLETE EMPLOYEE DETAILS********");
        while(i<n)
        {   System.out.println("\n....EMPLOYEE #"+(i+1)+"....");
            System.out.println("ID:"+emid[i]+"\tName:"+name[i]+"\tDepartment: "+dept[i]+"\tDesignation: "+desig[i]+"\tSalary: "+sal[i]+"\tDOB: "+dob[i]+"\tAge: "+age[i]+"\tSalary:"+sal[i]+"\tDOB:"+dob[i]+"\tAge:"+age[i]+"\n");
            i++;
        }		
    }
	
}