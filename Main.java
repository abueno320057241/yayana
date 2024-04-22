//Bueno Vazquez Ariel Jesus
// Clase Humano
class Humano {
    protected String nombre;

    // Constructor
    public Humano(String nombre) {
        this.nombre = nombre;
    }

    // Método sobrecargado
    public void regeneracion() {
        System.out.println("El humano se está regenerando...");
    }

    // Método que puede ser sobreescrito en las clases hijas
    public void poder() {
        System.out.println("Humano normal, sin poderes especiales.");
    }
}

// Clase Metahumano que hereda de Humano
class Metahumano extends Humano {
    // Constructor que llama al constructor de la clase padre
    public Metahumano(String nombre) {
        super(nombre);
    }

    // Sobreescritura del método poder
    @Override
    public void poder() {
        System.out.println("Metahumano con habilidades especiales.");
    }
}

// Clase Superheroe que hereda de Metahumano
class Superheroe extends Metahumano {
    // Constructor que llama al constructor de la clase padre
    public Superheroe(String nombre) {
        super(nombre);
    }

    // Sobrecarga del método regeneracion
    public void regeneracion(int porcentaje) {
        System.out.println("El superhéroe se está regenerando al " + porcentaje + "%.");
    }
}

// Clase principal que contiene el método main
public class Main {
    public static void Main(String[] args) {
        // Creación de un Metahumano
        Humano p1 = new Metahumano("Logan");
        p1.regeneracion();
        p1.poder(); // Este método es heredado y sobreescrito en Metahumano

        // Creación de un Superheroe
        Humano xmen = new Superheroe("Wolverine");
        xmen.regeneracion(); // No se puede realizar esta asignación, ya que el método regeneracion() no está definido en la clase Humano
        xmen.regeneracion(100); // Este método es sobrecargado en Superheroe
        xmen.poder(); // Este método es heredado y sobreescrito en Metahumano y Superheroe
    }
}
