 public class Employee extends Person {
	 private String joiningDate;
     private double salary;
	 
	 Employee(){}
     Employee(int age, String name, double mass, String joiningDate, double salary)
	 {
		 super(age, name, mass);
		 this.joiningDate = joiningDate;
		 this.salary = salary;
	 }
	 
	 public void setJoiningDate(String date){
		 this.joiningDate = date;
	 }
      
	 public void setSalary(double salary){
		 this.salary = salary;
	 }
    public String getJoiningDate(){
		return this.joiningDate;
	}
    public double getSalary(){
		return this.salary;
	}

   public double weightCalculate()//calculate and returns the weight where w = mg
   {
	   double weight = super.getMass()*9.8;
	   return weight;
   }   
   public double annualSalary() //calculate and returns the yearly salary
   {
	   double as = 12*this.getSalary();
	   return as;
   }
   public void showInfo() //print all the information along with weight and annual salary
   {
	   super.showInfo();
	   System.out.println("Joining Date is "+getJoiningDate());
	   System.out.println("Salary is "+getSalary());
	   System.out.println("Weight is "+weightCalculate());
	   System.out.println("Annual salary is "+annualSalary());
   }
	 
 }
