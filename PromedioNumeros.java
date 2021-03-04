public class PromedioNumeros{
	public static void main(String[] args) {
		byte numeroa=2;
		char numerob=5;
		short numeroc=12;
		int numerod=32;
		float numeroe=12.34f;

		System.out.print("El número 1 es: "+numeroa);
		System.out.print(", El número 2 es: "+numerob);
		System.out.print(", El número 3 es: "+numeroc);
		System.out.print(", El número 4 es: "+numerod);
		System.out.println(", El número 5 es: "+numeroe);

		float promedio=(numeroa+numerob+numeroc+numerod+numeroe)/5;

		System.out.println("El promedio es de "+promedio);
	}
}