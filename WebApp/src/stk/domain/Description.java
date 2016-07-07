package stk.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by diego on 01/07/2016.
 */
public class Description implements Serializable {

    private int descId;
    private String termino;
    private String estado;
    private String descriptionType;
    private Date fechaCreacion;
    private String sensibilidad;
    private String usuario;


    public Description() {
    }

    public Description(int descId, String termino, String estado, String descriptionType, Date fechaCreacion, String sensibilidad, String usuario) {
        this.descId = descId;
        this.termino = termino;
        this.estado = estado;
        this.descriptionType = descriptionType;
        this.fechaCreacion = fechaCreacion;
        this.sensibilidad = sensibilidad;
        this.usuario = usuario;
    }

    public int getDescId() {
        return descId;
    }

    public void setDescId(int descId) {
        this.descId = descId;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getdescriptionType() {
        return descriptionType;
    }

    public void setdescriptionType(String descriptionType) {
        this.descriptionType = descriptionType;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(String sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
