import java.lang.*;

public class Student{
	
	
	private int id ;
    private String name; 
    private double cgpa ;
	
	public void setId(int a){
		   id = a;
	      }
	
	public void setName(String nm)
	      {
		   name = nm;
	          }
	 public void setCgpa(double cg)
	    {
		cgpa = cg; 
	    }
		
		public int getId(){
		   return id;
	      }
	
	public String getName()
	      {
		   return name;
	          }
	 public double getCgpa()
	    {
		return cgpa; 
	    }
	
	
	public static void main(String []args)
	{
		Student s1 = new Student();
		s1.setCgpa(3.98);
		s1.setId(50647);
		s1.setName("Jobayer");
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCgpa());
	}
	
}