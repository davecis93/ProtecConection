package com.airsoftware.protec.protec.model.request;

public class ServicioDTO {

    private long idOt;

    private long idProveedor;

    private String proveedorContesta;

    private long celularProveedor;

    private String horaAsignacion;

    private long idRvt;

    private long idCompania;

    private long idServicio;

    private long idSubServicio;

    private String tiempoEncuentro;

    private String ip;

    public long getIdOt() {
        return idOt;
    }

    public void setIdOt(long idOt) {
        this.idOt = idOt;
    }

    public long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedorContesta() {
        return proveedorContesta;
    }

    public void setProveedorContesta(String proveedorContesta) {
        this.proveedorContesta = proveedorContesta;
    }

    public long getCelularProveedor() {
        return celularProveedor;
    }

    public void setCelularProveedor(long celularProveedor) {
        this.celularProveedor = celularProveedor;
    }

    public String getHoraAsignacion() {
        return horaAsignacion;
    }

    public void setHoraAsignacion(String horaAsignacion) {
        this.horaAsignacion = horaAsignacion;
    }

    public long getIdRvt() {
        return idRvt;
    }

    public void setIdRvt(long idRvt) {
        this.idRvt = idRvt;
    }

    public long getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(long idCompania) {
        this.idCompania = idCompania;
    }

    public long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(long idServicio) {
        this.idServicio = idServicio;
    }

    public long getIdSubServicio() {
        return idSubServicio;
    }

    public void setIdSubServicio(long idSubServicio) {
        this.idSubServicio = idSubServicio;
    }

    public String getTiempoEncuentro() {
        return tiempoEncuentro;
    }

    public void setTiempoEncuentro(String tiempoEncuentro) {
        this.tiempoEncuentro = tiempoEncuentro;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
