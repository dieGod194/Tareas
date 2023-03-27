package fibo;

import java.util.ArrayList;
import java.util.List;

public class Splitter {
	
	GeneradorLista Fibo = new GeneradorLista();
	
    public List<Integer> getPares() {
        List<Integer> Pares = new ArrayList<Integer>();
        for (int i = Fibo.Sucesion.size()-1; i>= 0; i--) {
            if (Fibo.Sucesion.get(i) % 2 == 0) {
                Pares.add(Fibo.Sucesion.get(i));
            }
        }
        return Pares;
    }

    public List<Integer> getNones() {
        List<Integer> Nones = new ArrayList<Integer>();
        for (int i = Fibo.Sucesion.size()-1; i>=0; i--) {
            if (Fibo.Sucesion.get(i) % 2 != 0) {
                Nones.add(Fibo.Sucesion.get(i));
            }
        }
        return Nones;
    }
}
