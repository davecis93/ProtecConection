package com.airsoftware.protec.protec.service;

import com.airsoftware.protec.protec.model.request.CostosDTO;
import com.airsoftware.protec.protec.model.request.GetCostosDTO;

public interface CostosService {

    Object obtenerCostos (GetCostosDTO getCostosDTO);

    Object obtenerCostosPorPlano (GetCostosDTO getCostosDTO);

    Object asignarCostos (CostosDTO costosDTO);

}
