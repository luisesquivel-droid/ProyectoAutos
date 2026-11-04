package mx.uam.cua.agenciaautos.DTO;

import jakarta.annotation.Nonnull;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;

public class CotizacionDTO {
    private Long idcotizacion;
    private String cotizacioncol;
    private LocalDateTime fech_cot;
    private String metodo_pago;
    @NotNull
    private Integer clientes_idclientes;
    @NotNull
    private Integer vehiculos_id_vehiculos;

    public Long getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Long idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public String getCotizacioncol() {
        return cotizacioncol;
    }

    public void setCotizacioncol(String cotizacioncol) {
        this.cotizacioncol = cotizacioncol;
    }

    public LocalDateTime getFech_cot() {
        return fech_cot;
    }

    public void setFech_cot(LocalDateTime fech_cot) {
        this.fech_cot = fech_cot;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Integer getClientes_idclientes() {
        return clientes_idclientes;
    }

    public void setClientes_idclientes(Integer clientes_idclientes) {
        this.clientes_idclientes = clientes_idclientes;
    }

    public Integer getVehiculos_id_vehiculos() {
        return vehiculos_id_vehiculos;
    }

    public void setVehiculos_id_vehiculos(Integer vehiculos_id_vehiculos) {
        this.vehiculos_id_vehiculos = vehiculos_id_vehiculos;
    }
}
