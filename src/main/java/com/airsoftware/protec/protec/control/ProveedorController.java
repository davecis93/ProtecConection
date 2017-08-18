package com.airsoftware.protec.protec.control;


import com.airsoftware.protec.protec.model.Provider;
import com.airsoftware.protec.protec.model.request.ProveedorDTO;
import com.airsoftware.protec.protec.model.request.ServicioDTO;
import com.airsoftware.protec.protec.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RepositoryRestController
@RequestMapping("/api/v1")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

<<<<<<< HEAD
    @GetMapping(value = "/proveedor/{id}")
    public ResponseEntity<Provider> obtenerDatosProveedor(@PathVariable("id") Long idProveedor){
=======
    @PostMapping(value = "/proveedor/obtener")
    public ResponseEntity<Class1> obtenerDatosProveedor(@RequestBody ProveedorDTO proveedorDTO){
>>>>>>> e7009f97904a01f0a5454f9f5ddc1be83281e089
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(proveedorService.obtenerDatosProovedor(idProveedor));
    }

    @PostMapping(value = "/proveedor/asignar")
    public ResponseEntity<Class1> asignarServicioProveedor(@RequestBody ServicioDTO servicioDTO){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(proveedorService.asignarServicioProveedor(servicioDTO));
    }
}
