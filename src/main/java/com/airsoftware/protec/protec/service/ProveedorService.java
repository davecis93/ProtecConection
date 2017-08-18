package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.Class1;
import com.airsoftware.protec.protec.model.request.ProveedorDTO;
import com.airsoftware.protec.protec.model.request.ServicioDTO;

public interface ProveedorService {

    Class1 obtenerDatosProovedor(ProveedorDTO proveedorDTO);

    Class1 asignarServicioProveedor(ServicioDTO servicioDTO);
}
