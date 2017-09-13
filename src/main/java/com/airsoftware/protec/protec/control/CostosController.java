package com.airsoftware.protec.protec.control;


import com.airsoftware.protec.protec.model.request.CostosDTO;
import com.airsoftware.protec.protec.model.request.GetCostosDTO;
import com.airsoftware.protec.protec.service.CostosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/api/v1")
public class CostosController {

    @Autowired
    private CostosService costosService;

    @PostMapping(value = "/costos/obtener")
    public ResponseEntity<Object> obtenerCostos(@RequestBody GetCostosDTO getCostosDTO){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(costosService.obtenerCostos(getCostosDTO));
    }

    @PostMapping(value = "/costos/obtenerPorPlano")
    public ResponseEntity<Object> obtenerCostosPorPlano(@RequestBody GetCostosDTO getCostosDTO){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(costosService.obtenerCostosPorPlano(getCostosDTO));
    }

    @PostMapping(value = "/costos/asignar")
    public ResponseEntity<Object> asignarCostos(@RequestBody CostosDTO costosDTO){
        System.out.println(costosDTO.getC1());
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(costosService.asignarCostos(costosDTO));
    }
}
