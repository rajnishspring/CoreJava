import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Customer
{
	int id;
	String name;
	boolean discount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDiscount() {
		return discount;
	}
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}
	public Customer(int id, String name, boolean discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", discount=" + discount + "]";
	}
	
}

public class FlatMapCase {
public static void main(String[] args) {
	Customer customer=new Customer(0, "12", false);
	Customer customer1=new Customer(0, "13", false);
	Customer customer2=new Customer(0, "16", false);
	Customer customer11=new Customer(14, "60", false);
	Customer customer12=new Customer(17, "70", false);
	Customer customer13=new Customer(0, "80", true);
	List<Customer> list=new ArrayList<>();
	list.add(customer2);
	list.add(customer1);
	list.add(customer);
	List<Customer> list1=new ArrayList<>();
	list1.add(customer11);
	list1.add(customer13);
	list1.add(customer12);
	List<List<Customer>> l=new ArrayList<>();
	l.add(list);
	l.add(list1);
	for(List ls: l) {
		System.out.println("List Data ::"+ls.toString());
		
	}
	//System.out.println(l.forEach(m->m.stream().filter(n->n.getId()>60).collect(Collectors.toList())));;
	List<Customer> l2=l.stream().flatMap(l1->l1.stream()).collect(Collectors.toList()).stream().filter(c->c.getId()>16).collect(Collectors.toList());
	System.out.println(l2.size());
	List<Customer> l3=l.stream().flatMap(l1->l1.stream().filter(b->b.getId()>13)).collect(Collectors.toList());
			System.out.println(l3.size()+" "+l3);
		new Thread(	()->
			{}).start();
}
}
