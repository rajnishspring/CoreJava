
 
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
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
public class ComparatorS{  
    public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
          
        //Adding Products  
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(3,"Keyboard",300f));  
        list.add(new Product(2,"Dell Mouse",150f));  
        list.add(new Product(3,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");  
      List c=  list.stream().sorted((p1,p2)->{  
        return p2.name.compareTo(p1.name);  
        }).collect(Collectors.toList());
        System.err.println(c);
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        });  
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
  list.forEach(System.err::print);
 Map<String, List<Product>> m= list.stream().collect(Collectors.groupingBy(Product::getName));
 System.out.println();
 System.out.println(m);
 Map<String, Long> m1= list.stream().filter(name->name.getName().equals("Dell Mouse")).collect(Collectors.groupingBy(Product::getName,Collectors.counting()));
 System.out.println(list.stream().filter(name->name.getName().equals("Dell Mouse")).collect(Collectors.groupingBy(Product::getName,Collectors.counting())).values());
System.out.println(m1);
List ll= list.stream().filter(name->name.getName().equals("Dell Mouse")).collect(Collectors.toList());
System.err.println(ll.toString());
    }  
}  