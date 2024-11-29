
public class PasoReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Ana";
        cambiarNombre(persona);
        System.out.println("Nombre después de cambiarNombre: " + persona.nombre);  // Debería imprimir María
    }

    public static void cambiarNombre(Persona persona) {
        persona.nombre = "María";
    }
}

class Persona {
    String nombre;
}