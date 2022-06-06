package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(5.6);
		
		
		AreaCirc a2 = new AreaCirc(10);
			
		System.out.println(a1.area());
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
