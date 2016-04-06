
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		double x= 5;
		double y= 2;
		System.out.println("X är: " + x + "\n" + "Y är: " + y);
		System.out.println("Plus: " + calc.add(x,y));
		System.out.println("Minus: " + calc.sub(x,y));
		System.out.println("Gånger: " + calc.mult(x, y));
		System.out.println("Delad: " + calc.div(x,y));
	}

}
