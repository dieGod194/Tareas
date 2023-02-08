package examenParcialUno;

public class Examen {
	public int contador=0;
	
		public void fizz() {
	
			while (contador<100){
		
				contador= contador+1;
		
				int div15=contador%15;
				int div3=contador%3;
				int div5=contador%5;
		
				if (div15==0) {
					System.out.println("FizzBuzz");
				}else if (div3==0) {
					System.out.println("Fizz");
				}else if (div5==0) {
					System.out.println("Buzz");
				} else {
					System.out.println(contador);
				}
			}
		}
		
		public String primeraMayuscula (String oracionmayus) {
			return oracionmayus.substring(0, 1).toUpperCase() + oracionmayus.substring(1);
		}
		
		public String voltear(String oracionvolt) {
		    return new StringBuilder(oracionvolt).reverse().toString();
		}
		
		public String vocalesMayuscula(String frase) {
			String nuevafrase = frase.replace("a","A");
			nuevafrase = nuevafrase.replace("e","E");
			nuevafrase = nuevafrase.replace("i","I");
			nuevafrase = nuevafrase.replace("o","O");
			nuevafrase = nuevafrase.replace("u","U");
			 return nuevafrase;
		}
		
		public boolean palindromo(String frasepalin) {
			String SinEspacios = frasepalin.replaceAll("\\s", "");
	        StringBuilder cadenaInvertida = new StringBuilder(SinEspacios);
	        return SinEspacios.equalsIgnoreCase(cadenaInvertida.reverse().toString());
		}
		
}