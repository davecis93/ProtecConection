package com.airsoftware.protec.protec.control;


import com.airsoftware.protec.protec.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/api/v1")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;


    @GetMapping(value = "/getServicios")
    public ResponseEntity<Object> getServicios(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(servicioService.listService());
    }

    @GetMapping(value = "/getSubservicios/{idServicio}")
    public ResponseEntity<Object> getSubservicios(@PathVariable Long idServicio){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(servicioService.lisrSubService(idServicio));
    }


}
