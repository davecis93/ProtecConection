package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.request.ConfirmaContactoDTO;
import com.airsoftware.protec.protec.model.request.ServicioDTO;

import java.io.SerializablePermission;

public interface ContactoTerminoService {

    Object consultaPlacasContactoTermino(Long idOt);

    Object confirmaContactoTerminoServicio(ConfirmaContactoDTO confirmaContactoDTO);

    Object regresarServicioCallCenter(ServicioDTO servicioDTO);
}
