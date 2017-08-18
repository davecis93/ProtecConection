package com.airsoftware.protec.protec.control;


import com.airsoftware.protec.protec.model.request.ConfirmaContactoDTO;
import com.airsoftware.protec.protec.service.ContactoTerminoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RepositoryRestController
@RequestMapping("/api/v1")
public class ContactoTerminoController {

    @Autowired
    private ContactoTerminoService consultaPlacasContactoTermino;

    @GetMapping(value = "/consultaPlacas/{id}")
    public ResponseEntity<Object> consultaPlacasContactoTermino(@PathVariable Long id){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(consultaPlacasContactoTermino.consultaPlacasContactoTermino(id));
    }

//    @PostMapping(value = "/confirmarcontacto")
//    public ResponseEntity<Object> confirmaContactoTerminoServicio(@RequestBody ConfirmaContactoDTO confirmaContactoDTO){
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(consultaPlacasContactoTermino.confirmaContactoTerminoServicio(confirmaContactoDTO));
//    }

}
