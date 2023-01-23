package myassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MYPRODUCT {
public static void main(String[] args) {
	
	List<Product> products =new ArrayList<Product>();
	products.add(new Product(1,"Books",60));
	products.add(new Product(2,"Bags",75));
	products.add(new Product(3,"Box",80));
	products.add(new Product(4,"Basket",85));
	products.add(new Product(5,"Table",100));
	
	System.out.println("Product with minimum price: "+
	products.stream().filter((product)->product.getPrice()==products.stream().map((p)->p.getPrice()).min((x,y)->x.compareTo(y)).get())
	.collect(Collectors.toList()));
	
	System.out.println("Product with maximum price: "+
			products.stream().filter((product)->product.getPrice()==products.stream().map((p)->p.getPrice()).max((x,y)->x.compareTo(y)).get())
			.collect(Collectors.toList()));
}

}