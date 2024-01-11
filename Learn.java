package Association;

public class Learn {
	private String name;
	private int rollno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Learn(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public Learn() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Learn l=new Learn();
		l.setName("Neel");
		System.err.println(l.getName());

	}

}
