package EjerciciosExamen_Fila_A.Ejercicio3;

public class Refrigerador implements IArtefacto{

    private String nombre;

    public Refrigerador(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void mostrarInformacion() {
        // TODO Auto-generated method stub
        System.out.println("\n--- PRODUCTO 4 ---");
        System.out.println("Nombre Producto: "+getNombre());
        System.out.println("Precio: "+getPrecio()+"bs\n");
    }
    
}
