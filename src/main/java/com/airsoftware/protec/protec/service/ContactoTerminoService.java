package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.request.ConfirmaContactoDTO;

public interface ContactoTerminoService {

    ConfirmaContactoDTO consultaPlacasContactoTermino(long idOt);

    ConfirmaContactoDTO confirmaContactoTerminoServicio(ConfirmaContactoDTO confirmaContactoDTO);
}
