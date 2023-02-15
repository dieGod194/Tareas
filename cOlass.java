package ColasyStacks;

public class cOlass {
	public char cola[];
	public int max;
	public int tail;
	public int primero; 
    public int size; 
	
	public char delete() {
	    if (tail == 0) { 
	        return '#'; 
	    }
	    
	    char primerchar = cola[0];
	    for (int i = 0; i < (tail - 1); i++) { 
	        cola[i] = cola[i + 1];
	    }
	    tail--; 
	    return primerchar;
	}
	
	
	public MyQueue(int size) {
        this.primero = 0;
        this.tail = 0;
        this.size = size;
        this.cola = new char[size];
    }
	
	public void añadir(char carac) {
        if (tail == size) {
            System.out.println("La cola está llena");
            return;
        }
        cola[tail] = carac;
        tail++;
    }
	public char quitar() {
        if (primero == tail) {
            System.out.println("La cola está vacía");
            return '#';
        }
        char carac1 = cola[primero];
        for (int i = 0; i <(tail-1); i++) {
            cola[i] = cola[i+1];
        }
        tail--;
        return carac1;
    }
	
}
