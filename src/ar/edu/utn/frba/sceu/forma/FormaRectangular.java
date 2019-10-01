package ar.edu.utn.frba.sceu.forma;

public class FormaRectangular {

		private int base;
		private int altura;
		
		public int getAltura() {
			return altura;
		}
		public void setAltura(int altura) {
			this.altura = altura;
		}
		public int getBase() {
			return base;
		}
		public void setBase(int base) {
			this.base = base;
		}
		
		public int area() {
			return this.base * this.altura;
		}
		public int perimetro() {
			return (this.base + this.altura) * 2;
			
		}
		
		public boolean esCuadrado() {
			return base == altura;
			
			
		}
		
		public boolean esRectangulo() {
			return base > altura;
			
		}
	}


