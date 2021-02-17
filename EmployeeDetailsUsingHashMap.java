import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class EmployeeDetailsUsingHashMap
{
	Scanner scan= new Scanner(System.in);
	HashMap map= new HashMap();
	public static void main(String[] args) {
		EmployeeDetailsUsingHashMap emp= new EmployeeDetailsUsingHashMap();
		emp.getMenu();
	}

	void getMenu()
	{   
		int ch=0;
		
		while(true)
		{
			
		System.out.println("Enter the employee details");
		System.out.println("Display all employees");
		System.out.println("Update a particular employee");
		System.out.println("Delete an employye details");
		System.out.println("Exit\n");
		System.out.println("Enter a choice");
	    int choice= scan.nextInt();
	    displayChoice(choice);
	   
	   }

	}

	void displayChoice(int choice)
	{
       switch(choice)
       {
            case 1: 
                  getEmployeeDetails();
                  break;
            case 2:
                 displayEmployeeDetails();
                 break;
            case 3:
                  updateEmployeeDetails();
                  break; 
            case 4:  
                  deleteEmployee();
                  break;        
                  
            case 5:
                  System.out.println("Exiting");
                  System.exit(0);
                  break;
       }
	}

	void getEmployeeDetails()
	{
	   
	   System.out.println("Enter 3 employee details");
	   for(int i=0;i<3;i++)
	   {
       System.out.println("Enter the employee code");
       int code= scan.nextInt();
       scan.nextLine();
       System.out.println("Enter the employee name");
       String name= scan.nextLine();
       System.out.println("Enter the employee address");
       String address= scan.nextLine();
       map.put(code, new Employee(code,name,address));
      }

	}

	  void displayEmployeeDetails()
	 {
       java.util.Set set= map.entrySet();
       for(Object value:set)
       {
         Map.Entry m=(Map.Entry)value;
         Employee employee= (Employee) m.getValue();
         System.out.println(employee.getCode()+" " + employee.getName()+ " " + employee.getAddress());
       }
	 }

	 void updateEmployeeDetails()
	 {
	 	System.out.println("Enter the employee code to be updated");
       int code= scan.nextInt();
       System.out.println("Enter the employee name");
       String name= scan.nextLine();
       System.out.println("Enter the employee address");
       String address= scan.nextLine();
        map.put(code, new Employee(code,name,address));
        Employee updatedEmployee= (Employee) map.get(code);
        System.out.println(updatedEmployee.getCode()+" " + updatedEmployee.getName()+ " " + updatedEmployee.getAddress());

	 }

	 void deleteEmployee()
	 {
	 	System.out.println("Enter the employee code to be deleted");
       int code= scan.nextInt();
       map.remove(code);
       java.util.Set set= map.entrySet();
       for(Object value:set)
       {
         Map.Entry m=(Map.Entry)value;
         Employee employee= (Employee) m.getValue();
         System.out.println( employee.getName()+ " " + employee.getAddress());
       }
	 }


}

class Employee
{
   private int code;
	private String name;
	private String address;
	

    public Employee(int code, String name, String address)
    {
    	this.code=code;
    	this.name=name;
    	this.address=address;
        
    }
    public int getCode()
	{
		return this.code;
	}

	public String getName()
	{
		return this.name;
	}

	public String getAddress()
	{
		return this.address;
	}



}