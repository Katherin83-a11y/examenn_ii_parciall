public class Cliente {

    private String nombre;
    private String correo;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;

    }

    public String getDatos() {
        return "Nombre" + nombre + "correo" + correo;
    }
}