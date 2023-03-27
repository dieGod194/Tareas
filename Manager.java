package fibo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Manager {
    public void execute() {
        GeneradorLista Fibo = new GeneradorLista();
        Fibo.GenerarSucc();
        Splitter splitter = new Splitter();
        List<Integer> pares = splitter.getPares();
        List<Integer> impares = splitter.getNones();
        FileWriter writer = null;
        try {
            writer = new FileWriter("pares.txt");
            for (int number : pares) {
                writer.write(number + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer = new FileWriter("impares.txt");
            for (int number : impares) {
                writer.write(number + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}