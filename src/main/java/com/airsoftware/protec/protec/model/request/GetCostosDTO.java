package com.airsoftware.protec.protec.model.request;

public class GetCostosDTO {

    private long idProveedor;

    private long idSubServicio;

    private int kilometros;

    public long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public long getIdSubServicio() {
        return idSubServicio;
    }

    public void setIdSubServicio(long idSubServicio) {
        this.idSubServicio = idSubServicio;
    }

    public int getKilometros() {
        return kilometros;
    }

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
}
