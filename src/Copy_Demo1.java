
public class Copy_Demo1 {
	public static void main(String[] args) {
		
		Car sonata=new Car();
		sonata.price=2500000;
		
		Car matiz=new Car();
		matiz.price=sonata.price;
		
		System.out.println();
		
	}
}

class Car{

	int price;
	String colors;

}