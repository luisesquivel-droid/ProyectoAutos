
package mx.uam.cua.agenciaautos.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "calificaciones")
public class calificacionesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcalificaciones")
    private int idcalificaciones;

    @Column(name = "puntuacion")
    private int puntuacion;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "calificacionescol")
    private String calificacionescol;

    public int getIdcalificaciones() {
        return idcalificaciones;
    }

    public void setIdcalificaciones(int idcalificaciones) {
        this.idcalificaciones = idcalificaciones;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCalificacionescol() {
        return calificacionescol;
    }

    public void setCalificacionescol(String calificacionescol) {
        this.calificacionescol = calificacionescol;
    }
}
