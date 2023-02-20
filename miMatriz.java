package matriCes;

public class miMatriz {	

	public int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) { 
		int fila1 = matriz1.length;
	    int n = matriz1[0].length;
	    int columna2 = matriz2[0].length;
	    int[][] matrizError = null;
	    
	    if (fila1==columna2){
	    int[][] matrizR = new int[fila1][columna2];

	    for (int i = 0; i < fila1; i++) {
	        for (int j = 0; j < columna2; j++) {
	            for (int k = 0; k < n; k++) {
	                matrizR[i][j] += matriz1[i][k] * matriz2[k][j];
	            }
	        }
	    }
	    return matrizR;
	} else {
		System.out.println("Las matrices no se pueden multiplicar" + matrizError);
		return matrizError;
	}
	}
	    
	    
	public int[][] transponerMatriz(int[][] matrizTE) {
			int filaT = matrizTE.length;
		    int columnaT = matrizTE[0].length;
	        int[][] matrizTS = new int[columnaT][filaT];

	        for (int i = 0; i < columnaT; i++) {
	            for (int j = 0; j < filaT; j++) {
	                matrizTS[i][j] = matrizTE[j][i];
	            }
	        }

	        return matrizTS;
	    }
	
	public int sumaDiagonal(int [][] matrizSD){
		 	int suma = 0;
		    int fila = matrizSD.length;
		    for (int i = 0; i < fila; i++) {
		        suma += matrizSD[i][i];
		    }
		    return suma;
	}
	
	public int valorMaximo(int [][] matrizVM) {
		int maximo = matrizVM[0][0];
	    for(int i = 0; i < matrizVM.length; i++) {
	        for(int j = 0; j < matrizVM[0].length; j++) {
	            if(matrizVM[i][j] > maximo) {
	                maximo = matrizVM[i][j];
	            }
	        }
	    }
	    return maximo;
	}
	    
	public int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
	    int filas = matriz1.length;
	    int columnas = matriz1[0].length;
	    int[][] matrizSuma = new int[filas][columnas];

	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
	        }
	    }

	    return matrizSuma;
	}
	
	public int[][] escalar(int[][] matriz, int escalar) {
	    int filas = matriz.length;
	    int columnas = matriz[0].length;
	    int[][] resultado = new int[filas][columnas];
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            resultado[i][j] = matriz[i][j] * escalar;
	        }
	    }
	    return resultado;
	}
	
	
}
