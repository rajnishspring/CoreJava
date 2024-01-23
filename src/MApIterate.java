import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MApIterate {
public static void main(String[] args) {
	Map<String, String> books = new LinkedHashMap<>();
    books.put(
    "1", "Aesign patterns : elements of reusable object-oriented software");
    books.put(
      "2", "Fava 8 in Action: Lambdas, Streams, and functional-style programming");
    books.put("3", "Bffective Java");
    books.put("4", "Effective Java: Second Edition");
    //books.entrySet().stream().forEach(e->System.out.println(  e.getKey()+" "+e.getValue()));
    List<String> l1=books.entrySet().stream().filter(x-> (x.getKey().equals("9"))).map(ar->ar.getValue()).collect(Collectors.toList());
  
    if(l1.isEmpty())
    {
    	l1.add("Not Found");
    }
    System.err.println(l1);
    List<String> l=books.entrySet().stream().sorted((ar2,ar)->ar.getValue().compareTo(ar2.getValue())).map(ar->ar.getValue()).collect(Collectors.toList());
   System.err.println(l); 
   //[Aesign patterns : elements of reusable object-oriented software, Bffective Java, Effective Java: Second Edition, Fava 8 in Action: Lambdas, Streams, and functional-style programming]
books.entrySet().forEach(System.out::println);
   
   String  n="name=sumitsrivastav";

System.out.println(n.split("=")[1]);
System.out.println(n.split("=")[1]);

//books.entrySet().sort((a,b)->a.get)
}

public static void main(Integer args) {
}
}

