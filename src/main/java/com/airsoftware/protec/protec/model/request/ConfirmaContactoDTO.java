package com.airsoftware.protec.protec.model.request;

public class ConfirmaContactoDTO {

    private long idOt;

    private String placas;

    private String horaContacto;

    private String horaTermino;

    private String comentarios;

    private long idRvt;

    public long getIdOt() {
        return idOt;
    }

    public void setIdOt(long idOt) {
        this.idOt = idOt;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getHoraContacto() {
        return horaContacto;
    }

    public void setHoraContacto(String horaContacto) {
        this.horaContacto = horaContacto;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public long getIdRvt() {
        return idRvt;
    }

    public void setIdRvt(long idRvt) {
        this.idRvt = idRvt;
    }
}
