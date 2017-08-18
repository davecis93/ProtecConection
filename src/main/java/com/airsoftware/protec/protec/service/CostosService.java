package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.Class1;
import com.airsoftware.protec.protec.model.request.CostosDTO;
import com.airsoftware.protec.protec.model.request.GetCostosDTO;

public interface CostosService {

    Class1 obtenerCostos (GetCostosDTO getCostosDTO);

    Class1 asignarCostos (CostosDTO costosDTO);

}
