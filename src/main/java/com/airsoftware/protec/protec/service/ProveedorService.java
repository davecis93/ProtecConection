package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.Provider;
import com.airsoftware.protec.protec.model.request.ProveedorDTO;
import com.airsoftware.protec.protec.model.request.ServicioDTO;

public interface ProveedorService {


    Object obtenerDatosProovedor(Long idProveedor);


    //Provider asignarServicioProveedor(ServicioDTO servicioDTO);

}
