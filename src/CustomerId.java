import java.util.Date;

public class  CustomerId
{
private int id;
private final Date date;

public CustomerId(int id,Date date)
{
this.id=id;
this.date=new Date(date.getTime());

}



public Date getDate()
{
return new Date(date.getTime()) ;
}

public int getId()
{
return id;

}
public static void main(String[] args) {
	CustomerId customer =new CustomerId(1,new Date());
	System.out.println(customer.getDate());
	customer.getDate().setTime(13);
	System.out.print(customer.getDate());
	
}

}

