public class C extends B 
{
	private int z;
	public C()
	{
		System.out.println("C");
	}
	public C(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
	}
	public void setZ(int z)
	{
		this.z = z;
	}
	public int getZ()
	{
		return z;
	}
	public void show()
	{
		super.show();
		System.out.println("Class C");
		System.out.println(z);
	}
}