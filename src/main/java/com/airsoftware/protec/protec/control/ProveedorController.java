package com.airsoftware.protec.protec.control;


import com.airsoftware.protec.protec.model.Class1;
import com.airsoftware.protec.protec.model.request.ProveedorDTO;
import com.airsoftware.protec.protec.model.request.ServicioDTO;
import com.airsoftware.protec.protec.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/api/v1")
public class ProveedorController {

    private ProveedorService proveedorService;

    @PostMapping(value = "/proveedor/obtener")
    public ResponseEntity<Class1> obtenerDatosProveedor(@RequestBody ProveedorDTO proveedorDTO){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(proveedorService.obtenerDatosProovedor(proveedorDTO));
    }

    @PostMapping(value = "/proveedor/asignar")
    public ResponseEntity<Class1> asignarServicioProveedor(@RequestBody ServicioDTO servicioDTO){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(proveedorService.asignarServicioProveedor(servicioDTO));
    }
}
