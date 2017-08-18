package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.request.ConfirmaContactoDTO;

public interface ContactoTerminoService {

    Object consultaPlacasContactoTermino(Long idOt);

    Object confirmaContactoTerminoServicio(ConfirmaContactoDTO confirmaContactoDTO);
}
