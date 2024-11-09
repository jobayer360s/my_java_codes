public class Start 
{
	public static void main(String[] args)
	{
		Employee obj1 = new Employee();
		obj1.setAge(20);
		obj1.setName("Arif");
		obj1.setMass(10.10);
		obj1.setJoiningDate("1/11/2023");
		obj1.setSalary(20000);
		obj1.showInfo();
		System.out.println();
		
		Employee obj2 = new Employee(25, "Sakib", 12, "31/10/2023", 25000);
		obj2.showInfo();
	}
}