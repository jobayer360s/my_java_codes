public class Start{
	
	public static void main(String [] args){
		Employee e1 = new Employee(15,"Shan jeet ", 18.88 ,"25 january 2023", 10000);
		e1.showInfo();
		
		Employee e2 = new Employee();
		e2.setName("Minhaz");
		e2.setAge(14);
		e2.setMass(19.5);
		e2.setJoiningDate("1 February 2023");
		e2.setSalary(1000);
		e2.showInfo();
	}
	
}