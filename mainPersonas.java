package ejercicioPersonas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mainPersonas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre de usuario:");
        String usuarioinput = scan.nextLine();
        String rutausuario = "C:\\Users\\Jugge\\Documents\\Eclipse\\UsuariosJuego\\" + usuarioinput + ".txt";
        File usuario = new File(rutausuario);
        if (usuario.exists()) {
            System.out.println("Bienvenido de vuelta " + usuarioinput);
        } else {
            try {
                usuario.createNewFile();
                System.out.println("Bienvenido! " + usuarioinput);
            } catch (IOException e) {
                System.out.println("Error al crear archivo de usuario");
            }
        }

        Persona P1 = new PersonaRandom("Diego");
        Persona P2 = new PersonaRandom("Sara");
        Persona P3 = new PersonaRandom("Andrea");
        Persona P4 = new PersonaRandom("Sugey");
        Persona P5 = new PersonaRandom("Constanza");
        Persona P6 = new PersonaRandom("Monica");
        Persona P7 = new PersonaRandom("Mariana");
        Persona P8 = new PersonaRandom("Ximena");
        Persona P9 = new PersonaRandom("Daniel");
        Persona P10 = new PersonaRandom("Dios");

        ArrayList<Persona> listaPersonas = new ArrayList<>(Arrays.asList(P1, P2, P3, P4, P5, P6, P7, P8, P9, P10));

        System.out.println("Reglas: Tienes 3 preguntas disponibles, en donde solo podras ingresar el numero del atributo que quieres revisar si es Verdadero (recuerda que solo hay 4), despues de cada pregunta se te proporcionara la lista de las personas que cumplen tus condiciones de busqueda");

        int preguntasRestantes = 3;

        while (preguntasRestantes > 0) {
            System.out.println("Que atributo quieres revisar? Lista de personas que cumplen las caracteristicas:");
            for (Persona persona : listaPersonas) {
                System.out.println(persona.getNombre());
            }
            String pregunta = scan.nextLine();
            int numero = Integer.parseInt(pregunta);

            for (int i = listaPersonas.size()-1; i >= 0; i--) {
                if (!listaPersonas.get(i).tieneAtributo(numero)) {
                    listaPersonas.remove(i);
                }
            }
            
            preguntasRestantes--;
        }
        

        System.out.println("Toca adivinar! Lista de personas que cumplen las caracteristicas:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona.getNombre());
        }
        String respuestaFinal = scan.nextLine();
        int numeroAdivinado = Integer.parseInt(respuestaFinal);

            if (numeroAdivinado <= listaPersonas.size() && numeroAdivinado > 0) {
                String nombreAdivinado = listaPersonas.get(numeroAdivinado - 1).getNombre();
                System.out.println("Felicidades, adivinaste que la persona es " + nombreAdivinado);
                try {
                    FileWriter myWriter = new FileWriter(usuario);
                    myWriter.write("Estadísticas: " + usuarioinput);
                    myWriter.write("Adivinanzas exitosa: " + nombreAdivinado);
                    myWriter.close();
                    System.out.println("Estadísticas guardadas exitosamente.");
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al guardar las estadísticas.");
                    e.printStackTrace();
                }

            } else {
                System.out.println("Sigue participando, no has adivinado correctamente.");
            }
        }
    }