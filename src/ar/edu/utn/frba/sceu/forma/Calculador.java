package ar.edu.utn.frba.sceu.forma;

public class Calculador {

	public static void main(String[] args) {
		FormaRectangular forma1 = new FormaRectangular();
		
		forma1.setAltura(12);
		forma1.setBase(10);
		
		System.out.println("Area es: " + forma1.area());
		System.out.println("El perimetro es: " + forma1.perimetro());
		System.out.println("El resultado es: " + forma1.esCuadrado());
		
		FormaRectangular forma2 = new FormaRectangular();
		
		forma2.setAltura(8);
		forma2.setBase(16);
		
		System.out.println("El area es: " + forma2.area());
		System.out.println("El resultado es: " + forma2.esRectangulo());
		
		int area1 = forma1.area();
		int area2 = forma2.area();
		
		if(area1 > area2) {
			System.out.println("Forma 1 es mas grande");
		} else if (area2 > area1) {
			System.out.println("Forma 2 es mas grande");
		} else {
			System.out.println("Las formas son iguales");
			
		}
	}
	
	

}
