import java.util.function.Function;

class Show
{
	public String show()
	{
		System.out.println( "thisi is show publiqc");;
		return "return public show";
	}
	public void show1(int a)
	{
		System.out.println( "thisi is show publiqc   zzzz---- "+a);;
		//return "return public show";
	}
}
@FunctionalInterface
interface MyInter
{
	void s();
}
@FunctionalInterface
interface MyInter1 
{
	void s(int i);
	
}

@FunctionalInterface
interface MyInter2 
{
	void s(Function<String,String> f);
	
}


public class MethodRefer {
	public static void main(String[] args) {
		
		MyInter1 m=(k)->{
			System.err.println("this is lambda "+k);
			};
		m.s(5);
		Show chow=new Show();
		MyInter1 mm=chow::show1;
	mm.s(30);
	}

}
