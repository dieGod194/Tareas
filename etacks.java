package ColasyStacks;

import java.util.Stack;

public class etacks {
	public int top;
	public int MAX;
	public char stack[];
	
	public etacks(int size) {
		this.stack= new char [size];
		MAX=size;
		top= -1;
		
	}
	
	public char pop() {
		if (top==-1) {
			System.out.println("El stacks esta vacio");
			return 0;
		} else {
			int valor = stack[top];
			top--;
				return (char) valor;
			
			}
		}
	
	public void push(int dato) {
        if (top == (MAX-1)) {
            System.out.println("Está lleno");
        } else {
            top++;
            stack[top] = (char) dato;
        }
    }
	
	public static String invertirConStack(String cadena) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < cadena.length(); i++) {
            stack.push(cadena.charAt(i));
        }
        StringBuilder cadenainvertida = new StringBuilder();
        while (!stack.empty()) {
            cadenainvertida.append(stack.pop());
        }
        return cadenainvertida.toString();
    }
	
	public static boolean palindromo(String input) {
        input = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
	
}