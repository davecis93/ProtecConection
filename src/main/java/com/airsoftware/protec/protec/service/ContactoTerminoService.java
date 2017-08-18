package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.Class1;
import com.airsoftware.protec.protec.model.request.ConfirmaContactoDTO;

public interface ContactoTerminoService {

    Class1 consultaPlacasContactoTermino(long idOt);

    Class1 confirmaContactoTerminoServicio(ConfirmaContactoDTO confirmaContactoDTO);
}
