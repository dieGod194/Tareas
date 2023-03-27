package fibo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneradorLista {
	List<Integer> Sucesion = new ArrayList<Integer>();
	
	public void GenerarSucc() {
		int i = 0;
		int j = 1;
		int h = 0;
			while (h<=1000000) {
				h=i+j;
				i=j;
				j=h;
				Sucesion.add(j);
	 }
	}

}
