package collectionframework;
import java.util.*;
public class ProductMain {
	private Scanner sc;
	private List<Product> productList;
	
	public ProductMain() {
		sc=new Scanner(System.in);
		productList=new ArrayList<>();
	}
	public void insertProduct() {
		System.out.println("Enter number of products which u want to have: ");
		int numOfProducts=sc.nextInt();
		for(int i=0;i<numOfProducts;i++) {
			Product p=new Product();
			
			System.out.println("Enter Product id: ");
			p.setProductId(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Enter product Name: ");
			p.setProductName(sc.nextLine());
			
			System.out.println("Enter product Quantity: ");
			p.setQuantity(sc.nextInt());
			
			System.out.println("Enter product Price: ");
			p.setPrice(sc.nextInt());
			
			productList.add(p);
		}
	}
	public void display() {
		 if (productList.isEmpty()) {
	            System.out.println("No products available.");
	            return;
	        }
	        for (Product p : productList) {
	            System.out.println("\nProduct ID: " + p.getProductId());
	            System.out.println("Product Name: " + p.getProductName());
	            System.out.println("Product Quantity: " + p.getQuantity());
	            System.out.println("Product Price: " + p.getPrice());
	        }
	}
	
	public void update() {
		System.out.println("Enter product id which you want to update:");
		int id=sc.nextInt();
		for(Product p:productList) {
			if(p.getProductId()==id) {
				System.out.println("Enter new price:");
				p.setPrice(sc.nextDouble());
				break;
			}
		}
	}
	
	public void delete() {
		System.out.println("Enter the product which u want to delete:");
		int id=sc.nextInt();
		for(Product p:productList) {
			if(p.getProductId()==id) {
				productList.remove(p);
				break;
			}
		
		}
	}
	public void findByProductName() {
		System.out.println("Enter the product which you want to search:");
		String name=sc.nextLine();
		for(Product p:productList) {
			if(p.getProductName().equals(name)) {
				System.out.println("Product is in the list!!");
				break;
			}else {
				System.out.println("Product not found");
			}
		}
	}
	public void findTotalPrice() {
		System.out.println(" total amount spent on Products:");
		int total=0;
		for(Product p:productList) {
			total+=p.getPrice();
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		ProductMain pmain=new ProductMain();
		pmain.insertProduct();
		//pmain.display();
		//pmain.update();
		//pmain.display();
		//pmain.delete();
		pmain.findByProductName();
		pmain.findTotalPrice();
		pmain.display();
	}
}
