package com.airsoftware.protec.protec.control;


import com.airsoftware.protec.protec.model.request.ConfirmaContactoDTO;
import com.airsoftware.protec.protec.service.ContactoTerminoService;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RepositoryRestController
@RequestMapping("/api/v1")
public class ContactoTerminoController {

    ContactoTerminoService consultaPlacasContactoTermino;

    @GetMapping(value = "/consultaPlacas/{idOt}")
    public ResponseEntity<ConfirmaContactoDTO> consultaPlacasContactoTermino(@PathVariable long idOt){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(consultaPlacasContactoTermino.consultaPlacasContactoTermino(idOt));
    }

    @PostMapping(value = "/confirmarcontacto")
    public ResponseEntity<ConfirmaContactoDTO> confirmaContactoTerminoServicio(@RequestBody ConfirmaContactoDTO confirmaContactoDTO){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(consultaPlacasContactoTermino.confirmaContactoTerminoServicio(confirmaContactoDTO));
    }

}
