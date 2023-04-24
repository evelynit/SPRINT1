package exercici1;

public class Main {

	public static void main(String[] args) {
		NoGenericMethods objects = new NoGenericMethods("a","b","c");
		System.out.println(objects.getObject1());
		System.out.println(objects.getObject2());
		System.out.println(objects.getObject3());
		
		objects.setObject1("z");
		System.out.println(objects.getObject1());
		System.out.println(objects.toString());
		
		NoGenericMethods objects2 = new NoGenericMethods("b", "c", "a");
		System.out.println(objects2.getObject1());
		System.out.println(objects2.getObject2());
		System.out.println(objects2.getObject3());
		System.out.println(objects2.toString());

	}

}
