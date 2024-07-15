package javanotes;

public class InsatanceVaraibaleEmp {
	public String name;
	public double salary;

	public void Emp(String empname) {

		name = empname;
		System.out.println("raj");
		
		System.out.println("raj");
		System.out.println("raj");
	}

	public void setSalary(double Empsal) {
		salary = Empsal;
	}

	public void PrintEmp() {
		System.out.println("name:" + name);
		System.out.println("salary:" + salary);

	}
	public static void main(String args[]) {
		InsatanceVaraibaleEmp one=new InsatanceVaraibaleEmp();
		one.setSalary(5000);
		
		one.Emp("jam");
		one.PrintEmp();
	}
}
