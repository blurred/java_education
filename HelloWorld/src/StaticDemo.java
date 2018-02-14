class Emp {
	int eid;
	int salary;
	static String ceo;
	
	static {
		ceo = "Larry";
	}
	
	public Emp() {
		eid = 1;
		salary = 3000;
	}
	
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Emp navin = new Emp();
		
		
		Emp rahul = new Emp();
		
		
		navin.show();
		rahul.show();
		

	}

}
