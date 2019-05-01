package javaBasics;

public class StaticConcept {

	static int i = 10;

	public static void func(int t) {

		i = t;
		System.out.println("i am in static function and i is " + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticConcept sc = new StaticConcept();
		StaticConcept sc1 = new StaticConcept();

		sc.func(20);
		sc1.func(40);
		System.out.println(sc.i);
		System.out.println(sc1.i);
		
		DataTypes.main(args);

	}

}
