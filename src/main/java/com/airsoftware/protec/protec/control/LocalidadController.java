package com.airsoftware.protec.protec.control;


import com.airsoftware.protec.protec.service.LocalidadService;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/api/v1")
public class LocalidadController {

    @Autowired
    private LocalidadService localidadService;

    @GetMapping(value = "/municipios/{id}")
    public ResponseEntity<Object> obtenerDatosProveedor(@PathVariable("id") Long idEstado){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(localidadService.obtenerMunicipios(idEstado));
    }

    @GetMapping(value = "/estados")
    public ResponseEntity<Object> obtenerDatosProveedores(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(localidadService.obtenerEstados());
    }
}
