package mx.uam.cua.agenciaautos.DTO;

public class ClientesDTO {
    private Long idclientes;
    private String nombre;
    private String email;
    private String telefono;
    private String password;

    public Long getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Long idclientes) {
        this.idclientes = idclientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
