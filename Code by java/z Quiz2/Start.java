public class Start 
{
		static{
		System.out.println("Static block of Start ");
	}
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		 e1.setAge(29);
         e1.setName("Jamal Bhuiyan ");
         e1.setMass(68);
		 e1.setJoiningDate("25 January 2014");
         e1.setSalary(190000.65);
		 e1.showInfo();
		
		System.out.println();
		System.out.println("info of 2nd empouyee ");
		Employee e2 = new Employee(21, "Mursalin ", 62 , "23 DEcember 2022 ", 50500.65);
		e2.showInfo();
	
	}
}