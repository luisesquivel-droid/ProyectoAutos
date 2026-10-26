package mx.uam.cua.agenciaautos.DTO;

import java.time.LocalDateTime;

public class CitaDTO {

    private Long idCita;
    private LocalDateTime fechCita;
    private String estadoCita;
    private LocalDateTime fechVenta;
    private Long clientesIdclientes;
    private Long empleadosIdempleados;
    private Long vehiculosIdVehiculos;
    private Long calificacionesIdcalificaciones;

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public LocalDateTime getFechCita() {
        return fechCita;
    }

    public void setFechCita(LocalDateTime fechCita) {
        this.fechCita = fechCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public LocalDateTime getFechVenta() {
        return fechVenta;
    }

    public void setFechVenta(LocalDateTime fechVenta) {
        this.fechVenta = fechVenta;
    }

    public Long getClientesIdclientes() {
        return clientesIdclientes;
    }

    public void setClientesIdclientes(Long clientesIdclientes) {
        this.clientesIdclientes = clientesIdclientes;
    }

    public Long getEmpleadosIdempleados() {
        return empleadosIdempleados;
    }

    public void setEmpleadosIdempleados(Long empleadosIdempleados) {
        this.empleadosIdempleados = empleadosIdempleados;
    }

    public Long getVehiculosIdVehiculos() {
        return vehiculosIdVehiculos;
    }

    public void setVehiculosIdVehiculos(Long vehiculosIdVehiculos) {
        this.vehiculosIdVehiculos = vehiculosIdVehiculos;
    }

    public Long getCalificacionesIdcalificaciones() {
        return calificacionesIdcalificaciones;
    }

    public void setCalificacionesIdcalificaciones(Long calificacionesIdcalificaciones) {
        this.calificacionesIdcalificaciones = calificacionesIdcalificaciones;
    }
}
