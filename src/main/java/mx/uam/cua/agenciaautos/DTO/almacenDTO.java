package mx.uam.cua.agenciaautos.DTO;

public class almacenDTO {
    private Long idalmacen;
    private String nom_sucursal;
    private String ubicacion;
    private int capacidad;

    public Long getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(Long idalmacen) {

        this.idalmacen = idalmacen;
    }

    public String getNom_sucursal() {
        return nom_sucursal;
    }
    public void setNom_sucursal(String nom_sucursal) {

        this.nom_sucursal = nom_sucursal;
    }
    public String getUbicacion() {

        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {

        this.ubicacion = ubicacion;
    }
    public int getCapacidad() {

        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}
