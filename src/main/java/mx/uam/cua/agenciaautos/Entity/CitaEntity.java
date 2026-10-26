package mx.uam.cua.agenciaautos.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "citas")
public class CitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long idCita;

    @Column(name = "fech_cita", nullable = false)
    private LocalDateTime fechCita;

    @Column(name = "estado_cita", nullable = false)
    private String estadoCita; // Ajustado a String porque en SQL es VARCHAR(45)

    @Column(name = "fech_venta")
    private LocalDateTime fechVenta; // Ajustado a LocalDateTime porque en SQL es DATETIME

    @Column(name = "clientes_idclientes", nullable = false)
    private Long clientesIdclientes;

    @Column(name = "empleados_idempleados", nullable = false)
    private Long empleadosIdempleados;

    @Column(name = "vehiculos_id_vehiculos", nullable = false)
    private Long vehiculosIdVehiculos;

    @Column(name = "calificaciones_idcalificaciones")
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