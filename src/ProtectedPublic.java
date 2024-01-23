class Parent
{
	
	protected void show()
	{
		
	}
}
public class ProtectedPublic extends Parent {

	public void show()
	{
		System.out.println("show");
	}
	public static void main(String[] args) {
		Parent p =new ProtectedPublic();
		p.show();
	}
}
