package mx.uam.cua.agenciaautos.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "vehiculos")
public class VehiculosEntity {
    @Id
    @GeneratedValue
    @Column(name = "id_vehiculos")
    private Long id_vehiculos;
    @Column(name = "niv")
    private String niv;
    @Column(name = "num_inventario")
    private String num_inventario;
    @Column(name = "color")
    private String color;
    @Column(name = "motor")
    private String motor;
    @Column(name = "marca")
    private String marca;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "precio_lis")
    private BigDecimal precio_lis;
    @Column(name = "estado")
    private String estado;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "almacen_idalmacen", nullable = false)
    private  almacenEntity almacen_idalmacen;

    public Long getId_vehiculos() {
        return id_vehiculos;
    }

    public void setId_vehiculos(Long id_vehiculos) {
        this.id_vehiculos = id_vehiculos;
    }

    public String getNiv() {
        return niv;
    }

    public void setNiv(String niv) {
        this.niv = niv;
    }

    public String getNum_inventario() {
        return num_inventario;
    }

    public void setNum_inventario(String num_inventario) {
        this.num_inventario = num_inventario;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public BigDecimal getPrecio_lis() {
        return precio_lis;
    }

    public void setPrecio_lis(BigDecimal precio_lis) {
        this.precio_lis = precio_lis;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public almacenEntity getAlmacen_idalmacen() {
        return almacen_idalmacen;
    }

    public void setAlmacen_idalmacen(almacenEntity almacen_idalmacen) {
        this.almacen_idalmacen = almacen_idalmacen;
    }
}
