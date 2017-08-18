package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.Provider;
import com.airsoftware.protec.protec.model.request.ProveedorDTO;

public interface ProveedorService {

    Provider obtenerDatosProovedor(Long idProveedor);
}
