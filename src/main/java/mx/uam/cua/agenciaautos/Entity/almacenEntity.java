
package mx.uam.cua.agenciaautos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "almacen")
public class almacenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idalmacen")
    private Long idalmacen;

    @Column(name = "nom_sucursal")
    private String nom_sucursal;

    @Column(name = "ubicacion")
    private String ubicacion;

    @Column(name = "capacidad")
    private Integer capacidad;

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

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
