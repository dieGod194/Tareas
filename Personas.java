package ejercicioPersonas;

abstract class Persona {
    protected String nombre;
    protected boolean atributo1;
    protected boolean atributo2;
    protected boolean atributo3;
    protected boolean atributo4;

    public Persona(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean tieneAtributo1() {
        return atributo1;
    }

    public boolean tieneAtributo2() {
        return atributo2;
    }

    public boolean tieneAtributo3() {
        return atributo3;
    }

    public boolean tieneAtributo4() {
        return atributo4;
    }

    public abstract void generarAtributosAleatorios();
    
    public boolean tieneAtributo(int numero) {
		return false;
	}
}