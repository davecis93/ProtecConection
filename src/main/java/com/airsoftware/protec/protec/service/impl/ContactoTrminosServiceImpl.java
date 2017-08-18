package com.airsoftware.protec.protec.service.impl;

import com.airsoftware.protec.protec.model.request.ConfirmaContactoDTO;
import com.airsoftware.protec.protec.service.ContactoTerminoService;
import com.airsoftware.protec.protec.service.ProveedorService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created by areyna on 2/17/17.
 */
@Service
@Transactional
public class ContactoTrminosServiceImpl implements ContactoTerminoService {

    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ContactoTrminosServiceImpl.class);

    @Value("http://201.161.41.142/wsRemoto2/")
    public String PROTEC_ENDPOINT;

    @Value("cmVtb3RvOnIzbTB0MCp2Mg==")
    public String PROTEC_SECRET;


    public Object consultaPlacasContactoTermino(Long idOt){
        Object response1 = new Object();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("idOt", ""+idOt+"");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "ConsultaPlacasContactoTermino/", request , Object.class );


            System.out.println(response.getBody().toString());

            response1 = response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }

    public Object confirmaContactoTerminoServicio(ConfirmaContactoDTO confirmaContactoDTO){
        Object response1 = new Object();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("idOt", ""+confirmaContactoDTO.getIdOt()+"");
            map.add("placas", confirmaContactoDTO.getPlacas());
            map.add("horaContacto", confirmaContactoDTO.getHoraContacto());
            map.add("horaTermino", confirmaContactoDTO.getHoraTermino());
            map.add("comentarios", confirmaContactoDTO.getComentarios());
            map.add("idRvt", ""+confirmaContactoDTO.getIdRvt()+"");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "ConfirmaContactoTerminoServicio/", request , Object.class );

            System.out.println(response.getBody().toString());

            response1 = response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }

}
