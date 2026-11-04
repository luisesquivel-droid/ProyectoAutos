package mx.uam.cua.agenciaautos.DTO;

import java.math.BigDecimal;
import mx.uam.cua.agenciaautos.Entity.almacenEntity;

public class VehiculosDTO {
    private Long id_vehiculos;
    private String niv;
    private String num_inventario;
    private String color;
    private String motor;
    private String marca;
    private String modelo;
    private Integer anio;
    private BigDecimal precio_lis;
    private String estado;
    private almacenEntity idalmacen;

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

    public almacenEntity getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(almacenEntity idalmacen) {
        this.idalmacen = idalmacen;
    }
}
