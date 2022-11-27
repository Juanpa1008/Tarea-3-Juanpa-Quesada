package random;

/** **/


public class Persona_Ejemplo2 {

    public static String nombre;
    public static int edad;

    public static void imprimirDatos(){
        System.out.println("Nombre: " + Persona_Ejemplo2.nombre + "; Edad: "
                + Persona_Ejemplo2.edad);
    }

    public static void main(String[] args) {
        Persona_Ejemplo2.nombre = "Juan";
        Persona_Ejemplo2.edad = 12;

        Persona_Ejemplo2.imprimirDatos();
    }
}
