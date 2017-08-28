package com.airsoftware.protec.protec.service.impl;

import com.airsoftware.protec.protec.service.ServicioService;
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

import java.util.ArrayList;
import java.util.Arrays;

@Service
@Transactional
public class ServicioServiceImpl implements ServicioService {

    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ServicioServiceImpl.class);

    @Value("http://201.161.41.142/wsRemoto2/")
    public String PROTEC_ENDPOINT;

    @Value("cmVtb3RvOnIzbTB0MCp2Mg==")
    public String PROTEC_SECRET;

    public Object listService() {
        Object response1 = new ArrayList<>();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

            HttpEntity entity = new HttpEntity(headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "obtenerServicios", entity , Object.class );

            response1 =  response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }

    public Object lisrSubService(Long idServicio) {
        Object response1 = new ArrayList<>();

        try{

            logger.info(PROTEC_SECRET);

            RestTemplate restTemplate = new RestTemplate();


            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.set("Authorization", "Basic "+PROTEC_SECRET);
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
            map.add("idServicio", ""+idServicio+"");

            HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

            ResponseEntity<Object> response = restTemplate.postForEntity( PROTEC_ENDPOINT + "obtenerSubservicios", request , Object.class );

            response1 = response.getBody();

        }catch(Exception ex) {
            logger.error("Error al consultar el ws protec.", ex);
        }

        return response1;
    }
}
