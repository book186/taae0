package chapter12;

public class TravelCustomer2 {
	
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer2(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "," + age + "," + price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
