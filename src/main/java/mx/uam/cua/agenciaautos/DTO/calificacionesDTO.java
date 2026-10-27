
package mx.uam.cua.agenciaautos.DTO;

public class calificacionesDTO {

    private int idcalificaciones;
    private int puntuacion;
    private String comentario;
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
