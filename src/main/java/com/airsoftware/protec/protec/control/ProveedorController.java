package com.airsoftware.protec.protec.control;


import com.airsoftware.protec.protec.model.request.ServicioDTO;
import com.airsoftware.protec.protec.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RepositoryRestController
@RequestMapping("/api/v1")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping(value = "/proveedor/{id}")
    public ResponseEntity<Object> obtenerDatosProveedor(@PathVariable("id") Long idProveedor){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(proveedorService.obtenerDatosProovedor(idProveedor));
    }

    @GetMapping(value = "/proveedores")
    public ResponseEntity<Object> obtenerDatosProveedores(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(proveedorService.obtenerDatosProovedor());
    }

    @PostMapping(value = "/proveedor/asignar")
    public ResponseEntity<Object> asignarServicioProveedor(@RequestBody ServicioDTO servicioDTO){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(proveedorService.asignarServicioProveedor(servicioDTO));
    }
}
