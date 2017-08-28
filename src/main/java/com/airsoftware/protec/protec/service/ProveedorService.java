package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.request.ServicioDTO;


public interface ProveedorService {


    Object obtenerDatosProovedor(Long idProveedor);

    Object obtenerDatosProovedor();

    Object asignarServicioProveedor(ServicioDTO servicioDTO);

}
