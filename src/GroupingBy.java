import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	public Product1() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	} 
	
    
}
public class GroupingBy {
public static void main(String[] args) {
	   List<Product1> list=new ArrayList<Product1>();  
       
       //Adding Products  
       list.add(new Product1(1,"HP Laptop",25000f));  
       list.add(new Product1(3,"Keyboard",300f));  
       list.add(new Product1(2,"Keyboard",150f));
      Map<String,Integer> map1   =list.stream().collect(Collectors.groupingBy(Product1::getName,Collectors.summingInt(Product1::getId)));
      System.err.println(map1);
       Map<String, List<Product1>> map   =list.stream().collect(Collectors.groupingBy(Product1::getName));
      System.out.println(map);
}
}
