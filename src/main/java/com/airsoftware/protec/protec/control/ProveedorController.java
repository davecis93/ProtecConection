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

    @GetMapping(value = "/proveedor/{id}")
    public ResponseEntity<Object> obtenerDatosProveedor(@PathVariable("id") Long idProveedor){

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(proveedorService.obtenerDatosProovedor(idProveedor));
    }

//    @PostMapping(value = "/proveedor/asignar")
//    public ResponseEntity<Provider> asignarServicioProveedor(@RequestBody ServicioDTO servicioDTO){
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(proveedorService.asignarServicioProveedor(servicioDTO));
//    }
}
