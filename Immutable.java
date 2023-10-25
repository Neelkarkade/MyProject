package string;

public class Immutable {
	private final int age;
	private final String name;
	public Immutable(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Immutable im=new Immutable("Neel",16);
		System.out.println("Your name is : "+im.getName());
		System.out.println("Your age is : "+im.getAge());
	}

}
