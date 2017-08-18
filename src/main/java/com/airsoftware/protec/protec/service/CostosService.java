package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.request.CostosDTO;
import com.airsoftware.protec.protec.model.request.GetCostosDTO;

public interface CostosService {

    CostosDTO obtenerCostos (GetCostosDTO getCostosDTO);

    CostosDTO asignarCostos (CostosDTO costosDTO);

}
