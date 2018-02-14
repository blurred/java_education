class Calc {
	int num1;
	int num2;
	int result;
	
	public int perform(int extra, int prod) { //local variable
		result = (num1 + num2 + extra)*prod;
		if(result>50)
			return 1;
		else 
			return 0;
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		
		Calc obj = new Calc();
		obj.num1 = 3;
		obj.num2 = 5;
		
		int k = obj.perform(2,3);
		System.out.println(k);
		
	}
}
