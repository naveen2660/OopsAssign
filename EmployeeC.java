package oops;
public class EmployeeC {
	public static void main(String[] args) {
		
		Employee N1 = new Employee(1251,"Naveen",35000);
		System.out.println("Salary is "+N1.getSalary());
		
		Manager M1 = new Manager(1252,"Sai",15000,1000);
		Labour L1 = new Labour(1253,"Venkata",35000,5);
		System.out.println("M1 Salary is "+M1.getSalary());
		System.out.println("L1 Salary is "+L1.getSalary());
		
		System.out.println("Total Salary of all employee: "+(N1.getSalary()+ M1.getSalary()+ L1.getSalary()));
		
		
	}
	
}

class Employee{
    int Empid;
    String name;
    private double salary;

    public double getSalary()
    {
        return salary;
    }
    public Employee(int empid,String name,double salary)
    {
        this.Empid=empid;
        this.name=name;
        this.salary=salary;
    }
}

class Manager extends Employee{
    private int incentive;

    public Manager(int empid, String name, double salary, int incentive) {
        super(empid, name, salary);
        this.incentive=incentive;
    }

    public double getSalary()              
    {
        double tSalary;
        tSalary=super.getSalary()+incentive;
        return tSalary;
    }

}

class Labour extends Employee{
    private  int overtime;

    public Labour(int empid, String name, double salary,int ot) {
        super(empid, name, salary);
        this.overtime=ot;
    }

    public double getSalary()  {                
        double tSalary;
        tSalary=super.getSalary()+(overtime*100);
        return tSalary;
    }
}
