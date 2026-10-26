package mx.uam.cua.agenciaautos.DTO;

public class EmpleadoDTO {

    private Long idempleados;
    private String nombre;
    private String puesto;
    private String telefono;
    private String correo;

    public Long getIdempleados() {
        return idempleados;
    }

    public void setIdempleados(Long idempleados) {
        this.idempleados = idempleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
