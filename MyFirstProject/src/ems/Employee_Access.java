package ems;

public class Employee_Access 
{
    public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEid(5);
		emp.setEname("Sai");
		emp.setEsalary(5464.45f);
		emp.setEdept("IT");
		
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getEsalary());
		System.out.println(emp.getEdept());
			
	}
    
}
