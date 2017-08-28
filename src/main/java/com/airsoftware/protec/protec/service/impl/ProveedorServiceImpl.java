package com.airsoftware.protec.protec.service.impl;

import com.airsoftware.protec.protec.model.request.ServicioDTO;
import com.airsoftware.protec.protec.service.ProveedorService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by areyna on 2/17/17.
 */
@Service
@Transactional
public class ProveedorServiceImpl implements ProveedorService {

    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ProveedorServiceImpl.class);

    @Value("http://201.161.41.142/wsRemoto2/")
    public String PROTEC_ENDPOINT;

    @Value("cmVtb3RvOnIzbTB0MCp2Mg==")
    public String PROTEC_SECRET;


    public Object obtenerDatosProovedor(Long idProveedor){

        Object response1 = new Object();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("idProveedor", ""+idProveedor+"");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "obtenerDatosProveedor", request , Object.class );

            response1 = response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }

    public Object obtenerDatosProovedor(){

       Object response1 = new ArrayList<>();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            HttpEntity entity = new HttpEntity(headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "ConsultaProveedores", entity , Object.class );

            response1 =  response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }

    public Object asignarServicioProveedor(ServicioDTO servicioDTO){
        Object response1 = new Object();
        try{
            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("idOt", ""+servicioDTO.getIdOt()+"");
            map.add("idProveedor", ""+servicioDTO.getIdProveedor()+"");
            map.add("proveedorContesta", ""+servicioDTO.getProveedorContesta()+"");
            map.add("celularProveedor", ""+servicioDTO.getCelularProveedor()+"");
            map.add("horaAsignacion", ""+servicioDTO.getHoraAsignacion()+"");
            map.add("idRvt", ""+servicioDTO.getIdRvt()+"");
            map.add("idCampania", ""+servicioDTO.getIdCompania()+"");
            map.add("idServicio", ""+servicioDTO.getIdServicio()+"");
            map.add("idSubServicio", ""+servicioDTO.getIdSubServicio()+"");
            map.add("tiempoEncuentro", ""+servicioDTO.getTiempoEncuentro()+"");
            map.add("ip", ""+servicioDTO.getIp()+"");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "AsignaServicioProveedor", request , Object.class );

            response1 = response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }
        return response1;
    }

}
