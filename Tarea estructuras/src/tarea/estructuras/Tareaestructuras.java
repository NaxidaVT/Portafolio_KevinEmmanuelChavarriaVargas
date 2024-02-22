package tarea.estructuras;

public class Tareaestructuras {

    private final int[] cola;
    private int size;
    private final int capacity;

    public Tareaestructuras(int capacity) {
        this.capacity = capacity;
        cola = new int[capacity];
        size = 0;
    }

    public void agregar(int elemento) {
        if (size < capacity) {
            cola[size++] = elemento;
        } else {
            System.out.println("La cola esta llena no se puede agregar mas asi que no chingues");
        }
    }

    public boolean encuentra(int x) {
        for (int i = 0; i < size; i++) {
            if (cola[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Tareaestructuras buscador = new Tareaestructuras(5);
        buscador.agregar(5);
        buscador.agregar(10);
        buscador.agregar(15);

        System.out.println("Se encuentra el numero 10" + buscador.encuentra(10));
        System.out.println("Se encuentra el numero 20" + buscador.encuentra(20));
    }
}
