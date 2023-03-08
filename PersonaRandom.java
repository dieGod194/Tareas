package ejercicioPersonas;

import java.util.Random;

public class PersonaRandom extends Persona {
	public PersonaRandom(String nombre) {
        super(nombre);
        generarAtributosAleatorios();
    }

	
    public void generarAtributosAleatorios() {
        Random rand = new Random();
        atributo1 = rand.nextBoolean();
        atributo2 = rand.nextBoolean();
        atributo3 = rand.nextBoolean();
        atributo4 = rand.nextBoolean();

        while (atributo1 == atributo2 && atributo2 == atributo3 && atributo3 == atributo4) {
            atributo1 = rand.nextBoolean();
            atributo2 = rand.nextBoolean();
            atributo3 = rand.nextBoolean();
            atributo4 = rand.nextBoolean();
        }

        int numAtributosVerdaderos=0;
        if (atributo1) numAtributosVerdaderos++;
        if (atributo2) numAtributosVerdaderos++;
        if (atributo3) numAtributosVerdaderos++;
        if (atributo4) numAtributosVerdaderos++;
        while (numAtributosVerdaderos < 2) {
            int atributoAleatorio = rand.nextInt(4) + 1;
            switch (atributoAleatorio) {
                case 1:
                    atributo1 = true;
                    break;
                case 2:
                    atributo2 = true;
                    break;
                case 3:
                    atributo3 = true;
                    break;
                case 4:
                    atributo4 = true;
                    break;
            }
            numAtributosVerdaderos++;
        }
    }
    
    public boolean tieneAtributo(int numero) {
        switch (numero) {
            case 1:
                return atributo1;
            case 2:
                return atributo2;
            case 3:
                return atributo3;
            case 4:
                return atributo4;
            default:
                return false;
        }
    }
}
