package mx.uam.cua.agenciaautos.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cotizacion")
public class cotizacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcotizacion")
    private Long idclientes;
    @Column(name = "cotizacioncol")
    private  String cotizacioncol;
    @Column(name = "fech_cot")
    private LocalDateTime fechcotizacion;
    @Column(name = "metodo_pago")
    private String metodo_pago;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clientes_idclientes", nullable = false)
    private ClienteEntity cliente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculos_id_vehiculos", nullable = false)
    private VehiculosEntity vehiculos_id_vehiculos;

    public Long getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Long idclientes) {
        this.idclientes = idclientes;
    }

    public String getCotizacioncol() {
        return cotizacioncol;
    }

    public void setCotizacioncol(String cotizacioncol) {
        this.cotizacioncol = cotizacioncol;
    }

    public LocalDateTime getFech_cotizacion() {
        return fechcotizacion;
    }

    public void setFech_cotizacion(LocalDateTime fech_cotizacion) {
        this.fechcotizacion = fech_cotizacion;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }

    public VehiculosEntity getVehiculos_id_vehiculos() {
        return vehiculos_id_vehiculos;
    }

    public void setVehiculos_id_vehiculos(VehiculosEntity vehiculos_id_vehiculos) {
        this.vehiculos_id_vehiculos = vehiculos_id_vehiculos;
    }
}
