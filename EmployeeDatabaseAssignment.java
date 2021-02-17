 import java.util.Scanner;
 import java.util.HashSet;
 import java.util.Comparator;
 import java.util.Collections;
 import java.util.ArrayList;

 class EmployeeDatabaseAssignment{
 	Scanner scan= new Scanner(System.in);
 	ArrayList<EmployeeData> set = new ArrayList<EmployeeData>();
 	public static void main(String[] args) {
 		EmployeeDatabaseAssignment emp= new EmployeeDatabaseAssignment();
 		emp.getMenu();
 	}
 	void getMenu(){
 		int num=0;
 		 
 		while(true){
 		System.out.println("Enter \n1. To Enter Employee details\n2. Display\n3. Update\n 4.Delete\n 5.Sort by FirstName\n 6.Sort by LastName\n 7.Sort by address\n 8.Sort by Code \n9.Exit ");
 		
 		num= scan.nextInt();
 		scan.nextLine();
 		choice(num);
 		} 

 	}
 	void choice(int ch){

 		switch(ch){
 			case 1:employeeDetails(); break;
 			case 2: display(); break;
 			case 3: update(); break;
 			case 4: delete(); break;
 			case 5: Collections.sort((set), new SortByFirstName());display(); break;
 			case 6: Collections.sort(set, new SortByLastName()); display(); break;
 			case 7: Collections.sort(set, new SortByAddress());display(); break;
 			case 8: Collections.sort(set, new SortByCode()); display(); break;
 			case 9:  System.exit(0);	

 		}
 	}

 	void employeeDetails(){
 		System.out.println("Enter Name, Enter Address, Enter code");
 		set.add(new EmployeeData(scan.nextLine(), scan.nextLine(), scan.nextInt()));
 		scan.nextLine();
 	}
 	void display(){
 		System.out.println("List of Employees:");

		for (EmployeeData ref : set) {
			System.out.println(ref);
		}
	}
	void update(){
		System.out.println("Enter the ID to update");
		int id= scan.nextInt(); 
		boolean flag= false;
		scan.nextLine();

		System.out.println("Enter new Name, Address");
		for (EmployeeData ref : set) {
			if(ref.getCode()==id)
			{
				ref.setName(scan.nextLine());
				ref.setAddress(scan.nextLine());
				flag= true;
			}
		}
		if(flag==false)
			System.out.println(" ID number doesnt exist");

 	}
 	void delete(){
 		System.out.println("Enter the ID to delete");
		int id= scan.nextInt(); 
		boolean flag= false;
		scan.nextLine();
		// EmployeeData emp= new EmployeeData();
		for (EmployeeData ref : set) {
			if(ref.getCode()==id)
			{
			set.remove(ref);
			 flag=true;
			}
		}
		if(!flag)
			System.out.println("ID doesnt exist");

 	}
 	
}
class SortByCode implements Comparator<EmployeeData>{
	@Override
	public int compare(EmployeeData ref, EmployeeData secondRef){
		return ref.getCode().compareTo(secondRef.getCode());
	}
}

class SortByAddress implements Comparator<EmployeeData>{
	@Override
	public int compare(EmployeeData ref, EmployeeData secondRef){
		return ref.getAddress().compareTo(secondRef.getAddress());
	}
}
class SortByFirstName implements Comparator<EmployeeData>{
	@Override
	public int compare(EmployeeData ref, EmployeeData secondRef){
		String first=ref.getName();
 		String second=secondRef.getName();
 		String []fa= first.split(" ");
 		String []sa=second.split(" ");
 		first= fa[0];
 		second=sa[0];
 		return (first.compareTo(second));
	}
}
class SortByLastName implements Comparator<EmployeeData>{
	@Override
	public int compare(EmployeeData ref, EmployeeData secondRef){
		String first=ref.getName();
 		String second=secondRef.getName();
 		String []fa= first.split(" ");
 		String []sa=second.split(" ");
 		first= fa[1];
 		second=sa[1];
 		return (first.compareTo(second));

	}
}
class EmployeeData{ //implements Comparable{ (For TreeSet to perform sorting)
	private String name;
	private int code;
	private String address;

	EmployeeData(String name, String address, int code){
		this.name = name;
		this.address= address;
		this.code = code;
	}

	public void setName(String name){
	this.name=name;
		}
	public String getName(){
		return this.name;
	}
	public void setAddress(String address) {
	this.address=address;
		}
	public String getAddress(){
		return this.address;
	}
	public void setCode(int code) {
	this.code= code;
		}
	public Integer getCode(){
		return this.code;
	}
	@Override
	public String toString(){
		return "Employee [Name: " + this.getName() + ", Address:  " +this.getAddress()+ ", ID: " + this.getCode() + "]";
	}
	@Override
	public boolean equals(Object obj){
		if(this!= obj) return false;
		return this.getCode().equals(((EmployeeData)obj).getCode());
	}


	@Override
	public int hashCode(){
		return this.getCode();
	}

	// // @Override
	// public int compareTo(Object obj){
	// 	return 0;
	// } (When we use treeset)
}
